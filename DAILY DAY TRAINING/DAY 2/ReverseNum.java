import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rev = 0;
        int num = Math.abs(scan.nextInt());

        while(num>0){
            rev = (rev*10) + (num%10);
            num /= 10;
        }
        scan.close();
        System.out.println("The reverse of the digit = "+rev);
    }

    
}
