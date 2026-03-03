public class InsertionSort {
    public static void main(String[] args) {
        
        int arr2[] = {5,30,25,33,11};
        for(int i = 1; i < arr2.length; i++){
            int key1 = arr2[i];
            int j = i-1;
            while(j >= 0 && arr2[j] > key1){
                arr2[j+1] = arr2[j];
                j--;
            }
            arr2[j+1] = key1;
        }
        System.out.println("\nAfter insertion sort:");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}
