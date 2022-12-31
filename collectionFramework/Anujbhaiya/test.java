package collectionFramework.Anujbhaiya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class test {

        public static void main(String[] args)
        {
            int[] ints = {9,2,3};
            List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
            List<Integer> list1 = Arrays.stream(ints).boxed().toList();
            List kar = Arrays.asList(ints);
            Collections.sort(list);
            System.out.println(list);
            System.out.println(list1);
            int[] arr = {1, 2, 3};
            List<Integer> listz = new ArrayList<Integer>();
            Collections.addAll(listz, Arrays.stream(arr).boxed().toArray(Integer[]::new));
            System.out.println(listz);
            List<Integer> x = new ArrayList<Integer>();
           Object[]temp1=list1.toArray();
            System.out.println(Arrays.toString(temp1));
            Integer temp2[] = new Integer[list1.size()];
            temp2 = list1.toArray(temp2);
        }


}
