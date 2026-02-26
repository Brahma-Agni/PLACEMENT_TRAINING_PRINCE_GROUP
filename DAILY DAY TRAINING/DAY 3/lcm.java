import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n \nEnter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        int d = 1;
        for(int i=1; i<=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                d = i;
            }
        }

        // to find lcm:

        // product rule:
        // a x b = lcm (a,b) x gcd (a,b)
        //lcm(a,b) = (a x b) / gcd(a,b)

        int lcm = (a*b)/d;

        System.out.println("Lcm of the given number = "+lcm);
    }
}
