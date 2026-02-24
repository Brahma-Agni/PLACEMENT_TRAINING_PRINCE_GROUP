public class Fibonacci {
    public static void main(String[] args) {
        int a1 = 1, a2 = 1 , a3;
        System.out.println(0);

        for(int i = 1; i<=20; i++){
            a3 = a1 + a2;
            System.out.print(" "+a1);
            a1 = a2;
            a2 = a3;
        } 
    }
}
