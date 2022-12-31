package collectionFramework.Anujbhaiya;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        Queue<Integer>pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(5);
        pq.offer(2);
        pq.poll();
        System.out.println(pq);
        Queue<Integer> pqr=new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(40);
        pqr.offer(10);
        pqr.offer(9);
        System.out.println(pqr);
    }
}
