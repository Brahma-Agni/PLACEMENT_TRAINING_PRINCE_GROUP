


public class Intersect3arrays {
    public static void main(String[] args) {

    /*given three arrays find the intersection of three arrays.
    without using any buildin methords.
    */
    int arr1[] = {10, 20, 30, 40, 50, 110, 120, 130, 700};
    int arr2[] = {20, 30, 40, 50, 60, 130, 140, 700, 800};
    int arr3[] = {30, 40, 50, 60, 70, 130, 700, 900, 1000};

    System.out.println("\n\n\n");
    int i = 0, j = 0, k = 0;
    while (i < arr1.length && j < arr2.length && k < arr3.length) {
        if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
            System.out.print(arr1[i] + " ");
            i++;
            j++;
            k++;
        } else if (arr1[i] < arr2[j]) {
            i++;
        } else if (arr2[j] < arr3[k]) {
            j++;
        } else {
            k++;
        }
    }
    
}
}
