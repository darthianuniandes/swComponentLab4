/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.ClienteTop;
import com.losalpes.entities.Mueble;
import com.losalpes.entities.RegistroVenta;
import com.losalpes.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Asesoftware
 */
@Stateless
public class ServicioReportes implements IServicioReportesLocal {
    
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    @Override
    public List<RegistroVenta> darVentas(String usuario) { 
        Usuario u = (Usuario) persistencia.findById(Usuario.class, usuario);
        List<RegistroVenta> ventas = u.getCompras();
        return ventas;
    }

    @Override
    public List<RegistroVenta> darTopMuebles() {
        List<RegistroVenta> ventas = (List<RegistroVenta>) persistencia.findTopMuebles(RegistroVenta.class);
        return ventas;
    }

    @Override
    public List<ClienteTop> darTopCompradores() {
        List<ClienteTop> clientesTop = (List<ClienteTop>) persistencia.findTopClientes("Colombia");
        return clientesTop;
    }

    
}
