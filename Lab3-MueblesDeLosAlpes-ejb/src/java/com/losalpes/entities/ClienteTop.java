/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.losalpes.entities;

import java.math.BigDecimal;

/**
 *
 * @author Asesoftware
 */
public class ClienteTop {
    String nombreCompleto;
    String login;
    BigDecimal compras;
    BigDecimal dinero;

    public ClienteTop(String nombreCompleto, String login, BigDecimal compras, BigDecimal dinero) {
        this.nombreCompleto = nombreCompleto;
        this.login = login;
        this.compras = compras;
        this.dinero = dinero;
    }

    
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public BigDecimal getCompras() {
        return compras;
    }

    public void setCompras(BigDecimal compras) {
        this.compras = compras;
    }

    public BigDecimal getDinero() {
        return dinero;
    }

    public void setDinero(BigDecimal dinero) {
        this.dinero = dinero;
    }
}