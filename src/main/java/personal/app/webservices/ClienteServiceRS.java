/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.webservices;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import personal.app.idao.ClienteDao;
import personal.app.model.Cliente;

/**
 *
 * @author FIGTE
 */
@Path("/clientes")
@Api(value = "clientes")
@Stateless

public class ClienteServiceRS {

    @EJB
    private ClienteDao dao;

    @GET
    @Produces(value = {MediaType.APPLICATION_JSON})
    @Consumes(value = {MediaType.APPLICATION_JSON})
    @ApiOperation(value = "Fetch all clientes")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Success")
    })
    public List<Cliente> findAll() {
        return dao.findAll();
    }

}
