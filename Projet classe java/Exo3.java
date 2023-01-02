import java.util.Scanner;
public class Exo3{
    public  void exo3(){
        Scanner scan=new Scanner(System.in);
        double a=0,b=0,c,d,b1,a1,pb1,x=0,pb2,x1=0,x2=0,b2=0,x3=0;
        double delta=0;
        int n=0;
        double radel=0;
        System.out.println("veuiller suivre les instructions");
         System.out.println("SVP, entrer une valeur pour n (degre d equation(1,2,3)) ");
         n=scan.nextInt();
             
             /* ^=puissance ex: ^2=au carré , ^3=au cube*/
             if(n==1){
         System.out.println("SVP, entrer une valeur pour la variable a ");
          a=scan.nextInt();
           System.out.println("SVP, entrer une valeur pour la variable b ");
           b=scan.nextInt();    
        
                System.out.println("vous avez une equation de la forme "+ a +"x + "+ b +" = 0" );
                System.out.println("un instant nous allons resoudre  votre equation");
             
         if (b<0){
              System.out.println(  a +"x "+ b +" = 0" );
             System.out.println(   a +"x = "+ (- b)  );
             System.out.println("x = " + (-b) +"/" + a );
         }else{
        System.out.println(  a +"x + "+ b +" = 0" );
         System.out.println(  a +"x = "+(-b)  );
         System.out.println("x = " + (-b) +"/" + a ); 
         }
          
             }

            if(n==2){
           System.out.println("SVP, entrer une valeur pour la variable a ");
             a=scan.nextInt();
           System.out.println("SVP, entrer une valeur pour la variable b ");
             b=scan.nextInt();
            System.out.println("SVP, entrer une valeur pour la variable c ");
             c=scan.nextInt();
                
                System.out.println("vous avez une equation de la forme "+ a +"x^2 + "+ b +"x + "+ c +"= 0" );
                System.out.println("un instant nous allons resoudre  votre equation");
                delta = (b*b) -(4*a*c);
                 System.out.println("la valeur de delta est " + delta);
                radel= Math.sqrt(delta);
                System.out.println( "la racine carre de delta est " + radel);
                if(delta==0){
                  b1= -(b);
                  a1= 2*a;
                  if(b1<0){
                    pb1=(-(b1));
                    
                  }else{
                    pb1=b1;
                  }
                   if (pb1>a1 && pb1%2==0 && a1%2==0 && b1<0 || pb1==a1 || pb1>a1 && pb1%2==0 && a1%2!=0 && b1<0 ){
                    x=pb1 / a1;
                    System.out.println("la valeur de x est -" + x);
                  }
                  if (pb1>a1 && pb1%2==0 && a1%2==0 &&b1>0 ||  pb1>a1 && pb1%2==0 && a1%2!=0 && b1>0  ){
                    x=pb1 / a1;
                    System.out.println("la valeur de x est " + x);
                  }
                  if(pb1<a1 && pb1%2 !=0 && a1%2 !=0 && b1<0 ){
                     System.out.println("la valeur de x est -" + pb1+"/"+a1);
                  
                  }if (pb1<a1 && pb1%2 !=0 && a1%2!=0 && b1 >0){
                     System.out.println("la valeur de x est "  + pb1+"/"+a1);
                  }
                     
                  }
                  if(delta<0){
                     System.out.println("Pas d autre solution");
                  }
                  if(delta>0){
                    b2=-(b) -radel;
                    b1=-(b) +radel;
                    a1=2*a;
                    if(b1<0){
                    pb1=(-(b1));
                    }else{
                      pb1=b1;
                    }
                    if(b2<0){
                    pb2=(-(b2));
                    }else{
                      pb2=b2;
                    }

                    if (pb1>a1 && pb1%2==0 && a1%2==0 && b1<0 || pb1==a1 || pb1>a1 && pb1%2==0 && a1%2!=0 && b1<0 ){
                    x1=pb1 / a1;
                    System.out.println("la valeur de x1 est -" + x1);
                  }
                  if (pb1>a1 && pb1%2==0 && a1%2==0   || pb1>a1 && pb1%2==0 && a1%2!=0 && b1>0  ){
                    x1=pb1 / a1;
                    System.out.println("la valeur de x1 est " + x1);
                  }
                  if(pb1<a1 && pb1%2 !=0 && a1%2 !=0 && b1<0 ||pb1<a1 && pb1%2 ==0 && a1%2 ==0 && b1<0 ){
                     System.out.println("la valeur de x1 est -" + pb1+"/"+a1);
                  
                  }if (pb1<a1 && pb1%2 !=0 && a1%2!=0 && b1>0 ||pb1<a1 && pb1%2 ==0 && a1%2 ==0 && b1>0){
                     System.out.println("la valeur de x1 est "  + pb1+"/"+a1);
                  }


                   if (pb2>a1 && pb2%2==0 && a1%2==0 && b2<0 || pb2==a1  ){
                    x2=pb2 / a1;
                    System.out.println("la valeur de x2 est -" + x2);
                  }
                  if (pb2>a1 && pb2%2==0 && a1%2==0  && b1>0   ){
                    x2=pb2 / a1;
                    System.out.println("la valeur de x2 est " + x2);
                  }
                  if(pb2<a1 && pb2%2 !=0 && a1%2 !=0 && b2<0 ||pb2>a1 && pb2%2 ==0 && a1%2 !=0 && b1<0 ){
                     System.out.println("la valeur de x2 est -" + pb2+"/"+a1);
                  
                  }if (pb2<a1 && pb2%2 !=0 && a1%2!=0 && b2>0||pb2<a1 && pb2%2 ==0 && a1%2 ==0 && b2>0 ){
                     System.out.println("la valeur de x2 est "  + pb2+"/"+a1);
                  }
                  }
                }
             


            
            if(n==3){
                 System.out.println("SVP, entrer une valeur pour la variable a ");
          a=scan.nextInt();
           System.out.println("SVP, entrer une valeur pour la variable b ");
           b=scan.nextInt();
            System.out.println("SVP, entrer une valeur pour la variable c ");
          c=scan.nextInt();
          System.out.println("SVP, entrer une valeur pour la variable d ");
          d=scan.nextInt();

                System.out.println("vous avez une equation de la forme "+ a +"x^3 + "+ b +"x^2 + "+ c +"x + "+ d +"= 0" );
                System.out.println("un instant nous allons resoudre  votre equation");
                if(-(a) + (b) -(c) +(d)!=0){
                  System.out.println("cette equation n a pas de solution");
                }else{
                  x1= -1;
                  a=a;
                  b=(b) - (a);
                  c=d;
                  delta = (b*b) -(4*a*c);
                 System.out.println("la valeur de delta est " + delta);
                radel= Math.sqrt(delta);
                System.out.println( "la racine carre de delta est " + radel);
                if(delta==0){
                  b1= -(b);
                  a1= 2*a;
                  if(b1<0){
                    pb1=(-(b1));
                    
                  }else{
                    pb1=b1;
                  }
                   if (pb1>a1 && pb1%2==0 && a1%2==0 && b1<0 || pb1==a1 || pb1>a1 && pb1%2==0 && a1%2!=0 && b1<0 ){
                    x=pb1 / a1;
                    System.out.println("la valeur de x est -" + x);
                  }
                  if (pb1>a1 && pb1%2==0 && a1%2==0 &&b1>0 ||  pb1>a1 && pb1%2==0 && a1%2!=0 && b1>0  ){
                    x=pb1 / a1;
                    System.out.println("la valeur de x est " + x);
                  }
                  if(pb1<a1 && pb1%2 !=0 && a1%2 !=0 && b1<0 ){
                     System.out.println("la valeur de x est -" + pb1+"/"+a1);
                  
                  }if (pb1<a1 && pb1%2 !=0 && a1%2!=0 && b1 >0){
                     System.out.println("la valeur de x est "  + pb1+"/"+a1);
                  }
                     
                  }
                  if(delta<0){
                     System.out.println("Pas d autre solution");
                  }
                  if(delta>0){
                    b2=-(b) -radel;
                    b1=-(b) +radel;
                    a1=2*a;
                    if(b1<0){
                    pb1=(-(b1));
                    }else{
                      pb1=b1;
                    }
                    if(b2<0){
                    pb2=(-(b2));
                    }else{
                      pb2=b2;
                    }
                    System.out.println("la valeur de x1 est " + x1);
                    if (pb1>a1 && pb1%2==0 && a1%2==0 && b1<0 || pb1==a1 || pb1>a1 && pb1%2==0 && a1%2!=0 && b1<0 ){
                    x2=pb1 / a1;
                    System.out.println("la valeur de x2 est -" + x2);
                  }
                  if (pb1>a1 && pb1%2==0 && a1%2==0   || pb1>a1 && pb1%2==0 && a1%2!=0 && b1>0  ){
                    x1=pb1 / a1;
                    System.out.println("la valeur de x2 est " + x1);
                  }
                  if(pb1<a1 && pb1%2 !=0 && a1%2 !=0 && b1<0 ||pb1<a1 && pb1%2 ==0 && a1%2 ==0 && b1<0 ){
                     System.out.println("la valeur de x2 est -" + pb1+"/"+a1);
                  
                  }if (pb1<a1 && pb1%2 !=0 && a1%2!=0 && b1>0 ||pb1<a1 && pb1%2 ==0 && a1%2 ==0 && b1>0){
                     System.out.println("la valeur de x2 est "  + pb1+"/"+a1);
                  }


                   if (pb2>a1 && pb2%2==0 && a1%2==0 && b2<0 || pb2==a1  ){
                    x3=pb2 / a1;
                    System.out.println("la valeur de x3 est -" + x3);
                  }
                  if (pb2>a1 && pb2%2==0 && a1%2==0  && b1>0   ){
                    x3=pb2 / a1;
                    System.out.println("la valeur de x3 est " + x3);
                  }
                  if(pb2<a1 && pb2%2 !=0 && a1%2 !=0 && b2<0 ||pb2>a1 && pb2%2 ==0 && a1%2 !=0 && b1<0 ){
                     System.out.println("la valeur de x3 est -" + pb2+"/"+a1);
                  
                  }if (pb2<a1 && pb2%2 !=0 && a1%2!=0 && b2>0||pb2<a1 && pb2%2 ==0 && a1%2 ==0 && b2>0){
                     System.out.println("la valeur de x3 est "  + pb2+"/"+a1);
                  }
                  }
                  
                }
             
                }
            } 
}