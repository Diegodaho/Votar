/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.controlador;

import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author naruk
 */
@ManagedBean @Named(value = "priMulario")
@SessionScoped 

public class priMulario {
    
    private String nombre; 
    private int primersalario;
    private int diastrabajados;
    private ArrayList <String> lista = new ArrayList<>();
     /**
     * metdodo para mostrar nombre
     * @return en nombre
     */

    public String getNombre() {
        return nombre;
    }
    
    /**
     * metodo para actualizar nombre
     * @param nombre actualizacion de nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * metodo para mostrar promersalaio
     * @return promer salario
     */

    public int getPrimersalario() {
        return primersalario;
    }
    
    /**
     * metodo para actualizar nombre 
     * @param primersalario acualiza nombre
     */

    public void setPrimersalario(int primersalario) {
        this.primersalario = primersalario;
    }
    
    /**
     * metodo para mostrar diastrabajados
     * @return dias trabajados
     */

    public int getDiastrabajados() {
        return diastrabajados;
    }
    /**
     * metodo para actulalizar diastrabajos
     * @param diastrabajados actualiza diastrabajados
     */

    public void setDiastrabajados(int diastrabajados) {
        this.diastrabajados = diastrabajados;
    }
    /**
     * metodo para mostrar la lista 
     * @return lista
     */

    public ArrayList<String> getLista() {
        return lista;
    }
    /**
     * metodo para actulizar lista
     * @param lista actualizar lista
     */

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    
}
