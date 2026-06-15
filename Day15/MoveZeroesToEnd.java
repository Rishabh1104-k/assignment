public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 4, 0, 5};

        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeroes to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}