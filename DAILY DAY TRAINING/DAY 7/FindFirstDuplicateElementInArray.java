import java.util.HashSet;
public class FindFirstDuplicateElementInArray {
    public static void main(String[] args) {
        // array = {10, 5, 8, 5, 10, 3}
        // output = 5

        int arr[] = {10, 5, 8, 5, 10, 3};
        int duplicate = -1;
        
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                duplicate = num;
                break;
            } else {
                set.add(num);
            }
        }
        System.out.println("\n\n\n\n\nDuplicate element is: "+duplicate);
    }
}
