import java.util.Scanner;

public class properDivisors {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the number to find the divisors: ");
        int number = scan.nextInt();
        System.out.println("Divisors of " + number + ":");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(" "+i);
            }
        }
    }
}
