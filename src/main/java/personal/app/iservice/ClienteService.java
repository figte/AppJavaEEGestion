/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.iservice;

import java.util.List;
import javax.ejb.Local;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@Local
public interface ClienteService {
    
    public List<Cliente> findAll();
    
    public Cliente finById(Integer idCciente);
    
    public void save(Cliente cliente);
    
    public void update(Cliente cliente);
    
    public void delete(Cliente cliente);
}
