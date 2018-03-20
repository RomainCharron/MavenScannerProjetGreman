/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maxencejava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Formation
 * <b> Exemple d'utilisation des interfaces </b>
 */
public class GestionInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<JoueurR> LR = new ArrayList<JoueurR>();
        Equipe oE = new Equipe("FFR", LR);
        oE.setJeux("Rugby");
        //Pour l'Equipe
        for(JoueurR oJR : LR)
        {
            oJR.setJeux(oE.getJeux()); //Récupère le jeux de l'équipe
            AfficheRessource(oJR);
        }
        AfficheRessource(oE);
    }
    
    public static void AfficheRessource(Ressource oR)
    {
        System.out.println("Jeux : "+oR.getJeux());
        System.out.println("Couleur : "+oR.getCouleur());
    }
}
