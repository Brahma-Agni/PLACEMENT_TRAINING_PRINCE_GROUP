import java.util.Scanner;
public class Table0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Enter the number for the table: ");
        int num = scan.nextInt();
        for(int i = 1; i<=10 ; i++)
            System.out.printf("\n %d X %d = %d \n",i,num,i*num);
        scan.close();
    }
}
