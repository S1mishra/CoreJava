package ArraysVsCollectionsVsStreams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetVsList {
    public static void main(String[] args){
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Hello");
        listOfStrings.add("Soumya,");
        listOfStrings.add("How");
        listOfStrings.add("are");
        listOfStrings.add("you");
        listOfStrings.add("?");
        listOfStrings.add("?");

        System.out.println("List allows duplicates: " + listOfStrings);

        //Convert List to Set to remove duplicates
        Set<String> setOfStrings = new HashSet<>(listOfStrings);
        System.out.println("Set removes duplicates: " + setOfStrings);

        Set<String> setOfStrings2 = new LinkedHashSet<>(listOfStrings);
        System.out.println("LinkedHashSet maintains insertion order: " + setOfStrings2);

        //if not passed in constructor of HashSet, then we can add elements like this
        //setOfStrings.addAll(listOfStrings);
    }
}

//Very imp:
/*
List (ArrayList): Maintains insertion order → [Hello, Soumya,, How, are, you, ?, ?]
Set (HashSet): Uses hash codes to store elements internally, order is unpredictable → [How, Soumya,, Hello, are, you, ?]

If you need to maintain order while removing duplicates, use LinkedHashSet:

*/
