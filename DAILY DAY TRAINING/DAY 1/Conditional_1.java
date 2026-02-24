import java.util.Scanner;
class conditional_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int marks = Math.abs(scan.nextInt());
        // conditional statments for the if else statment for the grades.

        if(marks>=90 && marks<100){
            System.out.println("Grade: O ");
        }
        else if(marks >= 80){
            System.out.println("Grade: A ");
        }
        else if(marks >= 70){
            System.out.println("Grade: B ");
        }
        else if(marks >= 60){
            System.out.println("Grade: C ");
        }
        else if(marks >= 50){
            System.out.println("Grade: D ");
        }
        else{
            System.out.println("No Grade: U");
        }

        scan.close();
        
}
}