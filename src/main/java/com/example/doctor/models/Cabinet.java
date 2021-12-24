package com.example.doctor.models;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity(name = "cabinets")
@Table(name = "cabinets")
@DynamicUpdate
public class Cabinet {
    private int id;


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "consultation_id", nullable = false)
    private Consultation consultation;

    public Cabinet() {
    }

    public Cabinet(int id, User user, Consultation consultation) {
        this.id = id;
        this.user = user;
        this.consultation = consultation;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
