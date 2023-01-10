
package finale_projet_;
import  static finale_projet_.Produits_Traitements.main1;
import static finale_projet_.Ventes_Traitements.main3;
import static finale_projet_.Ventes_Traitements.vts;
import static finale_projet_.Ventes_Traitements.vte;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class Clients_traitements {
    static Scanner scc=new Scanner(System.in);
    static ArrayList<Clients> cl=new ArrayList<>();
    static Clients cll= new Clients();
    static String r,c,j;
   static String val;
    static Scanner sce=new Scanner(System.in);
   static Scanner scd=new Scanner(System.in);
   static   int b=0;
     static Clients_traitements vlt=new Clients_traitements();
    /**
     *
     */
    
     public static String adrech=null;
    public static String adress=null;
    public static String num=null;
    /**
     *
     */
    public static void main2(){
         int D=0;
      do{  
        System.out.println("1.Enregistrer client");
        System.out.println("2.Afficher la liste des  clients");
        System.out.println("3.Liste des clients ayant des dettes ");
        System.out.println("4.Liste des produits achetés par un client");
        System.out.println("5.Moodifier l adresse et/ou téléphone d un client");
        System.out.println("Menu");
        System.out.println("6.ventes");
        System.out.println("7.Produits");
        System.out.println("8.Retourner au menu");
        do{
            System.out.println("Choissiser une option(1 A 8)");
            D =scc.nextInt();
        }while(D<1 || D>8);

        switch(D){
            case 1 -> Enregistrerr();
            case 2 -> Afficher();
                
            case 3 -> Dette_clients();
                
            case 4 -> Produits_achetés();
                
            case 5 -> Modifier_add_tel();
            
            case 6 ->main3();
         
            case 7 ->main1();
            case 8 ->D=9;
               default -> {
                   System.out.println("choisisser une option indiquer au menu");
                           }
              
        }
        }while(D<=8);
      
      }
    public static void Enregistrerr(){
        do{
           System.out.println("Nom  :");
           cll.setNom(scc.nextLine());
        }while(cll.getNom().isEmpty());
        do{
           System.out.println("Prenom  :");
           cll.setPrenom(scc.nextLine());
        }while(cll.getPrenom().isEmpty());
        do{
           System.out.println("adresse  :");
           cll.setAdresse(scc.nextLine());
        }while(cll.getAdresse().isEmpty());
        do{
           System.out.println("Email  :");
           cll.setEmail(scc.nextLine());
        }while(cll.getEmail().isEmpty());
        do{
           System.out.println("Sexe (F ou M :");
           cll.setSexe(scc.nextLine());
        }while(!cll.getSexe().equals("F") && !cll.getSexe().equals("M"));
        do{
           System.out.println("Telephone  :");
           cll.setTelephone(scc.nextLine());
        }while(cll.getTelephone().isEmpty());
        Random r=new Random();
        String id=cll.getNom().substring(0, 1)+cll.getPrenom().substring(0, 1)+
                r.nextInt(999);
        cll.setId_clients(id.toUpperCase());
        cl.add(new Clients(cll.getId_clients(),cll.getNom(),cll.getPrenom(),cll.getEmail(),cll.getAdresse(),cll.getSexe(),cll.getTelephone()));
    
    }
    
    public static void Afficher(){
        if(cl.isEmpty()){
             
            System.out.println("aucunne ventes n a été effectués");
        }else{
         cl.forEach(cli -> {
             System.out.println(cli.toclients());
             System.out.println("----------------------------------------");
       });
         }
    }
        
    
    
    public static void Dette_clients(){
         cl.forEach((Clients cli) -> {
             if(vts.getMode_paiement().equalsIgnoreCase("credit"))
             {
                 System.out.println(cli.toclients());
             }else{
                 System.out.println("aucunne ventes a credit n a ete encore effectué");
             }
    
         });
        
    }
    
    public static void Produits_achetés(){
        int e =0;
       
        System.out.println("entrer l id du client");
                String idi=scd.nextLine();
               
                     for(Ventes vent:vte){
                         if(vent.getId_clients().equalsIgnoreCase(idi) ){
                             System.out.println(vent.getProduits_achetés());
                             System.out.println("----------------------------------------");
                         }else{
                             e++;
                     }
                    
                     }
      if(e==0){
                  System.out.println("pas de produits achetés");
              }
      if(!vte.isEmpty() &&  idi.equals(vts.getId_clients())){
        do{
              System.out.println(" vous voulez retirez un produit dans la liste des produits acheté");
              System.out.println(" taper oui (o) pour retirer et non(n) pour annuler");
              j=scd.nextLine();
          }while(!j.equals("o") && !j.equals("n"));
          if(j.equalsIgnoreCase("o")){
               
                      System.out.println("entrer le non  du produit que vous voulez retirer");
                      c=scc.nextLine();
             for(Ventes vant:vte) {
           if(vant.getProduits_achetés().equalsIgnoreCase(c)){
                      vte.remove(vant);
     
           }else{
                System.out.println("Ce nom n'existe pas sur le systeme");
            }
             }                   
          }
          if(j.contentEquals("n")){
              System.out.println("aucuune produit n a été retiré");
             
          }
      }
    }  
              
      
       
              
        
    
    public static void Modifier_add_tel(){
        int c=0;
    if(cl.isEmpty()){
        System.out.println("aucunne donnée n a été entré");
    }else{
               
        do{
            System.out.println("desirer vous modifier une adresse ou un tel d un client");
            System.out.println("appuyer sur la touche (A)majuscule pour modifier une adresse et (T)majiscule pour modifier  un num tel d un client");
            val= sce.nextLine();
        }while(!val.equals("T") && !val.equals("A"));
        
        if(val.equalsIgnoreCase("T")){
           Afficher();
             System.out.println("Entrer le code du client");
             String code=sce.nextLine();
             for(Clients cli:cl){
                 if(cli.getId_clients().equalsIgnoreCase(code)){
                        System.out.println("Entrer le numero a modifier");
             String numrech=sce.nextLine();
           
                 if(cll.getTelephone().equalsIgnoreCase(numrech)){
                     System.out.println(cli.toclients());
                     System.out.println("-------------------------------");
                     
                     do{
                     System.out.println("Entrer le nouveau numero de telephone");
                      num=scc.nextLine();
                     }while(num.isEmpty());
                     cli.setTelephone(num);
                                      }else{
                 c++;    
                 }
             
          
             }
             if(c==0){
                 System.out.println("clients introuvable");
             }
         }
    }
        if(val.equalsIgnoreCase("A")){
            Afficher(); 
             System.out.println("Entrer le code du client");
             String code=sce.nextLine();
             for(Clients cli:cl){
                 if(cli.getId_clients().equalsIgnoreCase(code)){
                        System.out.println("Entrer l adresse a modifier");
             adrech=sce.nextLine();
           
                 if(cll.getAdresse().equalsIgnoreCase(adrech)){
                     System.out.println(cli.toclients());
                     System.out.println("-------------------------------");
                     
                     do{
                     System.out.println("Entrer le nouveau adresse du client");
                      adress=sce.nextLine();
                     }while(adress.isEmpty());
                     cli.setAdresse(adress);
                                      }else{
                 c++;    
                 }
             
          
             }
             if(c==0){
                 System.out.println("adresse introuvable");
             }
         }
    }
        }
    }


  static Boolean clientexist(String id){
               Boolean exe=false;
               for (Clients clii:cl){
                   if(clii.getId_clients().equalsIgnoreCase(id)){
                       exe=true;
                       break;
                   }
               }
               return exe;
           }



}
        
    

        
