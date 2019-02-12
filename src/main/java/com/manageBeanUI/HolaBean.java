package com.manageBeanUI;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="holaBean")
@SessionScoped
public class HolaBean implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;

    public void  HolaMundo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }     
}