public class BinaryTriangle {
    public static void main(String[] args) {
        int count = 1;
        int num = 5;
        for(int i = 1; i<=num; i++)
        {
            for(int a = num-i; a>=1; a--){
                System.out.print(" ");
            }
            for(int b=1; b<=i; count++, b++){
                System.out.printf("%d ",count&1);
            }
            System.out.println();

        }
    }
}
