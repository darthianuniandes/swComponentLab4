/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.entities.ClienteTop;
import com.losalpes.servicios.IServicioReportesLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Asesoftware
 */
@ManagedBean
@ViewScoped
public class TopClientesBean implements Serializable {
    @EJB
    private IServicioReportesLocal servicioVentas;
    
    private String usuario;
    
    private List<ClienteTop> ventas;
    
    @PostConstruct
    public void init() {
        ventas = servicioVentas.darTopCompradores();
        System.out.println("TAMAÑO LISTA EN PANTALLA:"+ventas.size());
        System.err.println("ISM:" + ventas.get(0).getLogin());
        System.err.println("ISM:" + ventas.get(0).getNombreCompleto());
        System.err.println("ISM:" + ventas.get(0).getCompras());
        System.err.println("ISM:" + ventas.get(0).getDinero());
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<ClienteTop> getVentas() {
        return ventas;
    }

    public void setVentas(List<ClienteTop> ventas) {
        this.ventas = ventas;
    }    
}
