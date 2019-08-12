/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.modelo;
import Vista.vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author naruk
 */
public  class controlador implements ActionListener {
    
 
    
    private vista vis;
    private modelo mol;
    
    /**
     * 
     * @param vis parametro para la visualizacion de la clase vista
     * @param mol parametro para la visualizacion de la clase modelo
     */
    
    public controlador(vista vis, modelo mol){
        
        this.mol = mol;
        this.vis = vis;
        this.vis.Button.addActionListener(this);/*accion del boton*/
        
    }
    
   
    
   
    /**
     * Metodo para la accion del boton para mostrar
     * @param e 
     */
    
    public void actionPerformed(ActionEvent e){
        
        mol.setNombre(vis.Text.getText());
        mol.mostrar();
        vis.Text12.setText(mol.getNombre());
        
       
       
        
    }
    
    
        
        
        
}

  
   
   
    
    
    
            
    

