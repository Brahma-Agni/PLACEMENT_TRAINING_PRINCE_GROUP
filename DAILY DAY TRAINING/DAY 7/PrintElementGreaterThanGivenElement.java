public class PrintElementGreaterThanGivenElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 110, 120, 130, 700};
        int in = 50;
        System.out.println("Elements greater than " + in + " are: ");
        for (int num : arr) {
            if (num > in) {
                System.out.print(num + " ");
            }
        }
    }
}
