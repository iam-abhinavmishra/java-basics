import java.util.*;
public class addfunction {
    public static int sum(int x,int y){
        int z=x+y;
        return z;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  x= sc.nextInt();
        int y= sc.nextInt();
        int z=sum(x,y);
        System.out.println(z);
    }
    
}
