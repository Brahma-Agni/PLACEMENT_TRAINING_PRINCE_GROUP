import java.util.Scanner;
public class gcdEdulidan {
    public static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n enter the first number: ");
        int a = scan.nextInt();
        System.out.println(" enter the second number: ");
        int b = scan.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        
    }
}
