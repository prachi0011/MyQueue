package implementation;

import queueADT.myQueueADT;

public class queueMethods implements myQueueADT {
    private int[] arr; //array for queue
    private int size;   //max capacity of queue
    private int front;  //shows using index value for front element
    private int rear;   //shows using index value for rear element
    private int count;  //number of elements in queue

    public queueMethods(int length){
        arr = new int[length];
        size = length;
        front = 0;
        rear = 0;
        count = 0;
    }

    @Override
    public void enqueue(int element) {
        if (!isEmpty()) {
            if (count < size){
            arr[count - 1] = element;
            rear = count - 1;
            count ++;
            }
            else{
                System.out.println("Overflow");
            }
        }
        else{
            arr[0] = element;
            front = 0;
            rear = 0;
            count ++;
        }
    }

    @Override
    public void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < count-1; i++) {
                arr[i] = arr[i+1];
            }
            rear = count - 2;
            count --;
        }
        else{
            System.out.println("UnderFLow");
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int peek() {
        return arr[front];
    }

    @Override
    public int poll() {
        if (!isEmpty()){
            int pol = arr[front];
            dequeue();
            return pol;
        }
        else{
            return -1;
        }
    }

    @Override
    public void traverse() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + "-->");
        }
    }
}
