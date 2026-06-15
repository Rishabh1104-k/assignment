package Day16;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 1};
        int n = arr.length;

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;

            // Check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
