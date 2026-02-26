
import java.util.Scanner;

public class armstrong {

    public static int powerofdigit(int count, int num){
        int power = (int)Math.pow(num,count);
        return power;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arm = scan.nextInt();
        int num = arm;
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        num = arm;
        int sum = 0;
        while(num>0){
            sum += powerofdigit(count,num%10);
            num/=10;   
        }

        if(sum == arm){
            System.out.printf("The Given number %d is an Armstrong Number",arm);
        }
        else{
            System.out.printf("The Given number %d is not an Armstrong Number",arm);
        }
    }
}
