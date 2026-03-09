public class OptimalRotationArray {
    public static void leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0]; // Store the first element

        // Shift elements to the left
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = temp; // Place the first element at the end

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        // left rotate array by 1
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr);
    }
}
