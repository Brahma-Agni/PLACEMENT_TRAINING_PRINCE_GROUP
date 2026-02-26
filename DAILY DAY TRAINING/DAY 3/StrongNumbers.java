import java.util.Scanner;
public class StrongNumbers {

    public static int factorial(int num){
        int v = 1;
        for(int i =2; i<=num; i++){
            v*=i;
        }
        return v;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n Enter the digit to verify: ");
        int num =  scan.nextInt();
        int temp = num;
        int sum = 0;
        // digit extraction and summation
        while(num>0){
            sum += factorial(num%10);
            num /= 10;
        }

        if(temp == sum){
            System.out.printf("The Given number %d is a Strong Number",temp);
        }
        else{
            System.out.printf("The Given number %d is not a Strong Number",temp);
        }

    }
}
