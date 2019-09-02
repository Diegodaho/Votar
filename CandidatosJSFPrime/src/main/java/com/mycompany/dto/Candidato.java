/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Wilmer
 */
public class Candidato implements Serializable{

    private String foto;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Integer cedula;
    private String descripcion;
    private int voto;

   
    public Candidato() {
    }

    /**
     * Este metodo declara los siguientes valores en formato String e Integer
     * @param foto Foto requerida para recibir String
     * @param nombre Nombre requerido para recibir String
     * @param apellido Apellido requerido para recibir String
     * @param fechaNacimiento Fecha requerida para recibir Date
     * @param cedula Cedula requerida para recibir Integer
     * @param descripcion Descripcion requerido para recibir String
     */
    public Candidato(String foto, String nombre, String apellido, Date fechaNacimiento, Integer cedula, String descripcion) {
        this.foto = foto; // this. = 
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.descripcion = descripcion;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return String devuelve una imagen con el valor obtenido
     */
    public String getFoto() {
        return foto;
    }

    /**
     * Este metodo declara un valor tipo String
     * @param foto Foto requerida para enviar String
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }
 
    /**
     * Este metodo retorna un valor obtenido
     * @return String devuleve un texto con el Nombre concatenado
     */
    public String getNombre() {
        return nombre;
    }
   
    /**
     * Este metodo declara un valor tipo String
     * @param nombre Nombre requerido para enviar Strig
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return String devuelve un texto con el Apellido concatenado
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Este metodo declara un valor tipo String
     * @param apellido Apellido requerido para enviar Strig
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return Date devuelve un texto con la Fecha concatenada
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Este metodo declara un valor tipo Date
     * @param fechaNacimiento Fecha requerida  para enviar Date
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return Integer devuelve un valor con la Cedula concatenada
     */
    public Integer getCedula() {
        return cedula;
    }

    /**
     * Este metodo declara un valor tipo Integer
     * @param cedula Cedula requerida  para enviar Integer
     */
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return Integer devuelve un texto con la Descripcion concatenada
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Este metodo declara un valor tipo Integer
     * @param descripcion Descripcion requerida  para enviar String
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return int devuelve un texto con el Voto concatenada
     */
    public int getVoto() {
        return voto;
    }

    /**
     * Este metodo declara un valor tipo int
     * @param voto Descripcion requerida  para enviar nt
     */
    public void setVoto(int voto) {
        this.voto = voto;
    }

}
