import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n \n \n Enter the number to be extracted : ");

        int num = Math.abs(scan.nextInt());
    
        int sum = 0;

        while(num > 0){
            System.out.print(" "+num%10);
            sum += num%10;
            num/=10;
        }
        System.out.print("\n Sum of the digits = "+sum);
        scan.close();        
    }
}
