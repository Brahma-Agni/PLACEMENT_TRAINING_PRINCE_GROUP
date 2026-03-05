import java.util.HashMap;
public class Day8_1HashMap{
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,78);
        map.put(2, 90);
        map.put(3, 56);
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(3));
    }
}