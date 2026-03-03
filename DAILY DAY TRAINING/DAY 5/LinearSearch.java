public class LinearSearch {
    public static void main(String[] args) {
        int arr1[] = {5,30,25,33,11};
        // Linear search
        int key = 25;
        boolean found = false;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == key){
                found = true;
                break;
            }
        }
        System.out.println("\nFound: "+found);

    }
}
