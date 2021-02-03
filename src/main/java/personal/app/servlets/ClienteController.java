/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import personal.app.iservice.ClienteService;
import personal.app.model.Cliente;
import personal.app.model.Cliente_;

/**
 *
 * @author FIGTE
 */
@WebServlet(name = "ClienteController", urlPatterns = {"/cliente"})
public class ClienteController extends HttpServlet {

    @Inject
    ClienteService clienteService;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
        String action = request.getParameter("action");
        if(action!=null){
        switch(action){
            case "nuevo":{
                enrrutar("/clientes/nuevo.jsp", null, request, response);
                break;
            }
            case "guardar":{
                Cliente cliente=new Cliente();
                cliente.setNombre(request.getParameter("nombre").toString());
                cliente.setDireccion(request.getParameter("direccion").toString());
                cliente.setDui(new BigInteger(request.getParameter("dui")));
                cliente.setTelefono(request.getParameter("telefono"));
                cliente.setEmail(request.getParameter("email"));
                
                clienteService.save(cliente);
                
                index(request, response);
                
                break;
            }
            case "editar":{
                Integer id=Integer.parseInt(request.getParameter("id"));  
                Cliente cliente=clienteService.finById(id);
                
                Map<String,Object> parametros=new HashMap<>();
                parametros.put(new String("item"), cliente);
                
                enrrutar("/clientes/editar.jsp", parametros, request, response);
         
                
                break;
            }
            case "modificar":{
                Integer id=Integer.parseInt(request.getParameter("id"));  
                Cliente cliente=clienteService.finById(id);
                cliente.setNombre(request.getParameter("nombre").toString());
                cliente.setDireccion(request.getParameter("direccion").toString());
                cliente.setDui(new BigInteger(request.getParameter("dui")));
                cliente.setTelefono(request.getParameter("telefono"));
                cliente.setEmail(request.getParameter("email"));
                
                clienteService.update(cliente);
                index(request, response);
                
                break;
            }
            case "eliminar":{
                Integer id=Integer.parseInt(request.getParameter("id"));  
                Cliente cliente=clienteService.finById(id);
                clienteService.delete(cliente);
                index(request, response);
                break;
            }
           default:{
                
                break;
            }
        }
       }else{
            index(request, response);
       }
    }

    protected void index(HttpServletRequest request, HttpServletResponse response){
         Map<String,Object> parametros=new HashMap<>();
         parametros.put(new String("lista"), clienteService.findAll());
         
         enrrutar("/clientes/index.jsp",parametros, request, response);
    }
    
    protected void enrrutar(String ruta,Map<String,Object> parametros, HttpServletRequest request, HttpServletResponse response){
        try {
            RequestDispatcher rd = request.getRequestDispatcher(ruta);
            if(parametros!=null){
                for (Map.Entry<String, Object> item : parametros.entrySet()) {
                    Object key = item.getKey();
                    Object val = item.getValue();
                    
                    request.setAttribute(key.toString(), val);
                }
            }
            rd.forward(request, response);
        } catch (ServletException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
