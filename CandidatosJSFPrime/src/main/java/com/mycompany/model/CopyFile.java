/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

/**
 *
 * @author Wilmer
 */
public class CopyFile implements Serializable{

    private String destination;

  
    public CopyFile() {
        FacesContext context = FacesContext.getCurrentInstance();
            ServletContext scontext = (ServletContext)context.getExternalContext().getContext();
            System.out.println("Ruta Path: "+scontext.getRealPath("/"));
            String ruta = scontext.getRealPath("/")+File.separator;
            System.out.println("Ruta: "+ ruta);
        this.destination = ruta;
    }

    /**
     * Este metodo muestra el archivo
     * @param fileName
     * @param in
     * @return 
     */
    public String copyFile(String fileName, InputStream in) {
        String enviar = null;
        try {
            System.out.println(destination + fileName);
            OutputStream out = new FileOutputStream(new File(destination + fileName));
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
            out.close();
            System.out.println("El archivo se ha creado con éxito!");

            DateFormat dateFormat = new SimpleDateFormat("HH_mm_ss");
            Date date = new Date();
            String ruta1 = destination + fileName;
            String ruta2 = destination + dateFormat.format(date) + "–" + fileName;
            System.out.println("Archivo: " + ruta1 + " Renombrado a: " + ruta2);
            File archivo = new File(ruta1);
            archivo.renameTo(new File(ruta2));
            enviar = dateFormat.format(date) + "–" + fileName;
            System.out.println("233456" + enviar);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }    
        return enviar;
    }
}
