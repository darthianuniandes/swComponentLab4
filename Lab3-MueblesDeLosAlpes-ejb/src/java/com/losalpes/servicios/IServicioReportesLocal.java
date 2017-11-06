/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.servicios;

import com.losalpes.entities.Mueble;
import com.losalpes.entities.RegistroVenta;
import com.losalpes.entities.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author isarasty
 */
@Local
public interface IServicioReportesLocal {
    public List<RegistroVenta> darVentas(String usuario);
    public List<Mueble> darTopMuebles();
    public List<Usuario> darTopCompradores();
}
