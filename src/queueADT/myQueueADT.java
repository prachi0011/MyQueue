package queueADT;

public interface myQueueADT {

    void enqueue(int element);
    void dequeue();
    boolean isEmpty();
    int size();
    int peek();
    int poll();
    void traverse();
}
