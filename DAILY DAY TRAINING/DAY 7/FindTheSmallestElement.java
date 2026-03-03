public class FindTheSmallestElement {

    public static void main(String[] args) {
        // find the smallest element without using sorting.
        int[] arr = {5, 2, 9, 1, 5, 6};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is: " + smallest);
    }
}
