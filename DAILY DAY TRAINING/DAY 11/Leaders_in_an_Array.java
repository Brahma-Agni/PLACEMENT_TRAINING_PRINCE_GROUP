public class Leaders_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        PL(arr);
    }

    public static void PL(int[] arr) {
        int n = arr.length; 
        int MR = arr[n - 1];
        System.out.print(MR + " ");

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > MR) {
                MR = arr[i];
                System.out.print(MR + " ");
            }
        }
    }
}