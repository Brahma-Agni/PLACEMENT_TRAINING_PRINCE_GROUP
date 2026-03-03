//import java.util.Scanner;
class student{
    int regno = 16;
    String name = "Harshal Varadan";
    int year = 3;

    student()
    {
        System.out.println("\n\n\n");
        System.out.println("normal constructor");
        System.out.println("Reg No: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    }

    student(int regno, String name, int year){
        this.regno = regno;
        this.name = name;
        this.year = year;
        System.out.println("\n\n\n");
        System.out.println("parameterized constructor");
        System.out.println("Reg No: " + regno);
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);

    }
/* 
void getterSetter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the register no: ");
        regno = scan.nextInt();
        System.out.println("Enter the Name : ");
        name = scan.nextLine();
        System.out.println("Enter the year : ");
        year = scan.nextInt();
        scan.close();
    }
*/
    
}


public class STUDENT_ERP {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(1, "Ashwin Kumar", 4);
        //s1.getterSetter();
    }
}
