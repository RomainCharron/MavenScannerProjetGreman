/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maxencejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Formation
 * @version 1.0
 * <h1>L'application JoueurScanner permet de choisir et de créer des Listes de joueurs différenrs</h1>
 */
public class JoueurScanner {
 private static Scanner sc = new Scanner(System.in);
 /**
  * <b>On a 3 Listes de joueurs différent qui vont utilisées dans les méthodes statiques de la classe</b> 
 */
 private static     List <JoueurF> ListeJoueursF = new ArrayList <JoueurF> ();
 private static     List <JoueurR> ListeJoueursR = new ArrayList <JoueurR> ();
 private static     List <JoueurH> ListeJoueursH = new ArrayList <JoueurH> ();
 
 /**
  * Création des Listes de Resources
  * 
  */
 private static List<Ressource> ListeRessource = new ArrayList<Ressource>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
       try {
           
           //int nbJoueurs =0;
           int typejoueur = 0;
           String valeur= "";
           boolean num = false;
           
           List <Joueur> ListeJoueurs = new ArrayList <Joueur> (); 
           
           do
           {
                do {
                    System.out.println("Menu : ");
                    System.out.println("Saisir le numéro suivant :");
                    System.out.println("0 : pour sortir");
                    System.out.println("1 : Pour créer un Joueur de Foot");
                    System.out.println("2 : Pour créer un Joueur de Rugby");
                    System.out.println("3 : Pour créer un Joueur de Hand Ball");
                    System.out.println("4 : Pour vider la Liste de Joueurs");
                    System.out.println("5 : Pour Constituer les Equipes de Joueur");
                    System.out.println("6 : Pour Afficher les Listes de Joueurs");
                    System.out.println("7 : Pour Créer une équipe");
                    System.out.println("8 : Pour Créer un Terrain");
                    System.out.println("9 : Pour Créer un Ballon");
                    System.out.println("10 : Pour Afficher la liste des Resoources");
                    if(sc.hasNextInt()) {
                        num = true;
                        valeur = sc.next();
                    }
                    else sc.next();
                } while (!num);
                
                typejoueur = Integer.parseInt(valeur);
                switch(typejoueur)
                {
                    case 1 :  saisir_joueur(ListeJoueurs, new JoueurF());
                                break;
                    case 2 :  saisir_joueur(ListeJoueurs, new JoueurR());
                                break;
                    case 3 :  saisir_joueur(ListeJoueurs, new JoueurH());
                                break;
                    case 4 :  clearJoueurs();
                                break;
                    case 5 :  constitueEquipe(ListeJoueurs);
                                break;
                    case 6 :  afficheJoueurs(ListeJoueursF,"FootBall");
                                afficheJoueurs(ListeJoueursR,"Rugby");
                                afficheJoueurs(ListeJoueursH,"HandBall");
                                break;  
                    case 7 :  ListeRessource.add(creerUneEquipe(ListeJoueurs)) ;
                                break;
                    case 8 :  ListeRessource.add(creerUnTerrain());
                                break;
                    case 9 :  ListeRessource.add(creerUnMateriel());
                                break;                   
                    case 10 :  afficheListeRessources(ListeRessource);
                                break;
                }                
            }
           while(typejoueur != 0);
           
           
           
           
           
           
       } catch (Exception e) {
           System.out.println(e.getMessage());
       } 
    }
    /**
     * 
     * @param ListeJoueurs
     * @param oj : joueur à ajouter à ajouter dans les listeJoueurs (on aura 3 types joueurs différents)
     * <b>Toutes les exceptions seront gérées dans le main.</b>
     * <i>On saisit toutes les données du joueur et on contrôle la saisie</i>
     * @throws Exception 
     */
    public static void saisir_joueur(List<Joueur> ListeJoueurs,Joueur oj) throws Exception
    {
         String temp="";
         int valtemp=0;
           //Joueur oj = new Joueur();
            System.out.println(" Joueur : "+oj.getClass().getName());

           System.out.println(" Saisir le nom : ");
           oj.setNom(setClavier(temp));
           System.out.println(" Saisir le prénom :");
           oj.setPrenom(setClavier(temp));
           System.out.println(" Saisir votre Pseudo :");
           oj.setPseudo(setClavier(temp));
           System.out.println(" Saisir votre mot de passe ");
           temp = setClavier(temp);
           if(temp.length() >2)           
               oj.setMdp(temp);
           else
               throw new Exception("La taille du MTP est inférieure à 2 !");
            System.out.println(" Saisir votre âge ");
           valtemp = setClavier(valtemp);
           if(valtemp > 12)
           {
               oj.setAge(valtemp);
           }
           else
               throw new Exception("L'âge est inférieur à 12 !");
           System.out.println(" Saisir votre Genre : ");
           temp = setClavier(temp);
           if (temp.equalsIgnoreCase("M"))
           {
               oj.setGenre(Genre.M);
           }
           else {
               if (temp.equalsIgnoreCase("F"))  
               {
                   oj.setGenre(Genre.F);
               }
               else
               {
                   throw new Exception("Le genre est invalide !");
               }
           }

           ListeJoueurs.add(oj);
    }
    /**
     * 
     * @param temp
     * @return temp modifier de type String
     */
    public static String setClavier(String temp)
    {
        temp = sc.next();
        return temp;
    }
    /**
     * <i>On teste si c'est une numérique sinon on retourne la valeur rentrée en paramètre</i>
     * @param temp
     * @return temp modifier de type int
     */
     public static int setClavier(int temp)
    {
         if (sc.hasNextInt()) {
               temp = sc.nextInt();
           }

        return temp;
    }
     /**
      * <h2>On constitue dans les 3 listes de joueurs différents selon la lecture de ListeJoueurs</h2>
      * @param ListeJoueurs
      * @throws Exception 
      */
   public static void constitueEquipe(List<Joueur> ListeJoueurs) throws Exception
   {
      
       for(Joueur oj : ListeJoueurs)
       {
           if(oj instanceof JoueurF)
           {
               ListeJoueursF.add((JoueurF) oj);
           }
           if(oj instanceof JoueurR)
           {
               ListeJoueursR.add((JoueurR) oj);
           }
           if(oj instanceof JoueurH)
           {
               ListeJoueursH.add((JoueurH) oj);
           }
       }
       
   }
   
   public static void clearJoueurs()
   {
       ListeJoueursF.clear();
       ListeJoueursH.clear();
       ListeJoueursR.clear();
   }
   
   public static void afficheJoueurs(List ListeJoueurs,String titre)
   {
       Joueur ojb;
       System.out.printf("-------%15s------ nb : %03d",titre,ListeJoueurs.size());
       for(Object oj : ListeJoueurs)
       {
           ojb = (Joueur) oj;
           System.out.println("Nom : "+ojb.getNom());
       }
   }
   
   public static Equipe creerUneEquipe(List ListeJoueur)
   {
       Equipe oE;
       String nom="";
       
       System.out.println("Saisir le nom de l'équipe :");
       nom =setClavier(nom);
       
       oE = new Equipe(nom, ListeJoueur);
       
       return oE;
   }
   
    public static Terrain creerUnTerrain()
   {
       Terrain oT;
       String nom="";
       int X1=0,Y1=0,X2=0,Y2=0;
       
       System.out.println("Saisir la localisation du Terrain :");
       nom =setClavier(nom);
       
       oT = new Terrain(X1, Y1, X2, Y2, nom);
       
       return oT;
   }
    
      public static Materiel creerUnMateriel()
   {
       Materiel oM;
       String nom="";
             
       System.out.println("Saisir le nom du Matériel :");
       nom =setClavier(nom);
       
       oM = new Materiel(nom);
       
       return oM;
   }
      
     public static void afficherRessource(Ressource oR)
     {
         System.out.println("Jeux :"+oR.getJeux()+" Couleur : "+oR.getCouleur());
     }
     
     public static void afficheListeRessources(List<Ressource> ListeRessources)
     {
         for(Ressource oR: ListeRessources)
         {
             afficherRessource(oR);
         }
     }
}