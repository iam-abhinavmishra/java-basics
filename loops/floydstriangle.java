public class floydstriangle {
    public static void main(String[] args){
        int k=01;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k +" " );
                k++;
            }
            System.out.println();
        }
    }
}
