import java.util.Arrays;

public class SortBasedOnLastdigit {
    public static void main(String[] args) {
        Integer[] arr = {73, 52, 54, 68};

        /*Arrays.sort(arr, Comparator.comparingInt(n -> Math.abs(n % 10)));

        System.out.println(Arrays.toString(arr)); */
        
        
        Arrays.sort(arr, (a, b) -> Integer.compare(Math.abs(a % 10), Math.abs(b % 10)));
        System.out.println("\n\n\n\n");

        for(int i: arr){
            System.out.print(i+" ");
        }
            

        /* 

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(Math.abs(arr[j] % 10) > Math.abs(arr[j + 1] % 10)){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        */

        
    
    }
}