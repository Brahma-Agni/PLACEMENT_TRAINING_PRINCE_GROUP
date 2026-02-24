import java.util.Scanner;
public class Conditional_0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Welcome to my Java program \n");
        // ----- this is the normal even number problem ----- //  
        System.out.print("Enter the Input : ");
        int a = scan.nextInt();
        if(a%2 == 0)
        {
            System.out.printf("Given number %d is an even", a);
        }
        else
        {
            System.out.printf("Given number %d is not an even", a);
        }
        


        scan.close();

    }
}
