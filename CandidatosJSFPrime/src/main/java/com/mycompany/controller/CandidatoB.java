/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.Candidato;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.UploadedFile;
import com.mycompany.model.CopyFile;

/**
 *
 * @author Wilmer
 */
@ManagedBean
@SessionScoped
public class CandidatoB implements Serializable {

    private final CopyFile copyFile;
    private static List<Candidato> listaCandidato;
    private Candidato candidato;
    private UploadedFile uploadedFile;

  
    public CandidatoB() {
        candidato = new Candidato();
        copyFile = new CopyFile();
        listaCandidato = new ArrayList<>();
    }

    /**
     * Este metodo retorna un valor obtenido
     * @return Candidato devuelve datos con los valores obtenidos
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * Este metodo declara un valor Candidato
     * @param candidato requerido para enviar los datos
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    /**
     * Este metodo retorna una imagen obtenida
     * @return UploadFile devuelve una imagen con la imgenen ingresada
     */
    public UploadedFile getUploadedFile() {
        return uploadedFile;
    }

    /**
     * Este metodo declara un valor en formato UploadFile
     * @param uploadedFile requerido para enviar la imagen
     */
    public void setUploadedFile(UploadedFile uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    /**
     * Este metodo retorna lista obtenida
     * @return listaCandidaato devulve un texto de forma concatenada
     */
    public List<Candidato> getListaCandidato() {
        return listaCandidato;
    }

    /**
     *  Este metodo declara un valor en formato listaCandidato
     * @param listaCandidato requerido para enviar la lista con los datos
     */
    public void setListaCandidato(List<Candidato> listaCandidato) {
        CandidatoB.listaCandidato = listaCandidato;
    }

    
    public void saveMessage() {
        String nombreFoto = null;
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            File file = new File(uploadedFile.getFileName());
            nombreFoto = copyFile.copyFile(file.getName(), this.uploadedFile.getInputstream());
            System.out.println(nombreFoto);
            FacesMessage message = new FacesMessage(
                    "La imagen a sido subida");
            FacesContext.getCurrentInstance().addMessage(null, message);
            listaCandidato.add(new Candidato(nombreFoto, this.candidato.getNombre(), this.candidato.getApellido(),
                    this.candidato.getFechaNacimiento(), this.candidato.getCedula(), this.candidato.getDescripcion()));
        } catch (IOException e) {
            System.out.println("Error");
        }
        context.addMessage(null, new FacesMessage("Successful", "Your message: " + this.candidato.getNombre()));
    }

    public String main() {
        return "mostrar?faces-redirect=true";      
    }

}
