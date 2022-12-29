import java.util.Scanner;
public class Exo1{
     public void exo1(){
        Scanner scan=new Scanner(System.in);
        
        int nombres=0;
        int P=0;
        int n=0;
        double sum=0;
        int p ;
        int g,r;
        double fac,rc,p1,fac1;
         System.out.println("entrer la quantite de nombre que vous desirez entrer (n compris entre 4 et 15)");
         n=scan.nextInt();
          while (n<4 || n>15){
              System.out.println("la quantite de nombre doit etre compris entre 4 et 15"); 
                System.out.println("entrer la quantite de nombre que vous desirez entrer (n compris entre 4 et 15)");
                  n=scan.nextInt();
          }
         
         System.out.println("entrer a quelle puissance vous desirez avoir les nombres (p compris entre 2 et 3)");
         P=scan.nextInt();       
          while (P>3 || P<1){
              System.out.println("la quantite de p doit etre compris entre 2et 3"); 
                  System.out.println("entrer a quelle puissance vous desirez avoir les nombres (p compris entre 2 et 3)");
                   P=scan.nextInt();
          }  

         System.out.println("entrer un nombre");
         nombres=scan.nextInt();
         p =nombres;
         g  =nombres;
         fac=0;
         rc=0;
         r=0;
         
         if (P==2){
             sum=nombres*nombres;
         System.out.println("A une puissance de 2 ce nombre est egale a "+ sum);
         }
         if (p==3){
              sum=nombres*nombres*nombres;
         System.out.println("A une puissance de 3 ce nombre est egale a "+ sum);
         }
        
          
        
             if(nombres==3){
                fac =nombres ;
                for(int y=1;y<nombres;y++){                                
                 
            fac=fac*y;
                    
        }
         System.out.println("la factorielle de ce nombre est"+ fac);
        }
      
        for (int i=0;i<=n-2 ;i++){
          System.out.println("entrer un nombre");
          nombres=scan.nextInt();
        
         
           
            if (P==2){
             sum=nombres*nombres;
              p1=nombres*nombres;
                  sum=sum+p1;
         System.out.println("A une puissance de 2 ce nombre est egale a "+ p1);
         }
         if (P==3){
              sum=nombres*nombres*nombres;
               p1=nombres*nombres*nombres;
             sum=sum+p1;
         System.out.println("A une puissance de 3 ce nombre est egale a "+ p1);
         }
        
          /*Math.sqrt*/
        
             if(nombres==3){
                fac =nombres ;
                for(int y=1;y<nombres;y++){                                
                 
            fac=fac*y;
                    
        }
         System.out.println("la factorielle de ce nombre est"+ fac);
        }
          if(i<3){
              rc=Math.sqrt(nombres);
              System.out.println("la racine carre de ce nombre est " + rc );
          }
        
          
          
          if(p > nombres){
            p = nombres;
            }
            if(g<nombres){
                 g  =nombres;
            }
           
               
        }
              System.out.println("le plus petit nombres est "+ p);
               System.out.println("le plus grand  nombres est "+ g);
               System.out.println("la somme de tous les elements est de "+ sum);
       
       
    }
}