package com.company.maxencejava;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Formation
 */
public class Equipe implements Ressource {
    private String nom;
    private String jeux;
    private  List <Joueur> ListeJoueurs = new ArrayList <Joueur> ();
     public Equipe(String nom, List  ListeJoueurs ) {
        this.nom = nom;
        this.ListeJoueurs = ListeJoueurs ; 
    }
    
    public List <Joueur> getListeJoueurs() {
        return ListeJoueurs;
    }		
    public String getNom() {
        return nom;
    }
    @Override
    public String getJeux() {
        return jeux;
    }
    @Override
    public void setJeux(String jeux) {
        this.jeux = jeux;
    }
    @Override
    public Color getCouleur() {
        return Color.RED;
    }
    
}
