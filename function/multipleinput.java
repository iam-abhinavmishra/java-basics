import java.util.*;
public class multipleinput {
    
    public static void input(){
        Scanner d=new Scanner(System.in);
        int a=0;
        int b=0;
        int c=0;
        while (true){
            int x=d.nextInt();
            if(x==999){
                break;
             }
            else if(x>0){
                b++;
            }
            else if(x<0){
                c++;
            }
            else{
                a++;
            }
                
        }
        System.out.println("zeroes"+a);
        System.out.println("positive"+b);
        System.out.println("negative"+c);

    }
    public static void main(String[] args){
        input();

        
    }
}
