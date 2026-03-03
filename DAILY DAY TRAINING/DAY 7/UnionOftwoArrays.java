import java.util.HashSet;
public class UnionOftwoArrays {
    public static void main(String[] args) {
    /*Given two arrays find the union of two arrays.*/

    int arr1[] = {10, 20, 30, 40, 50, 110, 120, 130, 700};
    int arr2[] = {20, 30, 40, 50, 60, 130, 140, 700, 800};
    
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr1) {
        set.add(num);
    }
    for (int num : arr2) {
        set.add(num);
    }

    System.out.println(set);

    
}
}