import java.util.*;
public class greatestno {
    public static void greatest(int a,int b){
        if(a>b){
            System.out.println("a is greater then b");
        }
        else{
            System.out.println("b is greater then a");
        }
    }
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int x=d.nextInt();
        int y=d.nextInt();
        greatest(x,y);
    }
}
