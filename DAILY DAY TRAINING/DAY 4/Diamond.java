import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int x = num; x>=1; x--)
       {
        for(int y = x; y<num; y++){
            System.out.print(" ");
        }

        for(int z=1; z<=x; z++){
            System.out.print("* ");
        }

        System.out.println();
       }
        // up triangle
        for(int i = 1; i<=num; i++)
        {
            for(int a = num-i; a>=1; a--){
                System.out.print(" ");
            }
            for(int b=1; b<=i; b++){
                System.out.print("* ");
            }
            System.out.println();

        }
   
        // down triangle
        
    }
}


