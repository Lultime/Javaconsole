/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coursjavadut1;

import java.util.ArrayList;
 
import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Saisi {
     
        static ArrayList ar=new ArrayList();
        static Scanner sc=new Scanner(System.in);
       static Scanner sc1=new Scanner(System.in);
    public static void main(String[] args) {
        int x=0; 
        do{
         System.out.println("1.Ajouter");
         System.out.println("2.Rechercher");
         System.out.println("3.Modifier");
         System.out.println("4.Supprimer");
         System.out.println("5.Croissant");
         System.out.println("6.Decroissant");
         
         do{
         System.out.println("Option choisie(1-6)");
         x=sc.nextInt();
          }while(x<1 || x>6);
         switch(x){
             case 1:
                 ajouter();
              break;
              case 2:
                  afficher();
              break;
              case 3:
                  modifier();
              break;
              case 4:
                  supprimer();
              break;
              case 5:
                  croissant();
              break;
              case 6:
                  decroissant();
              break;
              default:{
                  System.out.println("Saisir une option du menu");
                  break;
              }
         }
        }while(x<=6);         
    }
    
   static void ajouter(){
       Scanner sc=new Scanner(System.in);
       String nom;
       do{
       System.out.println("Nom complet etudiant:");
       nom=sc.nextLine();
       }while(nom.isEmpty());
       ar.add(nom);
       
   }
   static void afficher(){
       int i=0;
       System.out.println("------------------xxxxx-----------");
        if(ar.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
        }else{
            for(Object o:ar){
                i++;
                System.out.println(i+"."+o);
            }
        }
       System.out.println("------------------xxxxx-----------");
       
   }
   
   static void modifier(){
       System.out.println("------------------xxxxx-----------");
        if(ar.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
        }else{
            for(Object o:ar){
                System.out.println(o);
            }
            System.out.println("-----------------");
            String nRech,nNom;
            do{
            System.out.println("Entrer le nom complet de l'etudiants a modifier");
            nRech=sc1.nextLine();
            }while(nRech.isEmpty());
            if(ar.contains(nRech)){
                   do{
            System.out.println("Entrer le nouveau nom complet de l'etudiants");
            nNom=sc1.nextLine();
            }while(nNom.isEmpty());
            ar.set(ar.indexOf(nRech),nNom);
                    }else{
                System.out.println("Ce nom n'existe pas sur le systeme");
            }
        }
       System.out.println("------------------xxxxx-----------");
       
   }
   
   static void supprimer(){
       System.out.println("------------------xxxxx-----------");
        if(ar.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
        }else{
            for(Object o:ar){
                System.out.println(o);
            }
            System.out.println("-----------------");
            String nRech,rep;
            do{
            System.out.println("Entrer le nom complet de l'etudiants a supprimer");
            nRech=sc1.nextLine();
            }while(nRech.isEmpty());
            if(ar.contains(nRech)){
                   do{
            System.out.println("Voulez-vous vraiment supprimer cet etudiants(o/n)?");
            rep=sc1.nextLine();
            }while(!rep.equalsIgnoreCase("o") &&  !rep.equalsIgnoreCase("n"));
              if(rep.equalsIgnoreCase("o")){
                  ar.remove(nRech);
              }
                    }else{
                System.out.println("Ce nom n'existe pas sur le systeme");
            }
        }
       System.out.println("------------------xxxxx-----------");
       
   }
   
    static void croissant(){
       System.out.println("------------------xxxxx-----------");
        if(ar.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
        }else{
            Collections.sort(ar);
            for(Object o:ar){
                System.out.println(o);
            }
           }
       System.out.println("------------------xxxxx-----------");
       
   }
     static void decroissant(){
       System.out.println("------------------xxxxx-----------");
        if(ar.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
        }else{
            Collections.sort(ar);
            Collections.reverse(ar);
            for(Object o:ar){
                System.out.println(o);
            }
           }
       System.out.println("------------------xxxxx-----------");
       
   }
}
