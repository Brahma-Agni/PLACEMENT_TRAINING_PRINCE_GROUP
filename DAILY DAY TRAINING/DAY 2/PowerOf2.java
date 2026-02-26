import java.util.Scanner;
public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n \n Enter the Number : ");
        int a = scan.nextInt();

        if(a>0 && (a & (a-1)) == 0){
            System.out.println("The number is a power of 2");
        } else {
            System.out.println("The number is not a power of 2");
        }
        scan.close();
    }    
}

/*
4 2 1
1 0 0
0 1 1
-----
0 0 0

8 4 2 1
0 1 0 1
0 1 0 0
-------
0 1 0 0


24 23 22 21 20
16 8 4 2 1
1 0 0 0
0 1 1 1
-------
0 0 0 0
*/