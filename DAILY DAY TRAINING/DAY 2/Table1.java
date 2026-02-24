import java.util.Scanner;
public class Table1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("/n");
        System.out.println("Enter the no of Tables to be printed : ");
        int n = scan.nextInt();
        for(int i = 1; i<=n; System.out.print("\n"), i++){
            for(int j = 1; j<=10; j++)
                System.out.printf("%d \t",j*i);
            
        }
        /*
       for(int i = 1; i<=n; i++){
            for(int j = 1; j<=10; j++)
                System.out.print(j*i+"  ");
            System.out.print("\n");
        }
        */
       scan.close();
        
    }
}
