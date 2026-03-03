public class SymmentricPatterns {
    public static void main(String[] args) {
        System.out.print("\n\n\n");
        int num = 4;
        for (int i = 1; i <= num; i++) {
            // forward
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // backward
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}


/*
4 times loop.

1
121
1231
1234321

// first loop
1. 1
2. 12
3. 123
4. 1234

// second loop
1. 
2. 1
3. 21
4. 321

*/