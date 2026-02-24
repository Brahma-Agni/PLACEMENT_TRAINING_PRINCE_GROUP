import java.util.Scanner;
public class RangeLoops0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number (Postive number only): ");
        int Start = Math.abs(scan.nextInt());
        System.out.println("Enter the Ending number (Postive number only): ");
        int End = Math.abs(scan.nextInt());

        if(Start%2 == 0){
            System.out.println("\n THIS IS THE EVEN NUMBER!");
            for(int i = Start; i <= End; i+=2){
                System.out.print(" "+ i);
            }
        }
        
        else
        {
            ++Start;
            System.out.println("\n THIS IS THE EVEN NUMBER!");
            for(int i = Start; i <= End; i+=2){
                System.out.print(" "+ i);
            }
        }
        scan.close();
        
        }
        
        
    }

