import java.util.HashSet;
public class FindUniqueElementsArray {
    public static void main(String args[]){
        int arr[] = {10, 20, 30, 40, 50, 110, 120, 130, 700, 20, 30, 40, 50, 60, 130, 140, 700, 800};
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }
        System.out.print("Unique elements are: "+set+" ");
    }
}
