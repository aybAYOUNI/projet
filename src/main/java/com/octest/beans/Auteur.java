package com.octest.beans;

public class Auteur {
    private String nom ;
    private String prenom;
    private boolean activ;

    public String getNom() {
       return nom;
    }

    public String getPrenom() {
        return prenom;
   }

    public boolean isActiv() {
        return activ;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }
}
