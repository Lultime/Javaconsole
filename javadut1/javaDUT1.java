
package coursjavadut1;

import java.util.ArrayList;
import java.util.Collections;

public class CoursjavaDUT1 {
    public static void main(String[] args) {
     // creation d'une instance de ArrayList
        ArrayList ar=new ArrayList();
        // utilisation des methodes
       ar.add("Janvier");
       ar.add("Fevrier");
       ar.add("Mars");
       ar.add("Avril");
       ar.add("Mai");
       ar.add("Juin");
       ar.add("Juillet");
       ar.add("Aout");
       ar.add("Octobre");
       ar.add("Septembre");
       ar.add("Novembre");
       ar.add("Decembre");
       ar.add(0,"Aucun");
       //
       // 
       // System.out.println("6e Mois:"+ar.get(5));
       
       //System.out.println(ar);
        //System.out.println("Taille:"+ar.size());
        
//        for(Object o:ar){
//            System.out.println(o);
//        }
for(int i=0;i<ar.size();i++){
    System.out.println(ar.get(i));
}

        System.out.println("-------------Methodes-----------");
        System.out.println("Vider");
        //ar.clear();
        // modifier
        ar.set(ar.indexOf("Aucun"),"Aucun");
        
        System.out.println(ar);
        System.out.println("Vide:"+(ar.size()==0));
  System.out.println("-------Avant tri--------");
 for(Object o:ar){
       System.out.println(o);
   }        
  System.out.println("-------Croissant--------");
  Collections.sort(ar);
  for(Object o:ar){
       System.out.println(o);
   }        
  System.out.println("-------Decroissant--------");
   Collections.sort(ar);
 Collections.reverse(ar);
  for(Object o:ar){
       System.out.println(o);
   }      
        System.out.println("Supp Mars");
     ar.remove("Mars");
        System.out.println(ar);
        
    }
   
    
}
