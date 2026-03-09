public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                found = true;
                System.out.println("Element " + target + " found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
