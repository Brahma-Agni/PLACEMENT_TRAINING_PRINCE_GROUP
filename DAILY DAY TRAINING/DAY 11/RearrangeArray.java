public class RearrangeArray {
    public static void main(String[] args) {
        //Rearrange Array (Positive First, Negative Later)(Rearrange array so that all positive numbers appear before negative numbers inplace.)
        int[] arr = {1, -2, 3, -4, 5, -6};
        rearrange(arr);
    }

    public static void rearrange(int[] arr) {
        int n = arr.length;
        int j = 0; // Pointer for the next position of positive number

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) { // If the current element is positive
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++; // Move the pointer for the next positive number
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
