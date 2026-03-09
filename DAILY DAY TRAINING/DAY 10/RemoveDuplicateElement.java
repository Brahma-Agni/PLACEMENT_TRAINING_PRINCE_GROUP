public class RemoveDuplicateElement {
    public static void sortandremove(char[] arr, int n){
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        int index = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i] != arr[i+1]){
                arr[index++] = arr[i];
            }
        }
        arr[index++] = arr[n-1];
        while(index < n){
            arr[index++] = 0;
        }
    }
    public static void main(String args){
        char[] arr = {'c', 'v', 'b', 'd', 'c'};
        // sort and remove duplicate element
        sort(arr, arr.length);
        for(char a: arr){
            if(a != 0){
                System.out.print(a + " ");
            }
        }
        System.out.println();
        for(char a: arr){
            System.out.print(a + " ");
        }  

    }
}
