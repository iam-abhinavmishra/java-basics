import java.util.*;
public class circumference {
    public static void radius(int a){
        double c=2*Math.PI*a;
        System.out.println(c);
    }
    public static void main(String[] args){
        Scanner d=new Scanner(System.in);
        int x=d.nextInt();
        radius(x);
    }
}
