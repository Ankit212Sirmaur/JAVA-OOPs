package Part1.Collection_Framework;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
//        normal as queue
        queue.offer(10);
        queue.offer(122);
        queue.offer(3);
//        insert both end side
        queue.offerFirst(1);
        queue.offerLast(200);
//        deletion at normal queue from front side
//        queue.poll();
//        deletion at both sides
        queue.pollLast();
        queue.pollFirst();
//        peek
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peekLast());
        System.out.println(queue.peekFirst());

    }
}
