import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Math.abs(scan.nextInt());
        int product = 1;

        for(int i = 2; i<=a; i++){
            product *= i;
        }
        System.out.println("The Factorial of the number = "+ product);

        scan.close();
    }
}
