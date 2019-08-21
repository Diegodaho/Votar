/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.controlador;

import com.mycompany.form.modelo.persona;
import java.util.ArrayList;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author naruk
 */

@ManagedBean @Named(value = "seguFormulario")
@RequestScoped

public class seguFormulario {
    
   
    
    private int total; //varaible total para guardar el total de la funcion mostrar
    persona person;//llama la funcion totalsalario
    
    @ManagedProperty("#{priMulario}")
    
    private priMulario primerFormulario;//trae los metodos set y get de la clase 
    /**
     *  constructor seguFormulario
     */

    public seguFormulario() {
        
        person = new persona();
    }
    
    /**
     * metodo que  muestra el total
     * @return total
     */

    public int getTotal() {
        return total;
    }
    /**
     * metodo que actualiza total
     * @param total actualiza total
     */

    public void setTotal(int total) {
        this.total = total;
    }
    /**
     * metodo para mostrar premerformulario
     * @return primerformulario
     */

    public priMulario getPrimerFormulario() {
        return primerFormulario;
    }
    
    /**
     * metodo para actualizar formulario
     * @param primerFormulario actualiza formalario
     */

    public void setPrimerFormulario(priMulario primerFormulario) {
        this.primerFormulario = primerFormulario;
    }
    
    
    /**
     * metodo para mostrar el resultado de la funcion totalsalario
     */
    
    public void metodoMostrar(){
        
        this.total = person.totalSalario(this.getPrimerFormulario().getLista(),this.getPrimerFormulario().getPrimersalario(),this.getPrimerFormulario().getDiastrabajados(),this.getPrimerFormulario().getNombre());
        
        
    }
    
    

   
    
    
    
    
    }
