import java.util.Scanner;
public class checkPalindrome {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("\n \n \n");

    System.out.println("Enter the num to check for Palendrome : ");
    int num = scan.nextInt();
    int temp = num;
    int rev = 0;
    while(num>0){
        rev = rev * 10 + num % 10;
        num/=10;        
    }
    if(rev == temp){
        System.out.println("Given number is a palendrome");
    }
    else{
        System.out.println("Not a palendrome");
    }
    scan.close();

    }

    

}
