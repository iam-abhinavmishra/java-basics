import java.util.*;

public class findnointwodarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers do you want to insert in the array?");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Input values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Which number do you want to search? ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                System.out.println(x + " is present at index " + i);
                found = true;
                break;  // remove if you want to find all occurrences
            }
        }

        if (!found) {
            System.out.println(x + " doesn't exist in the array.");
        }

        sc.close();
    }
}
