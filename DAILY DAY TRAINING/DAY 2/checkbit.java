public class checkbit {
    public static void main(String[] args) {
        int n = 5; // Example number
        int k = 1; // Bit position to check (0-indexed)
        
        boolean isSet = (n & (1 << k)) != 0;
        
        if (isSet) {
            System.out.println("The " + k + "-th bit of " + n + " is set.");
        } else {
            System.out.println("The " + k + "-th bit of " + n + " is not set.");
        }
    }
}
