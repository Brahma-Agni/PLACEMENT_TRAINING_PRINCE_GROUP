public class PalendromeTriangle {
    public static void main(String[] args) {
        
        System.out.println("\n\n\n");

        int num = 4;
        for(int i = 1; i<=num; i++)
        {
            for(int a = num-i; a>=1; a--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
    }
}
