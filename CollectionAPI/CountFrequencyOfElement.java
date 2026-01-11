package CollectionAPI;

import java.util.HashMap;
import java.util.Map;

//getOrDefault -> explore this method as well to solve the same problem
//This method is available in Map interface

public class CountFrequencyOfElement {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,1,2,3,1,1,3,3,3,3,3,6,7,6,6};

        //Imagine a map whose key corresponds to the element of the 
        // array and value against this key is frequency of that 
        // element in the array

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int num : array){
            if(frequencyMap.containsKey(num))
            {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            }
            else
            {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Frequency of elements in the array:" + frequencyMap);
    }
    
}
