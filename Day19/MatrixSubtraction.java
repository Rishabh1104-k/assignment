package Day19;

public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] a = {
            {5, 8},
            {6, 7}
        };

        int[][] b = {
            {2, 3},
            {4, 1}
        };

        int[][] result = new int[2][2];

        // Subtract matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Subtraction of Matrices:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
