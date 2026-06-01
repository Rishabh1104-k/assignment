import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        long largestFactor = 0;

        // Remove factors of 2
        while (num % 2 == 0) {
            largestFactor = 2;
            num /= 2;
        }

        // Check odd factors
        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }

        // If remaining number is prime
        if (num > 2) {
            largestFactor = num;
        }

        System.out.println("Largest Prime Factor = " + largestFactor);

        sc.close();
    }
}