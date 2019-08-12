/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import Controlador.controlador;
import Modelo.modelo;
import Vista.vista;



/**
 *
 * @author naruk
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     modelo mol = new modelo();/*llma la clase controlador darle accion al controlador*/ 
     vista vist = new vista();/*llma la clase vista para darle accion al controlador*/ 
     
    
     controlador con = new controlador(vist, mol);
    
     vist.setVisible(true);/*accion para ver la ventana*/
        
    }
    
}
