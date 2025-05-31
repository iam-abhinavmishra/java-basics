import java.util.*;
public class sumofodd {
    public static void sum(int n){
        int s=0;
        for(int i=n ; i>=1;i--){
            if(i%2 !=0){
                s=s+i;

            }
        
        }
        System.out.println(s);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sum(a);

    }

}
