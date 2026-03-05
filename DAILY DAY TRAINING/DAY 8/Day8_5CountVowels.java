import java.util.Scanner;
import java.util.HashMap;
public class Day8_5CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        
        HashMap<Character, Integer> vowelCount = new HashMap<>();
        
        // Initialize the vowel count
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);
        
        // Count the vowels in the input string
        for (char ch : input.toLowerCase().toCharArray()) {
            if (vowelCount.containsKey(ch)) {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }
        
        // Print the count of each vowel
        System.out.println("Vowel counts:");
        for (char vowel : vowelCount.keySet()) {
            System.out.println(vowel + ": " + vowelCount.get(vowel));
        }
        
        sc.close();
    }
    
}
