/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dto.Candidato;
import java.io.Serializable;
import java.util.Objects;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author Wilmer
 */
@ManagedBean
@RequestScoped
public class CandidatoMostrarB implements Serializable {

    private PieChartModel pieModel1;
    private Candidato selectCandidato;
    @ManagedProperty("#{candidatoB}")
    private CandidatoB candidato;

    /**
     * Creates a new instance of CandidatoMostrarBean
     */
    public CandidatoMostrarB() {
        pieModel1 = new PieChartModel();
    }

    /**
     * Este metodo retorna los datos obtenidos
     * @return CandidatoB obtiene los datos concatenados
     */
    public CandidatoB getCandidato() {
        return candidato;
    }

    /**
     * Este metodo declara un valor
     * @param candidato requerido para enviar candidato
     */
    public void setCandidato(CandidatoB candidato) {
        this.candidato = candidato;
    }

    /**
     * Este metodo obtiene el listado de los candidatos
     * @return PierCharrModel devuelvel el listado con los datos concatenados
     */
    public PieChartModel getPieModel1() {
        for (Candidato listaCandidato1 : this.candidato.getListaCandidato()) {
            System.out.println(listaCandidato1.getNombre() + "  NOMBRE DE LA LISTA");
            pieModel1.set(listaCandidato1.getNombre(), listaCandidato1.getVoto());
        }
        pieModel1.setTitle("Votos");
        pieModel1.setLegendPosition("e");
        pieModel1.setShadow(false);
        return pieModel1;
    }

    /**
     * Este metodo declara los datos a enviar
     * @param pieModel1 requeriso para enviar la lista
     */
    public void setPieModel1(PieChartModel pieModel1) {
        this.pieModel1 = pieModel1;
    }

    /**
     * Este metodo obtiene los datos del candidato
     * @return Candidato Devuelve los datos concatenados
     */
    public Candidato getSelectCandidato() {
        return selectCandidato;
    }

    /**
     * Este metodo envia los datos del listado
     * @param selectCandidato valores requeridos para enviar datos
     */
    public void setSelectCandidato(Candidato selectCandidato) {
        this.selectCandidato = selectCandidato;
        System.out.println("ENTRO AL SET " + selectCandidato.getNombre());
        try {
            for (Candidato listaCandidato1 : this.candidato.getListaCandidato()) {
                if (Objects.equals(selectCandidato.getCedula(), listaCandidato1.getCedula())) {
                    System.out.println("ENTRO AL IF");
                    int voto = listaCandidato1.getVoto();
                    listaCandidato1.setVoto(voto + 1);
                    System.out.println(listaCandidato1.getVoto() + "  LISTA DE VOTOS ");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR VOTOS");
        }

    }
  
    /**
     * Este metodo realiza una accion evento
     * @param event Evento requqerdio para mostrar 
     */
    public void onRowSelect(SelectEvent event) {
        Candidato e = ((Candidato) event.getObject());
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Successful", "Your message: " + e.getNombre()));
    }
}
