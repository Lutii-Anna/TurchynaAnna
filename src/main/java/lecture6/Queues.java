package lecture6;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add("first");
        queue.add("second");
        queue.add("3th");
        queue.add("4th");
        queue.add("A");
        queue.add("a");
        queue.add("b");
        queue.add("1");
        queue.add("4");
        queue.add("8");
        queue.add("2");
        queue.add("5");
        System.out.println(queue);
    }
}
