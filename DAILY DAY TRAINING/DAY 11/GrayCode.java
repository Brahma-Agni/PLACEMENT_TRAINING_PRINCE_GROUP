import java.util.*;
public class GrayCode {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int totalNumbers = 1 << n; // Total numbers in Gray code sequence
        System.out.println("\n\n\n\n" + totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            int grayCodeNumber = i ^ (i >> 1); // Generate Gray code number
            result.add(grayCodeNumber);
        }

        return result;
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(grayCode(n));
    }
}
