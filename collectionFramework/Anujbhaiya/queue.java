package collectionFramework.Anujbhaiya;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> kar=new LinkedList<>();
        kar.offer(10);//safely inserting without exceptions returns true or false while added
        kar.add(10);//may throw exception returns true or false while added
        kar.offer(50);
        kar.peek();//gives head of the queue without any exception
        kar.element();//gives head of the queue, throws exception if queue empty
        kar.poll();//returns and remove head of queue , returns null if queue is empty
        kar.remove();//returns and remove head of queue , throws exception if queue is empty
    }
}
