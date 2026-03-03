public class DownTriangleI {
    public static void main(String[] args) {
        int num = 5;
        for(int i = num; i>=0; i--){
            for(int j = num; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
