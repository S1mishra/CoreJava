package CollectionAPI;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();

        for(int i=320; i<=330; i+=2){
            s.add(i);
        }

        subs = (TreeSet<Integer>) s.subSet(326, true, 328, true); 
        //subs.add(332); //will throw illegal argument exception -> since the subset is created using a range of original set, the element that we are trying to insert must fall within that range.
        subs.add(327); //valid -> the returned subset is backed by the original set so, if we insert or remove an element from the subset, the same will be reflected in the original set
        System.out.println(s + "Original treeSet elements: " + s);
        System.out.println(s + "Subset elements: " + subs);
    }
}

