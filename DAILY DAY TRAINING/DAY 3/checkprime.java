import java.util.Scanner;
public class checkprime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n \n");
        System.out.print("Enter the number to check for prime : ");
        int num = scan.nextInt();
        boolean flag = false;
        for(int i =2; i< (int)Math.sqrt(num);i++){
            if(num%i == 0){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.printf("Given number %d is not a Prime",num);
        }
        else{
            System.out.printf("Given number %d is a Prime number",num);

        }

        scan.close();


    }
}
