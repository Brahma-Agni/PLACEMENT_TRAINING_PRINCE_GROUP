import java.util.Scanner;
public class SumOfDivisorsOfNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Divisors of " + number + ":");
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println("Sum = "+sum);
        scan.close();

}
}


