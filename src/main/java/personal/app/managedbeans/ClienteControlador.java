/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.managedbeans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.RowEditEvent;
import personal.app.iservice.ClienteService;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@ManagedBean
@RequestScoped
public class ClienteControlador {

    @EJB
    private ClienteService clienteService;

    List<Cliente> clientes;

    String test = "Texto";

    public ClienteControlador() {
    }

    @PostConstruct
    public void inicializar() {
        this.clientes = clienteService.findAll();
    }

    public void editListener(RowEditEvent event) {
        Cliente cliente = (Cliente) event.getObject();
        clienteService.update(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}
