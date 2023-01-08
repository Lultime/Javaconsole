import java.util.Scanner;
public class Menu{
	
	public void menu(){
		int choix=0;
      
		Scanner sc=new Scanner(System.in);
		do{
	  System.out.println("1.Exo 1");
	  System.out.println("2.Exo 2");
	  System.out.println("3.Exo 3");
	  
	   do{
	  System.out.print("Choisir une option :");
       choix=sc.nextInt();
		}while(choix<1 || choix>3);
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
		       Exo3 ex3=new Exo3();
				ex3.exo3();

		   break;
		  
		   
	   }
		}while(choix<=3);
	}
}