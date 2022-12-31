package collectionFramework.Anujbhaiya;

import java.util.ArrayDeque;

public class arraydq {
    public static void main(String[] args) {
        ArrayDeque<Integer>deq=new ArrayDeque<>();
        deq.add(10);
        deq.addFirst(2);
        deq.addLast(15);
        System.out.println(deq);
        //deq.removeFirst();
        deq.removeLast();
        System.out.println(deq);
    }
}
