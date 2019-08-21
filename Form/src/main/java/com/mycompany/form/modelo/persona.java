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
    
    /**
     * 
     * 
     */
    
    private String nombre; 
    private int primersalario;
    private int diastrabajados;
    private ArrayList <String> lista = new ArrayList<>();
    int total=0; 
    int sumatoriaidioma=0;
    int con = 0;
    
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
    
    /**
     * 
     * @param lista se crea una lista en la funcion para generar los idiomas,por lo cual cada idioma tiene  un cierto valor
     * @param primersalario es el pago por dia 
     * @param diastrabajados dias trabajados 
     * @param nombre nombre del usuario
     * @return returna con (
     */
    
    public int totalSalario (ArrayList<String>lista,int primersalario,int diastrabajados,String nombre){
       
        total = primersalario * diastrabajados;
        
        if(lista.isEmpty()){
            return total;
        }
        
        else{
            for(String listrecorrer: lista){
                if(listrecorrer.equals("ingles")){
                    sumatoriaidioma= sumatoriaidioma + 100000;
                }
                if(listrecorrer.equals("español")){
                    sumatoriaidioma = sumatoriaidioma + 50000;
                }
                if(listrecorrer.equals("frances")){
                     sumatoriaidioma = sumatoriaidioma+ 200000;
                }
                if(listrecorrer.equals("mandarin")){
                     sumatoriaidioma = sumatoriaidioma+ 300000;
                
                }
            }
             return  con = total+sumatoriaidioma;
        }
        
        
        
          
   
    
    }
    
    
}
