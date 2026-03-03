public class Butterfly {
    public static void main(String[] args) {
        int n = 5;
        // upper part of butterfly

        for(int i=1; i<n; i++){

            // left wing
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int k =1; k<=2*(n-i); k++){
                System.out.print(" ");
            }

            //right wing
            for(int j =1; j<=i; j++){
                System.out.print("*");
             }
             System.out.println();
        }

        // lower part of butterfly
        for(int a = 1; a<=n; a++){

            // left wing
            for(int b =1; b<=n-a+1; b++){
                System.out.print("*");
            }

            // spaces
            for(int c =1; c<=2*a-2; c++){
                System.out.print(" ");
            }

            //right wing
            for(int b =1; b<=n-a+1; b++){
                System.out.print("*");
             }
             System.out.println();
        }
    }    
}
