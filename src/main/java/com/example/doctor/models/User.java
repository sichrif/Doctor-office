package com.example.doctor.models;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    private int id;
    private String name;
    private String lastname;
    private int CIN;
    private int tel;
    private String role;
    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Cabinet cabinet;
    public User() {
    }

    public User(int id, String name, String lastname, int CIN, int tel, String role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.CIN = CIN;
        this.tel = tel;
        this.role = role;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}