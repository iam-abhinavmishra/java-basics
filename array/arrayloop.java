import java.util.*;

public class arrayloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int array[] = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Print array elements
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        sc.close(); // optional but good practice
    }
}
