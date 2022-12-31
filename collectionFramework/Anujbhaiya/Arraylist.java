package collectionFramework.Anujbhaiya;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        System.out.println(list.get(1));
        System.out.println(list);
        list.add(2,25);
        list.set(2,33);
        System.out.println(list);
        //list.remove(2);
        list.remove(Integer.valueOf(33));
        System.out.println(list);
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(99);
        arr.add(199);
        list.addAll(arr);
        System.out.println(list);
        System.out.println(list.contains(13));
       // list.clear();
        System.out.println(list);

       // Collections.addAll(arr1,array);
//        for (int i = 0; i <list.size() ; i++) {
//            list.get(i);
//        }
//        for(Integer x:list){
//            System.out.println(list);
//        }
//        Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        //        List<Integer> list = new ArrayList<>();
//        list.add(34);
//        list.add(12);
//        list.add(9);
//        list.add(9);
//        list.add(9);
//        list.add(76);
//        list.add(29);
//        list.add(75);
//
////        System.out.println("min element " + Collections.min(list));
////        System.out.println("max element " + Collections.max(list));
////        System.out.println(Collections.frequency(list, 9));
//
//        Collections.sort(list, Comparator.reverseOrder());
//
//        System.out.println(list);
    }

}
