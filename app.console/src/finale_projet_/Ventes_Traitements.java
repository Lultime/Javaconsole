
package finale_projet_;
 import java.util.ArrayList;
    import java.util.Scanner;
     import java.util.Random;
  import static finale_projet_.Clients_traitements.main2;
import static finale_projet_.Clients_traitements.cll;
import  static finale_projet_.Produits_Traitements.main1;
import  static finale_projet_.Produits_Traitements.p;



public class Ventes_Traitements {
   static Scanner vt=new Scanner(System.in);
    static ArrayList<Ventes> vte=new ArrayList<>();
    static Ventes vts= new Ventes();
    static int moinpro;
    static ArrayList pach=new ArrayList();
    static Clients_traitements clt=new Clients_traitements();
    static Produits_Traitements prt=new Produits_Traitements();
    /**
     *
     */
    public static void main3(){
         int V=0;
      do{  
        System.out.println("1.Enregistrer ventes");
        System.out.println("2.Liste des ventes effectués");
        System.out.println("3.Ventes crées par chèque,carte de credit ou débit etc ");
        System.out.println("Menu");
        System.out.println("4.clients");
        System.out.println("5.Produits");
        System.out.println("6.retourner au menu");
        do{
            System.out.println("Choissiser une option(1 A 6)");
            V =vt.nextInt();
        }while(V<1 || V>6);

        switch(V){
            case 1 -> Enregistrere();
            case 2 -> Afficher();
                
            case 3 -> mode_paiement();
             
             case 4 ->main2();
             
              case 5 ->main1();
               case 6 ->V=7;
               default -> {
                   System.out.println("choisisser une option indiquer au menu");
                           }
              
        }
        }while(V<=6);
      
      }
    public static void Enregistrere(){
        do{
           System.out.println("ID client  :");
           vts.setId_clients(vt.nextLine());
        }while(!Clients_traitements.clientexist(vts.getId_clients()));
           
                
         do{
           System.out.println("Produits achetés  :");
           vts.setProduits_achetés(vt.nextLine());
                         
         }while(!prt.produitexist(vts.getProduits_achetés()));
           
        do{
           System.out.println("mode paiement (credit,chèque,carte debit,carte credit,cash)  :");
           vts.setMode_paiement(vt.nextLine());
        }while(!vts.getMode_paiement().equalsIgnoreCase("credit") && !vts.getMode_paiement().equalsIgnoreCase("chèque") && !vts.getMode_paiement().equalsIgnoreCase("cash") && !vts.getMode_paiement().equalsIgnoreCase("carte credit") && !vts.getMode_paiement().equalsIgnoreCase("carte debit"));
        do{
           System.out.println("Quantité achetés  :");
           vts.setQuantite_achete(vt.nextInt());
        }while(vts.getQuantite_achete()==0 && 0>vts.getQuantite_achete());
        
       
        do{
           System.out.println("Date vente  :");
           vts.setDate_vente(vt.nextLine());
        }while(vts.getDate_vente().isEmpty());
        Random r=new Random();
        String idd;
         idd=vts.getProduits_achetés().substring(0,1)+"-"+
                   r.nextInt(999);
          vts.setId_ventes(idd.toUpperCase()); 
          
   vte.add(new Ventes(vts.getId_ventes(),vts.getId_clients(),vts.getProduits_achetés(),vts.getMode_paiement(),vts.getQuantite_achete(),vts.getDate_vente()));
    pach.add(vts.getProduits_achetés());
    
    }
    
    public static void Afficher(){
         if(vte.isEmpty()){
             
            System.out.println("aucunne ventes n a été effectués");
        }else{
         vte.forEach(vent -> {
             System.out.println(vent.toventes());
           System.out.println("----------------------------------------");
       });
         }
    }
    
    public static void mode_paiement(){
         do{
            System.out.println("aucunne ventes n a été effectués");
        }while(vte.isEmpty());
         vte.stream().filter(vente -> (vts.getMode_paiement().equalsIgnoreCase("chèque") && vts.getMode_paiement().equalsIgnoreCase("carte credit") && vts.getMode_paiement().equalsIgnoreCase("carte debit"))).forEachOrdered(vente -> {
             System.out.println(vente.toventes());
       });
    }
}
