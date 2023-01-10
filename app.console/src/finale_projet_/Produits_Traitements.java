
package finale_projet_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
import static finale_projet_.Ventes_Traitements.main3;
import static finale_projet_.Clients_traitements.main2;
import static finale_projet_.Ventes_Traitements.vts;
import static finale_projet_.Ventes_Traitements.vte;
import static finale_projet_.Menu.e;

public class Produits_Traitements {

     static int o;
    static Scanner sc=new Scanner(System.in);
  static  ArrayList<Produits> pr=new ArrayList<>();
  static ArrayList np=new ArrayList<>();
  static Produits p=new Produits();
    static Scanner snu=new Scanner(System.in);
    static String nom;
  static Produits_Traitements prt=new Produits_Traitements();
    
    /**
     *
     */
    public static void main1(){
        
       int C=0;
      do{  
        System.out.println("1.Enregistrer produit");
        System.out.println("2.Afficher la liste des  produit");
        System.out.println("3.Affichage produit en ordre croissant");
        System.out.println("4.Affichage produit en ordre decroissant");
        System.out.println("5.Suppression produit ");
        System.out.println("Menu");
        System.out.println("6.ventes");
        System.out.println("7.clients");
        System.out.println("8.retourner au menu");
        do{
            System.out.println("Choissiser une option(1 A 8)");
            C =sc.nextInt();
        }while(C<1 || C>8);

        switch(C){
            case 1 -> Enregistrer();
            case 2 -> Afficher();
                
            case 3 -> Ordre_croissant();
                
            case 4 -> OrdreDecroissant();
                
            case 5 -> Supprimer();
            
            case 6 ->main3();
            case 7 ->main2();
            case 8 ->C=9;
               default -> {
                   System.out.println("choisisser une option indiquer au menu");
                           }
              
        }
        }while(C<=8);
      
      }
    
      public static void Enregistrer(){
          System.out.println("---------------Produits-------------------");
           
          do{
              System.out.println("Nom   : ");
             p.setNom(snu.nextLine()); 
          }while(p.getNom().isEmpty());
          do{
              System.out.println("Mesure  : ");
             p.setMesure(snu.nextDouble()); 
          }while(p.getMesure()==0);
          do{
              System.out.println("Categorie   : ");
             p.setCategorie(snu.nextLine()); 
          }while(p.getCategorie().isEmpty());
          
          do{
              System.out.println("Prix achat   : ");
             p.setPrix_achat(snu.nextDouble()); 
          }while(p.getPrix_achat()==0);
          do{
              System.out.println("Prix vente   : ");
             p.setPrix_vente(snu.nextDouble()); 
          }while(p.getPrix_vente()==0);
          
         
          do{
              System.out.println("Quantité   : ");  
                  p.setQuantité(snu.nextInt());
              if(!vte.isEmpty()){
                  int incre = Produits_Traitements.increproduit(p.getNom(),p.getQuantité());
                  p.setQuantité(incre);
              }
             }while(p.getQuantité()==0);
              
            
         do{
              System.out.println("Date enregistrement   : ");
             p.setDate_enregistrement(snu.nextLine()); 
          }while(p.getDate_enregistrement().isEmpty());
   
          Random r=new  Random();
          String id_produit;
      id_produit = p.getNom().substring(0,1)+"-"+
              r.nextInt(100);
          p.setId_Produit(id_produit.toUpperCase());
          
          pr.add(new Produits(p.getId_Produit(),p.getNom(),p.getMesure(),p.getCategorie(),p.getPrix_achat(),p.getPrix_vente(),p.getQuantité(),p.getDate_enregistrement()));
                  
          
      } 
      public static void Afficher(){
          System.out.println("---------liste produits---------");
          if(pr.isEmpty()){
              System.out.println("aucunne donnée n a été éntrée");
          }else{
              pr.forEach(pro -> {
                  System.out.println(pro.affichage());
                   System.out.println("----------------------------------------");
              });
                 
                  }
          
      }
      public static void Ordre_croissant(){
          
            if(pr.isEmpty()){
              System.out.println("aucunne donnée n a été éntrée");
          }else{
    
                 Collections.sort(pr);
                 pr.stream().map(pro -> {
                     System.out.println(pro.toString());
                    return pro;
                }).forEachOrdered(_item -> {
                    System.out.println("------------------------------------");
                });
               

            
           
           
      }
      }
           public static void OrdreDecroissant(){
                    
            if(pr.isEmpty()){
              System.out.println("aucunne donnée n a été éntrée");
          }else{
    
                 Collections.sort(pr);
                 Collections.reverse(pr);
                 pr.stream().map((Produits pro) -> {
                     System.out.println(pro.toString());
                     return pro;
                 }).forEachOrdered(_item -> {
                    System.out.println("------------------------------------");
                });
               

           }
           }
           
           public static void Supprimer(){
               int c=0;
           
                System.out.println("------------------xxxxx-----------");
        if(pr.isEmpty()){
            System.out.println("Aucune donnee n'a ete saisie");
           }else{
            Afficher();
            System.out.println("entrer le codedu produit a suprimer");
            String code=snu.nextLine();
            for(Produits pro:pr){
                if(pro.getId_Produit().equalsIgnoreCase(code)){
                    System.out.println(pro.affichage());
                     System.out.println("-------------------------------");
                    String rep=null;
                    do{
                        System.out.println("voulez vous vraiment supprimer ce produits(O) ou (N)");
                    rep=snu.nextLine();
                    }while(!rep.equalsIgnoreCase("O")&& !rep.equalsIgnoreCase("N"));
       
                    if(rep.equalsIgnoreCase("O")){
                        pr.remove(pro);
                       
                        break;
                    }
                    
                }else{
                 c++;    
                 }
             
             if(c==0){
                 System.out.println("Etudiant introuvable");
             
            }
            }
        }
           }

           
           
           
    boolean produitexist(String nom) {
        Boolean exe=false;
               for (Produits proo:pr){
                   if(proo.getNom().equalsIgnoreCase(nom)){
                       exe=true;
                       break;
                   }
               }
               return exe;
    }

    
           
         static Boolean produitexiste(String nom){
        Boolean ans = false;
        for( Produits produit:pr){
            if(produit.getNom().equalsIgnoreCase(nom)){
                ans = true;
                break;
            }
        }
        return ans;
    }    
           
           
 static int  increproduit (String nom,int quantité){
     int incre=0;
     for(Produits prro:pr){
         if(prro.getNom().equals(vts.getProduits_achetés())){
              incre= prro.getQuantité()- vts.getQuantite_achete();
              break;
         }
     }
     return incre;
 }       
           
           
}
           

           
      
      
 
      
      
    

  
    
  