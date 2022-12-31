package collectionFramework.Anujbhaiya;

import java.util.*;

public class learnset {
    public static void main(String[] args) {
        //Set<Integer> set=new HashSet<>();//adds unique elements in randomized order
        //Set<Integer> set=new LinkedHashSet<>();//adds unique elements in linked order
        Set<Integer> set=new TreeSet<>();//adds unique elements in sorted order
        set.add(10);
        set.add(15);
        set.add(10);
        set.add(20);
        //set.remove(20);
        System.out.println(set);
    }
}
