import java.util.Scanner;
public class SumDigitsTillSingleDigit {

    public static int adders(int num){
        int add = 0;
        
        while(num>0){
            add = num%10;
            num/=10;
        }
        return add;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n enter the number: ");
        int num = scan.nextInt();
        while(num>=10){
            num = adders(num);               
        }
        System.out.println("Result = "+num);

    }
}
