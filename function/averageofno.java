import java.util.*;
public class averageofno {
    public static int average(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.print(average(x,y,z));

    }
}
