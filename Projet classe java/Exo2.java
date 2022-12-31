import java.util.Scanner;
public class Exo2{
	 public  void exo2(){ 
         	
   try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Le nom est: ");
            String nom = scanner.nextLine();

            System.out.println("Le prenom est: ");
            String prenom = scanner.nextLine();

            System.out.println("Le sexe est: ");
            String sexe = scanner.nextLine();

            System.out.println("L adresse est: ");
            String adresse = scanner.nextLine();

            System.out.println("Le numero est: ");
            int numero = scanner.nextInt();

            System.out.println("Le grade est: ");
            int grade = scanner.nextInt();

            ;
            System.out.println("L anciennete est: ");
            int anciennete = scanner.nextInt();

            System.out.println("Le Salaire brut est: ");
            int Salaire_brut = scanner.nextInt();

            System.out.println("Le nom est: " + nom);
            System.out.println("Le prenom est: " + prenom);
            System.out.println("Le sexe est: " + sexe);
            System.out.println("L adresse est: " + adresse);
            System.out.println("Le numero est: " + numero);
            System.out.println("Le grade est: " + grade);
            System.out.println("L anciennete est: " + anciennete);

            if (Salaire_brut < 20000 && anciennete < 5) {
                double newSalaire_brut = +Salaire_brut * 13 / 100 + +Salaire_brut + 1000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut < 20000 && anciennete >= 5 && anciennete <= 15) {
                double newSalaire_brut = +Salaire_brut * 13 / 100 + +Salaire_brut + 2000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut < 20000 && anciennete > 15) {
                double newSalaire_brut = +Salaire_brut * 13 / 100 + +Salaire_brut + 3000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut >= 20000 && Salaire_brut <= 40000 && anciennete < 5) {
                double newSalaire_brut = +Salaire_brut * 10 / 100 + +Salaire_brut + 1000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut >= 20000 && Salaire_brut <= 40000 && anciennete >= 5 && anciennete <= 15) {
                double newSalaire_brut = +Salaire_brut * 10 / 100 + +Salaire_brut + 2000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut >= 20000 && Salaire_brut <= 40000 && anciennete > 15) {
                double newSalaire_brut = +Salaire_brut * 10 / 100 + +Salaire_brut + 3000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 40000 && Salaire_brut <= 80000 && anciennete < 5) {
                double newSalaire_brut = +Salaire_brut * 8.5 / 100 + +Salaire_brut + 1000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 40000 && Salaire_brut < 80000 && anciennete >= 5 && anciennete <= 15) {
                double newSalaire_brut = +Salaire_brut * 8.5 / 100 + +Salaire_brut + 2000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 40000 && Salaire_brut <= 80000 && anciennete > 15) {
                double newSalaire_brut = +Salaire_brut * 8.5 / 100 + +Salaire_brut + 3000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 80000 && anciennete < 5) {
                double newSalaire_brut = +Salaire_brut * 5 / 100 + +Salaire_brut + 1000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 80000 && anciennete >= 5 && anciennete <= 15) {
                double newSalaire_brut = +Salaire_brut * 5 / 100 + +Salaire_brut + 2000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

            else if (Salaire_brut > 80000 && anciennete > 15) {
                double newSalaire_brut = +Salaire_brut * 5 / 100 + +Salaire_brut + 3000;
                System.out.println("Le nouveau salaire brut est: " + newSalaire_brut);

                double NewSalaire_net = +newSalaire_brut - (+newSalaire_brut * 12 / 100);
                System.out.println("Le nouveau salaire net est: " + NewSalaire_net);

                double augmentation = +newSalaire_brut - +Salaire_brut;
                System.out.println("La valeur de son augmentation est: " + augmentation);
            }

        }

    }
}