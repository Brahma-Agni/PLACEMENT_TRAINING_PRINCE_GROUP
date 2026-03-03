import java.util.Arrays;
public class SortInDecending {
    public static void main(String[] args) {
        // sort the array in descending order
        int arr[] = {5, 2, 9, 1, 5, 6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        
        System.out.println("Sorted array in descending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        }
    }

