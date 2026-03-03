import java.util.Scanner;
    class Car {
    int model_id = 0;
    String color = "white";
    int cc = 1800;

    Car(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter model ID: ");
        this.model_id = scan.nextInt();
        System.out.print("Enter color: ");
        this.color = scan.next();
        System.out.print("Enter CC: ");
        this.cc = scan.nextInt();
        scan.close();
    }


    
}
public class Cars{
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Model ID: " + car1.model_id);
        System.out.println("Color: " + car1.color);
        System.out.println("CC: " + car1.cc);
       
    }
}