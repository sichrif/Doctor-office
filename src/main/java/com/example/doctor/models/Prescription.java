package com.example.doctor.models;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity(name = "prescriptions")
@Table(name = "prescriptions")
@DynamicUpdate
public class Prescription {
    private int id;
    private String designation;
    private String period;
    private String indication;

    public Prescription() {
    }

    public Prescription(int id, String designation, String period, String indication) {
        this.id = id;
        this.designation = designation;
        this.period = period;
        this.indication = indication;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }
}
