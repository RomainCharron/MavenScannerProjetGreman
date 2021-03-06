/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.maxencejava;

import java.awt.Color;

/**
 *
 * @author Formation
 */
public class Joueur implements Ressource{
        private String Nom;
        private String Prenom;
        private int Age;
        private String Pseudo;
        private String Mdp;
        private Genre genre;
        
       //Dûe à la Ressource
       private String jeux;
      /**
       * <b>Toutes les données des attributs sont initialisées.</b>
       */
      public Joueur(){
          this.Age = 0;
          this.Mdp = "";
          this.Nom = "";
          this.Prenom = "";
          this.Pseudo = "";
          this.genre = Genre.M;
      }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String Pseudo) {
        this.Pseudo = Pseudo;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String Mdp) {
        this.Mdp = Mdp;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String getJeux() {
        return this.jeux;
    }
    
    @Override
    public void setJeux(String jeux) {
       this.jeux = jeux;
    }

    @Override
    public Color getCouleur() {
        return Color.WHITE;
    }
    
    
    
}
