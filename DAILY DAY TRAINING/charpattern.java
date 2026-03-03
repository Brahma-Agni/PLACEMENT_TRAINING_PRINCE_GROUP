public class charpattern {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 4; // Number of characters to generate (a, b, c, d)
         for (int i = 0; i < n; i++) {
            char nextChar = (char) ('a' + i);
            
            // Logic: If even index, add to front. If odd, add to back.
            // (Note: This matches your pattern: a, ba, abc, dabc)
            if (i % 2 == 0) {
                // We add 'a' (0) to back, 'c' (2) to back...
                sb.append(nextChar);
            } else {
                // We add 'b' (1) to front, 'd' (3) to front...
                sb.insert(0, nextChar);
            }
            
            System.out.println(sb.toString());
        }
    }
}
