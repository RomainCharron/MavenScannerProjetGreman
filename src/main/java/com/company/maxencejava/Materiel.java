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
public class Materiel implements Ressource {
    
    private String NomDuMateriel;

    public Materiel(String NomDuMateriel) {
        this.NomDuMateriel = NomDuMateriel;
    }

    public String getNomDuMateriel() {
        return NomDuMateriel;
    }
    
    


    @Override
    public String getJeux() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJeux(String jeux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getCouleur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
