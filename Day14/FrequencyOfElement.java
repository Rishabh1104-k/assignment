import java.util.Scanner;

public class FrequencyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to find frequency
        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();

        int count = 0;

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        // Display result
        System.out.println("Frequency of " + key + " = " + count);

        sc.close();
    }
}
