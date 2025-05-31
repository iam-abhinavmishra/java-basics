import java.util.*;
public class factorial {
    public static void facts(int a){
        if (a<0){
            return;
        }
        int k=1;
        for(int i=a;i>=1; i--){
           
            k=k*i;
            
       }
       System.out.println(k);


    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
    }
}
