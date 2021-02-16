/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.services;

import javax.ejb.EJB;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import personal.app.iservice.ClienteService;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
public class ClienteServiceTesting {
    
    @EJB
    private ClienteService cliente_service;
    
    public ClienteServiceTesting() {
    }

   
    //listando registros de clinetes
     @Test
     public void listar() {
         
         for (Cliente cliente : cliente_service.findAll()) {
             System.out.println("---------------------------------");
             System.out.println("ID: "+cliente.getId());
             System.out.println("NOMBRE: "+cliente.getNombre());
             System.out.println("DIRECCION: "+cliente.getDireccion());
             System.out.println("EMAIL: "+cliente.getEmail());
             System.out.println("TELEFONO: "+cliente.getTelefono());
             System.out.println("---------------------------------");
         }
     }
}
