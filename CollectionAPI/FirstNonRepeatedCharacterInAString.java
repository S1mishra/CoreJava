package CollectionAPI;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInAString {
    public static void main(String[] args){
        String str = "aabbcde";

        Map<Character, Integer> charCountMap = new LinkedHashMap<>(); //LinkedHashMap maintains insertion order -> because we want first non-repeated character
        for(char c : str.toCharArray()){ //char[] array = {a,a,b,b,c,d,e}
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        //What is getOrDefault() -> If key is present, return the value else return default value provided which is 0 here and why 1? -> because we are counting occurrences

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("First non-repeated character is : " + entry.getKey());
                break;
            }

        }
    }
    
}
