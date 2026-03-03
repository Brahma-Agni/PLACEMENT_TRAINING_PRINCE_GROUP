import java.util.Scanner;
public class Triangle1_21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //int num = scan.nextInt();
        int num = 5;
        System.out.println("\n\n\n");
        /*
        1 2 3 4 5 6
        7 8 9 10 11
        12 13 14 15
        16 17 18
        19 20
        21
        */
        int count = 1;
        for(int i = num; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        scan.close();
    }
}
