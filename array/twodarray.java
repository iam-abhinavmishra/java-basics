import java.util.*;
public class twodarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many rows you want ");
        int  x=sc.nextInt();
        System.out.println("how many coloms you want ");

        int  y=sc.nextInt();

        int[][] matrix=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.println("enter value of [ " +i+ " ][ " +j+ " ]");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("given matrix is ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(matrix[i][j]+" ") ;
            
            }
            System.out.println();
        }



    }
}
