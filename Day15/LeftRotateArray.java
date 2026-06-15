public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int first = arr[0];

        // Shift elements to the left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Put the first element at the end
        arr[arr.length - 1] = first;

        System.out.println("Array after left rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}