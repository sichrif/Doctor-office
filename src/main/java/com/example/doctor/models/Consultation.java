package com.example.doctor.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "consultations")
public class Consultation {
    private int id;
    private Date dateConsultation;
    private String heurC;
    private String etat;

    public Consultation() {
    }

    public Consultation(int id, Date dateConsultation, String heurC, String etat) {
        this.id = id;
        this.dateConsultation = dateConsultation;
        this.heurC = heurC;
        this.etat = etat;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateConsultation() {
        return dateConsultation;
    }

    public void setDateConsultation(Date dateConsultation) {
        this.dateConsultation = dateConsultation;
    }

    public String getHeurC() {
        return heurC;
    }

    public void setHeurC(String heurC) {
        this.heurC = heurC;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
