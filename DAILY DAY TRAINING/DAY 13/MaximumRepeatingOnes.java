public class MaximumRepeatingOnes {
    public static int maximumRepeatingOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1};
        System.out.println("\n\n\n\n"+maximumRepeatingOnes(arr)); // Output: 3
    }
}
