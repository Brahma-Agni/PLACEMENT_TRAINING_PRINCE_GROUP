public class FloydPattern {
    public static void main(String[] args) {
        int num = 4;
        System.out.println("\n\n\n\n");
        int count = 1;
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; count++, j++){
                System.out.printf("%d",count);
            }
            System.out.println();
        }
    }
    
}
/*

1
23
456
78910

*/
