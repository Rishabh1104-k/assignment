import java.util.Scanner;

public class StringLengthWithoutStrlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = 0;

        // Convert string to character array
        char[] ch = str.toCharArray();

        // Count characters manually
        for (char c : ch) {
            length++;
        }

        System.out.println("Length of the string = " + length);

        sc.close();
    }
}