package ArraysVsCollectionsVsStreams;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args){
        //Count frequency of number in an array using map
        int[] array = {1,2,3,4,5,2,3,5,5,5};
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int n : array){
            if(frequency.containsKey(n)){
                frequency.put(n, frequency.get(n) + 1);
            } else {
                frequency.put(n, 1);
            }
        }

        System.out.println("Frequency of numbers in the array:" + frequency);
    }
    
}
//What if list was used instead of map?
// We would have to iterate through the list each time to find if the number already exists

