import java.util.Scanner;
public class bitset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n \n Enter the Number : ");
        int num = scan.nextInt();
        System.out.println("\n \n Enter the bit index : ");
        int loc = scan.nextInt();

        num = num & (1 << loc);

        System.out.println("\n Result: " + num);
        
        scan.close();
    }
    
}
