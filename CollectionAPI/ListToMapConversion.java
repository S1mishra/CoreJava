package CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapConversion {
    public static void main(String[] args){
        //Java 8 -> Stream API -> Collectors.toMap()
        
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Map<Integer, List<String>> map = new HashMap<>();
        //Use length of string as key
        for(String s : list){
            int length = s.length();
            map.putIfAbsent(length, new ArrayList<>());
            map.get(length).add(s);
        }
        System.out.println(map);

        //OR
        
        Map<Integer, List<String>> map2 = list.stream()
            .collect(Collectors.groupingBy(String::length));
        System.out.println(map2);
    }
    
}
