import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("what operation you want to perform:\npress 1 for addition\npress 2 for difference\n press 3 for multiply\npress 4 for divide\n press 5 for mod");
        int c=sc.nextInt();
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int dib=a/b;
        int mod=a%b;
        
        switch(c){
            case 1:System.out.println(sum);
            break;
            case 2:System.out.println(diff);
            break;
            case 3:System.out.println(mul);
            break;
            case 4:System.out.println(dib);
            break;
            case 5:System.out.println(mod);
            break;
            default:System.out.println("invalid input");
        }  
    }
}
