import java.util.Scanner;
import java.util.TreeMap;
public class Day8_2TreeMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        System.out.println("Enter the reg no and id no :");
        map.put(scan.nextInt(),scan.nextInt());
        System.out.println(map);
        scan.close();
          
    }}

