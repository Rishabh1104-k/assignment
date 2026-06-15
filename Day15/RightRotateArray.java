public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int last = arr[arr.length - 1];

        // Shift elements to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Put the last element at the beginning
        arr[0] = last;

        System.out.println("Array after right rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}