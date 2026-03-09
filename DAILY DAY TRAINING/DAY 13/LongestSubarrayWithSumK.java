public class LongestSubarrayWithSumK{
    public static int longestSubarrayWithSumK(int[] arr, int k){
        int maxLength = 0;
        int currentSum = 0;
        java.util.HashMap<Integer, Integer> sumIndexMap = new java.util.HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum == k) {
                maxLength = i + 1;
            }

            if (!sumIndexMap.containsKey(currentSum)) {
                sumIndexMap.put(currentSum, i);
            }

            if (sumIndexMap.containsKey(currentSum - k)) {
                maxLength = Math.max(maxLength, i - sumIndexMap.get(currentSum - k));
            }
        }

        return maxLength;
    }

    public static void main(String[] args){
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println(longestSubarrayWithSumK(arr, k));

    }
}