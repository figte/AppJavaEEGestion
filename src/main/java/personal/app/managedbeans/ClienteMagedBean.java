/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal.app.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author FIGTE
 */
@ManagedBean
@RequestScoped
public class ClienteMagedBean {

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
