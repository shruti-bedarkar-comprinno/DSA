import java.util.*;

public class Main {

    public static void main(String args[]) {

        Queue<Integer> q = new LinkedList<>();

        // add elements
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Queue: " + q);

        // remove element
        q.remove();

        System.out.println("After remove: " + q);

        // peek element
        System.out.println("Front element: " + q.peek());

    }
}
