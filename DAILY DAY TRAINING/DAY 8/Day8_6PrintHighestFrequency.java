import java.util.HashMap;
public class Day8_6PrintHighestFrequency {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Integer, Integer> fmap = new HashMap<>();
        int arr[] = {1,2,2,3,4,5,5,5,6,7,8,10};
        // input array into hashmap
        for(int i=0; i<arr.length; i++){
            if(fmap.containsKey(arr[i])){
                fmap.put(arr[i], fmap.get(arr[i])+1);
            }else{
                fmap.put(arr[i], 1);
            }
        }
        // find the highest frequency        
        int maxFreq = 0;
        for(int key : fmap.keySet()){

            if(fmap.get(key) > maxFreq){
                maxFreq = fmap.get(key);
            }
        }
        System.out.println("Highest frequency: " + maxFreq);
    }
    
}