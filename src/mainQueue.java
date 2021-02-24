import implementation.queueMethods;
import queueADT.myQueueADT;

public class mainQueue {

    public static void main(String[] args) {
        queueMethods queue = new queueMethods(5);
        System.out.println("Empty : " + queue.isEmpty());
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        System.out.println("empty : " + queue.isEmpty());
        System.out.println("size====>> " + queue.size());
        queue.dequeue();
        System.out.println("size====>> " + queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); //removing element from empty queue
        queue.enqueue(20);
        System.out.println("size: " + queue.size());
        //try to add more than 5 elements
        queue.enqueue(25);
        queue.enqueue(30);
        queue.enqueue(35);
        queue.enqueue(40);
        queue.enqueue(45);
        System.out.println("size====>> " + queue.size());

        queue.traverse();
        System.out.println("poll element " + queue.poll());
        queue.traverse();
    }
}
