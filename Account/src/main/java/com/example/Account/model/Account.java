package com.example.Account.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Account {
    private String nom_utilisateur;
    private String nom;
    private String prenom;
    private String email;
    private Date datenaissance;
    private String numtel;
    private String motdepasse;
    private String imageurl;
    private String role;
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_utilisateur() {
        return nom_utilisateur;
    }

    public void setNom_utilisateur(String nom_utilisateur) {
        this.nom_utilisateur = nom_utilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    // Constructors, getters, setters


    public Account() {
    }

    public Account(String nom_utilisateur, String nom, String prenom, String email, Date datenaissance, String numtel, String motdepasse, String imageurl, String role) {
        this.nom_utilisateur = nom_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.datenaissance = datenaissance;
        this.numtel = numtel;
        this.motdepasse = motdepasse;
        this.imageurl = imageurl;
        this.role = role;
    }
}
