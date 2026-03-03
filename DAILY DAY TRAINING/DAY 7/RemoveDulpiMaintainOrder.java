public class RemoveDulpiMaintainOrder {
    public static void main(String[] args) {
        // remove duplicates from array and maintain the order of elements.
        int arr[] = {10, 5, 8, 5, 10, 3};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (temp[k] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}

// elements present in first array but not in second array

// check if the array contains any duplicate elements.

