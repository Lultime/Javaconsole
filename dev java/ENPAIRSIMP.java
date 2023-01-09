public class ENPAIRSIMP{
    public static void main(String[]args){
        int x=0;
        long p=1;
         
        for(int i=1 ;i<20;i++){
            if( i%2==0){
             p=p*i;
             System.out.println(p);
            }else{
                x=x+i;
                 System.out.println(x);
    
            }
        }
        
    
    }
}