
package coursjavadut1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EtudiantsTraitements {
// creer un ArrayList Generique
static ArrayList<Etudiants> et=new ArrayList<>();
static Etudiants e=new Etudiants();
static Scanner sc=new Scanner(System.in);
static Scanner sc1=new Scanner(System.in);
    public static void main(String[] args) {
    int x=0; 
        do{
         System.out.println("1.Ajouter");
         System.out.println("2.Afficher");
          System.out.println("3.Rechercher");
         System.out.println("4.Modifier");
         
         System.out.println("5.Supprimer");
         System.out.println("6.Croissant");
         System.out.println("7.Decroissant");
         
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
                 rechercher();
              break;
              case 4:
                  modifier();
              break;
              case 5:
                  supprimer();
              break;
              case 6:
                  //croissant();
              break;
              case 7:
                  //decroissant();
              break;
              default:{
                  System.out.println("Saisir une option du menu");
                  break;
              }
         }
        }while(x<=6);         
        
    }
    
    static void ajouter(){
        System.out.println("--------------Ajouter etudiants----------------");
        do{
        System.out.print("Nom   :");
        e.setNom(sc1.nextLine());
        }while(e.getNom().isEmpty());
        do{
        System.out.print("Prenom   :");
        e.setPrenom(sc1.nextLine());
        }while(e.getPrenom().isEmpty());
        do{
        System.out.print("Sexe(Masculin ou Feminin):");
        e.setSexe(sc1.nextLine());
        }while(!e.getSexe().equals("Masculin") && !e.getSexe().equals("Feminin") );
        do{
        System.out.print("Telephone   :");
        e.setTelephone(sc1.nextLine());
        }while(e.getTelephone().isEmpty());
        Random r=new Random();
        String id=e.getNom().substring(0,1)+
                e.getPrenom().substring(0,1)+"-"+
                r.nextInt( 999);
        e.setId(id.toUpperCase());
        et.add(new Etudiants(e.getId(),e.getNom(),e.getPrenom(),
        e.getSexe(),e.getTelephone()));
    }
    
    static void afficher(){
        int c=0;
        if(et.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisi");
        }else{
            for(Etudiants etud:et){
                System.out.println(etud.toString());
                   System.out.println("-----------------------------------------");
    
            }
        }
    }
     static void modifier(){
         int c=0;
         if(et.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisi");
         }else{
             afficher(); 
             System.out.println("Entrer le code a modifier");
             String code=sc1.nextLine();
             for(Etudiants etud:et){
                 if(etud.getId().equalsIgnoreCase(code)){
                     System.out.println(etud.toString());
                     System.out.println("-------------------------------");
                     String nTel=null;
                     do{
                     System.out.println("Entrer le nouveau numero de telephone");
                      nTel=sc1.nextLine();
                     }while(nTel.isEmpty());
                     etud.setTelephone(nTel);
                 }else{
                 c++;    
                 }
             }
             if(c==0){
                 System.out.println("Etudiant introuvable");
             }
         }
     }
     
     static void supprimer(){
         int c=0;
         if(et.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisi");
         }else{
             afficher(); 
             System.out.println("Entrer le code a supprimer");
             String code=sc1.nextLine();
             for(Etudiants etud:et){
                 if(etud.getId().equalsIgnoreCase(code)){
                     System.out.println(etud.toString());
                     System.out.println("-------------------------------");
                     String rep=null;
                     do{
                     System.out.println("Voulez-vous vraiment supprimer(o/n)?");
                      rep=sc1.nextLine();
                     }while(!rep.equalsIgnoreCase("o") && !rep.equalsIgnoreCase("n") );
                     if(rep.equalsIgnoreCase("o")){
                         et.remove(etud);
                         break;
                     }
                 }else{
                 c++;    
                 }
             }
             if(c==0){
                 System.out.println("Etudiant introuvable");
             }
         }
     }
static void rechercher(){
         int c=0;
         if(et.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisi");
         }else{
             afficher(); 
             System.out.println("Entrer le code a rechercher");
             String code=sc1.nextLine();
             for(Etudiants etud:et){
                 if(etud.getId().equalsIgnoreCase(code)){
                     System.out.println(etud.toString());
                 }else{
                 c++;    
                 }
             }
             if(c==0){
                 System.out.println("Etudiant introuvable");
             }
         }
     }

}
