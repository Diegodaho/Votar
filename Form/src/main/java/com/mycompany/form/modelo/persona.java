/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.form.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naruk
 */
public class persona {
    
    private String nombre;
    private int primersalario;
    private int diastrabajados;
    private int total=0;
    private int sumatoriaidioma=0;
    private ArrayList <String> lista = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrimersalario() {
        return primersalario;
    }

    public void setPrimersalario(int primersalario) {
        this.primersalario = primersalario;
    }

    public int getDiastrabajados() {
        return diastrabajados;
    }

    public void setDiastrabajados(int diastrabajados) {
        this.diastrabajados = diastrabajados;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    public int totalSalario (ArrayList<String>lista,int primersalario,int diastrabajados,String nombre){
        
        total = primersalario * diastrabajados;
        
        if(lista.isEmpty()){
            return total;
        }
        
        else{
            for(String listrecorrer: lista){
                if(listrecorrer.equals("INGLES")){
                    sumatoriaidioma = sumatoriaidioma + 100000;
                }
                if(listrecorrer.equals("ESPAÑOL")){
                    sumatoriaidioma = sumatoriaidioma + 50000;
                }
                if(listrecorrer.equals("FRANCES")){
                     sumatoriaidioma = sumatoriaidioma + 200000;
                }
                if(listrecorrer.equals("MANDARIN")){
                     sumatoriaidioma = sumatoriaidioma + 300000;
                
                }
            }
        }
        
         total = (primersalario * diastrabajados)+sumatoriaidioma;
        
           return total; 
   
    
    }
    
    
}
