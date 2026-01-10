package ArraysVsCollectionsVsStreams;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args){
        List<Integer> lists = new ArrayList<>();
        for(int i=0; i<5; i++){
            lists.add(i);
        }
        lists.add(3);//adding duplicate element
        for (Integer integer : lists) {
            System.out.println(integer);
        }
        System.out.println(lists.size());
        lists.remove(3); //removing element at index 3
        System.out.println("After removing element at index 3:");
        for (Integer integer : lists) {
            System.out.println(integer);
        }

        lists.remove(Integer.valueOf(3)); //removing element with value 3 
        for (Integer integer : lists) {
            System.out.println(integer);
        }
    }
    
}
