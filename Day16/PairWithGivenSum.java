package Day16;

public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int sum = 7;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}
