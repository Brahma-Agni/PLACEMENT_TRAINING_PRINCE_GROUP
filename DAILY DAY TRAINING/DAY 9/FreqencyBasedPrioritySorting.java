import java.util.Arrays;
import java.util.HashMap;

public class FreqencyBasedPrioritySorting {
    public static void sortByFrequency(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Integer[] temp = new Integer[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }

        Arrays.sort(temp, (a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            if (freqA == freqB) {
                return a - b;
            }
            return freqB - freqA;
        });

        System.out.println("Sorted array based on frequency:");
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int n = arr.length;
        sortByFrequency(arr, n);
    }
}