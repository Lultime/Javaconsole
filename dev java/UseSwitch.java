import java.util.Scanner;
public class UseSwitch{
	public static void main(String ars[]){
		Scanner sc=new Scanner(System.in);
		 System.out.print("Entrer une valeur :");
		 int n=sc.nextInt();
		 // utilisation de l'instruction switch
		 switch(n){
			 // utilisation de l'instruction case
        case 1:
				 System.out.println("Vous pressez 1");
				 break;
				 
		case 2:
				 System.out.println("Vous pressez 2");
				  break;
				 
		case 300:
				 System.out.println("Vous pressez 300");
				  break;
		 default:
		 System.out.println(" La valeur a saisir doit etre  1, 2 ou 300");
					 break;	 
		 }
	}
		 
	}