public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("\n\n\nPascal Triangle\n\n\n");
        int num = 5;
        for(int i = 0; i<num; i++){
            int a = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(a +" ");
                a = a * (i-j) / (j+1);
            }
            System.out.println();

        }
    }
}
