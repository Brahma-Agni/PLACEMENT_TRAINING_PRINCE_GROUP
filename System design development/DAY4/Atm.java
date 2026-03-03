import java.util.Scanner;

class account{
    String name;
    int accno;
    double balance;
    account(String name, int accno, double balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    
}

public class Atm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        account hvt = new account("Harshal", 3456, 10000);
    

        
       
        while (true) { 
            System.out.println("Welcome to the ATM machine \n1. Balance\n2. Fetch Details\n3. Withdraw Money");
            // switch case to implement the atm machine
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance is: " + hvt.balance);
                    break;
            case 2:
                System.out.println("Name: " + hvt.name);
                System.out.println("Account Number: " + hvt.accno);
                break;
            case 3:
                System.out.println("Enter the amount to withdraw: ");
                double amount = scan.nextDouble();
                if(amount > hvt.balance){
                    System.out.println("Insufficient balance");
                }else{
                    hvt.balance -= amount;
                    System.out.println("Amount withdrawn successfully. Your new balance is: " + hvt.balance);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
            
        }

            

        
    }
}
