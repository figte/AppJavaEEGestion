/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.managedbeans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


/**
 *
 * @author FIGTE
 */
@Named(value = "cliente")
@RequestScoped
public class ClienteMagedBean implements Serializable{

    
    private static final long serialVersionUID = 1L;
     
    String prueba = "test";

    /**
     * Creates a new instance of ClienteMagedBean
     */
    public ClienteMagedBean() {
    }

    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

}
