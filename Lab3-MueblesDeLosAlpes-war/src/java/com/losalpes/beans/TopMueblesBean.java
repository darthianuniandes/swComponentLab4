/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.beans;

import com.losalpes.entities.RegistroVenta;
import com.losalpes.servicios.IServicioReportesLocal;
import java.io.Serializable;
import java.util.ArrayList;
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
public class TopMueblesBean implements Serializable {
    @EJB
    private IServicioReportesLocal servicioVentas;
    
    private String usuario;
    
    private List<RegistroVenta> ventas;
    
    @PostConstruct
    public void init() {
        ventas = servicioVentas.darTopMuebles();
        System.out.println("TAMAÑO LISTA EN PANTALLA:"+ventas.size());
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<RegistroVenta> getVentas() {
        return ventas;
    }

    public void setVentas(List<RegistroVenta> ventas) {
        this.ventas = ventas;
    }    
}
