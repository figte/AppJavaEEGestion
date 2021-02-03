/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import personal.app.dao.ClienteDaoImp;
import personal.app.idao.ClienteDao;
import personal.app.iservice.ClienteService;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@Stateless
public class ClienteServiceImpl implements ClienteService{

    @EJB
    ClienteDao dao;
    
    @Override
    public List<Cliente> findAll() {
        return dao.findAll();
    }

    @Override
    public Cliente finById(Integer idInteger) {
        
       return dao.finById(idInteger);
        
    }

    @Override
    public void save(Cliente cliente) {
        dao.save(cliente);
    }

    @Override
    public void update(Cliente cliente) {
        dao.update(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        dao.delete(cliente);
    }
    
}
