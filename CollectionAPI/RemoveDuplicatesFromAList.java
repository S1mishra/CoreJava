package CollectionAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromAList {
    public static void main(String[] args){
        //Immutable list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,3,2);
        System.out.println("Original list: " + numbers);

        //convert it in a set to remove duplicates
        Set<Integer> set = new HashSet<>(numbers);

        //convert back to list
        List<Integer> listWithoutDuplicates = new ArrayList<>(set);

        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }

}
