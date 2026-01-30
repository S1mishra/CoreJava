package CollectionAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableAndMutableInCollection {

    public static void main(String[] args){

    HashSet<String> keys = new HashSet<>(List.of("a", "b", "c"));
    ArrayList<String> values = new ArrayList<>(Set.of("1", "2", "3"));

    //So even though both the collections are made from immutable collections,
    //we can still modify them because the collections themselves are mutable

    Map<String, String> mutableMap = new HashMap<>();
    int i = 0;
    for(String key : keys){
        mutableMap.put(key, values.get(i++));
    }

    keys.clear();
    values.clear();
    System.out.println(mutableMap.keySet().size() + " " + mutableMap.values().size() );
    
}
}

