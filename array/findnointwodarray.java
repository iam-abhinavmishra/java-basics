import java.util.*;

public class findnointwodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rows do you want?");
        int rows = sc.nextInt();

        System.out.println("How many columns do you want?");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking input for matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Which number do you want to search?");
        int target = sc.nextInt();

        boolean found = false;

        // Searching the number
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("The number is present at [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("The number is not present in the array.");
        }

        sc.close(); // Close scanner
    }
}
