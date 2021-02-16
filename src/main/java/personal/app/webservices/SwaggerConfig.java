/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.webservices;

import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import personal.app.webservices.ClienteServiceRS;

/**
 *
 * @author FIGTE
 */
@ApplicationPath("/api")
@SwaggerDefinition (info = @Info (
                        title = "Example Service",
                        description = "A simple example of apiee",
                        version = "1.0.0",
                        contact = @Contact (
                            name = "Phillip Kruger",
                            email = "apiee@phillip-kruger.com",
                            url = "http://phillip-kruger.com"
                        )
                    )
                )
public class SwaggerConfig extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(ClienteServiceRS.class);
        classes.add(com.github.phillipkruger.apiee.ApieeService.class);
        return classes;
    }
}
