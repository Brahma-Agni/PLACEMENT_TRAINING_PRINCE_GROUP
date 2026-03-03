public class ElementSumOfArray {
    static int splitadd(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        int arr[] = {12,34,45,67,89};
        for(int i = 0; i < arr.length; i++)
            arr[i] = splitadd(arr[i]);

        System.out.println("\n\n\n\n");

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+" ");
        }

        
    }
}
