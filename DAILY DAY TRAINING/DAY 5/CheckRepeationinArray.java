import java.util.HashSet;
public class CheckRepeationinArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        HashSet<Integer> hash = new HashSet<>();
        for(int i: arr){
            if(hash.contains(i)){
                System.out.println("Duplicate exist");
                break;
            }
            hash.add(i);
        }
        System.out.println("no duplicates");

    }
    
}
