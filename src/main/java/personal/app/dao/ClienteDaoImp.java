/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import personal.app.idao.ClienteDao;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@Stateless
public class ClienteDaoImp implements ClienteDao {

    @PersistenceContext(unitName = "oracle")
    EntityManager em;

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = em.createNamedQuery("Cliente.findAll").getResultList();
        return clientes;
    }

    @Override
    public Cliente finById(Integer idCliente) {
        Cliente c = em.find(Cliente.class, idCliente);
        return c;
    }

    @Override
    public void save(Cliente cliente) {
        try {
            em.persist(cliente);
        } catch (ConstraintViolationException e) {
            // Aqui tira los errores de constraint
            for (ConstraintViolation actual : e.getConstraintViolations()) {
                System.out.println("PROBLEMA:"+ actual.toString());
            }
        }
    }

    @Override
    public void update(Cliente cliente) {
        try {
            em.merge(cliente);
        } catch (ConstraintViolationException e) {
            // Aqui tira los errores de constraint
            for (ConstraintViolation actual : e.getConstraintViolations()) {
                System.out.println("PROBLEMA:"+ actual.toString());
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Cliente c = em.find(Cliente.class, cliente.getId());
        em.remove(c);
    }

}
