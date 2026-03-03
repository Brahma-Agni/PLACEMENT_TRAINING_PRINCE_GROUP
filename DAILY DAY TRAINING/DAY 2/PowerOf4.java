import java.util.Scanner;
public class PowerOf4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n");
        int n = scan.nextInt();
        if( (n > 0) && ((n & (n - 1)) == 0) && (n & 0x55555555) != 0 ){
            System.out.println("power of 4");
        }
        else
            System.out.println("not a power of 4");

        scan.close();
    }
}
