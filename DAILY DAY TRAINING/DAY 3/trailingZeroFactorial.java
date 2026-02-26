import java.util.Scanner;

public class trailingZeroFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // factorial
        System.out.print("\n\n\n\nEnter the Number: ");
        int num = scan.nextInt();
        int fact = 1;
        for(int i = 2; i<=num ; i++){
            fact = fact * i;
        }
        // trailling zeros
        int count = 0;
        while(fact%10 == 0 && fact>0){
        //while(fact>0){
            if(fact%10 == 0)
                ++count;
            fact/=10;
        }

        System.out.println("no of trailing zeros : "+ count);
        scan.close();
    }
}
