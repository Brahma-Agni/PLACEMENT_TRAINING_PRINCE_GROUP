import java.util.HashMap;
import java.util.Scanner;
public class CountFrequencyOfELements {
   
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\nEnter the number of elements you wanted to input: ");
        int inputno = scan.nextInt();
        int arr[] = new int[inputno];
        System.out.println("Enter the elements one by one: ");
        for(int i = 0; i<inputno; i++){
            arr[i] = scan.nextInt();
        }
        // we have to find the frequency of the each element.
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<inputno; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Element -> Frequency");
        for(var entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("The frequency of the elements are: ");
        for(int i = 0; i<inputno; i++){
            System.out.println(arr[i] + " -> " + map.get(arr[i]));
        }

    }
}
