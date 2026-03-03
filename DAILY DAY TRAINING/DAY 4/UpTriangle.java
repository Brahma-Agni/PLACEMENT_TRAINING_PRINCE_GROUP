public class UpTriangle {
    public static void main(String[] args) {
        int num = 5;
        System.out.print("\n\n\n");
        for(int i = num; i>0; i--){
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
