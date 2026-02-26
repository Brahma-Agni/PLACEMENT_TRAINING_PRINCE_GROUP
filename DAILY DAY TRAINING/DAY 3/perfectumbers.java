import java.util.Scanner;
public class perfectumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n Enter the digit to verify: ");
        int num =  scan.nextInt();
        int sum = 0;
        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.printf("The Given number %d is a Perfect Number",num);
        }
        else{
            System.out.printf("The Given number %d is not a Perfect Number",num);
        }
        scan.close();
    }
}
