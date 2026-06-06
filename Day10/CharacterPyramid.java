public class CharacterPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Print decreasing characters
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            // Move to next line
            System.out.println();
        }
    }
}
