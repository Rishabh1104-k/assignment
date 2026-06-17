import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upper = "";

        // Convert lowercase to uppercase
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);   // Convert to uppercase
            }

            upper = upper + ch;
        }

        System.out.println("Uppercase String: " + upper);

        sc.close();
    }
}