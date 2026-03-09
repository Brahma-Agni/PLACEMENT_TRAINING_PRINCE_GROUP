public class SecondLargestElem {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        // without using using collections framework
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }
            
        System.out.println("The second largest element in the array is: " + secondLargest);
        }
    }
}
