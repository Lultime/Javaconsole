import java.util.Scanner;
public class Menu{
	
	public void menu(){
		int choix=0;
		Scanner sc=new Scanner(System.in);
		do{
	  System.out.println("1.Exo 1");
	  System.out.println("2.Exo 2");
	  System.out.println("3.Exo 3");
	  System.out.println("4.Exo 4");
	  System.out.println("5.Exo 5");
	  System.out.println("6.Exo 6");
	  System.out.println("7.Exo 7");
	   do{
	  System.out.print("Choisir une option :");
       choix=sc.nextInt();
		}while(choix<1 || choix>7);
	   switch(choix){
		   case 1:
		        // creer une instance de la classe Exo1
				Exo1 ex1=new Exo1();
				ex1.exo1();
		   break;
		   case 2:
		        Exo2 ex2=new Exo2();
				ex2.exo2();
		   break;
		   case 3:
		        System.out.println("Exo 3");
		   break;
		   case 4:
		        System.out.println("Exo 4");
		   break;
		   case 5:
		        System.out.println("Exo 5");
		   break;
		   case 6:
		        System.out.println("Exo 6");
		   break;
		   case 7:
		        System.out.println("Exo 7");
		   break;
		   
	   }
		}while(choix<=7);
	}
}