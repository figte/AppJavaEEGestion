/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.webservices;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import personal.app.idao.ClienteDao;
import personal.app.iwebservices.ClienteWebService;
import personal.app.iwebservices.ClienteWebService;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@WebService(endpointInterface = "personal.app.iwebservices.ClienteWebService")
@Stateless
public class ClienteWebServiceImpl implements ClienteWebService{
     @EJB
    ClienteDao dao;
     
    @Override
    public List<Cliente> findAll() {
         return dao.findAll();
    }

    @Override
    public Cliente finById(Integer idCciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
