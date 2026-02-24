import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int month = scan.nextInt();
        System.out.println("No of days of the entered month is: ");
        switch(month){
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("INVALID MONTH NUMBER.");
            
        }
        scan.close();
        
    }
}
