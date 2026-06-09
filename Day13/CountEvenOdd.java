import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int evenCount = 0, oddCount = 0;

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        // Display result
        System.out.println("Number of Even elements = " + evenCount);
        System.out.println("Number of Odd elements = " + oddCount);

        sc.close();
    }
}