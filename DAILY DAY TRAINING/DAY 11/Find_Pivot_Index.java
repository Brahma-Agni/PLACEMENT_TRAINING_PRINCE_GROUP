public class Find_Pivot_Index {
    
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(arr);
        System.out.println("Pivot Index: " + pivotIndex);
    }

    public static int findPivotIndex(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }

        return -1; // No pivot index found
    }
}
