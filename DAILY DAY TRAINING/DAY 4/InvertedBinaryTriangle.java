public class InvertedBinaryTriangle {
    public static void main(String[] args) {
        System.out.println("\n\n\n");
        int count = 1;
        int num = 5;
        for(int i = num; i>=1; i--)
       {
        for(int a = i; a<num; a++){
            System.out.print(" ");
        }

        for(int b=1; b<=i; count++, b++){
            System.out.printf( "%d ",count & 1);
        }
        System.out.println();
       }
    }
}
