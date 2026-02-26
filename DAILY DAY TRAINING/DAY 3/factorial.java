import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\n\nEnter the Number: ");
        int num = scan.nextInt();
        int result = 1;
        for(int i = 2; i<=num ; i++){
            result = result * i;
        }
        System.out.println("Result of factorial = "+result);
    }
}
