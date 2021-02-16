/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.iwebservices;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@WebService
public interface ClienteWebService {

    @WebMethod
    public List<Cliente> findAll();

    @WebMethod
    public Cliente finById(Integer idCciente);

    @WebMethod
    public void save(Cliente cliente);

    @WebMethod
    public void update(Cliente cliente);

    @WebMethod
    public void delete(Cliente cliente);
}
