import java.util.Scanner;
public class Tableau{
    public static void main(String []args){
        int tab[]=new int[]{0};
        int sompair=0;
        int somimpair=0;
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer la quantité de nombre que vous vouler maitre");
         n=sc.nextInt();
        while(n<3 || n>9){
            System.out.println(" la quantité de nombre doit etre comprise entre 3 et 9");
            System.out.println("entrer la quantité de nombre que vous vouler maitre");
             n=sc.nextInt();
        }
         for (int i=0 ;i<(n-1)  ;i++){
              System.out.println("entrer un nombre");
              tab[i]=sc.nextInt();
             if(tab[i]%2==0){
                 sompair=sompair +1 ;
             }else{
                 somimpair=somimpair +1;
             }
         }
         System.out.println("la quantite de nombre pair est"+ sompair);
         System.out.println("la quantite de nombre impair est" + somimpair);
    }
}