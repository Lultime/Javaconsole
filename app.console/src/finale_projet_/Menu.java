
package finale_projet_;
import static finale_projet_.Clients_traitements.main2;
import  static finale_projet_.Produits_Traitements.main1;
import static finale_projet_.Ventes_Traitements.main3;
import java.util.Scanner;
public class Menu {
    static Scanner sc=new Scanner(System.in);
    static int e=0;
    public static void main(String[]args)  {
      
        
        do{
        System.out.println("1.Produits");
        System.out.println("2.Clients");
        System.out.println("3.Ventes");
        System.out.println("4.Quitter");
        
        do{
            System.out.println("option choisis");
            e=sc.nextInt();
        }while(e<1 || e>4); 
        switch(e){
            case 1->main1();    
            case 2->main2();
            case 3->main3();
            case 4-> e=5;
            default->{
                System.out.println("aucun numero selectionner");
            }
                
        }
        }while(e<=4);
         
        
}
}
