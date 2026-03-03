public class Triangle {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("\n\n");
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
    }    
}

/*  // this is the pattern to print.
___*
__* *
_* * *
* * * *

*/
