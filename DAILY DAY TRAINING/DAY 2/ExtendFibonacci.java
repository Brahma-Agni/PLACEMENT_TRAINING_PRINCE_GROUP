public class ExtendFibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 1, n4;
        System.out.printf("%d %d %d",n1,n2,n3);
        for(int i = 0; i<=10 ; i++){
            n4 = n1+n2+n3;
            System.out.printf(" %d",n4);
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }
        

       


        

    }
}
