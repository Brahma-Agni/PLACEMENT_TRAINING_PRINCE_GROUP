public class InvertedTriangle {
    public static void main(String[] args) {
        int num = 4;
       for(int i = num; i>=1; i--)
       {
        for(int a = i; a<num; a++){
            System.out.print(" ");
        }

        for(int b=1; b<=i; b++){
            System.out.print("* ");
        }

        System.out.println();
       }
    }
}

/*

* * * * 
 * * * 
  * * 
   *
*/
