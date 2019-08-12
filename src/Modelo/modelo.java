/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author naruk
 */
public class modelo {
    
   
    
    private String nombre;/*parametro a crear*/

   

 
    /**
     * metodo para ver el nombre
     * @return nombre como string
     */
    public String getNombre() {
        return nombre;
    }
  
    
    /**
     * metodo para actualizar nombre 
     * @param nombre el nombre nuevo
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Funcion para mosstrar los datos de nombre
     * @return nombre
     */

    public String mostrar(){
        
        
       
        return this.nombre;
    }
    
   
   
   
    
}
