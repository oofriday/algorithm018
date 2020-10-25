public class MyCircularDeque {
    private int capacity;
    private int[] arr;
    private int front;
    private int rear;

   public MyCircularDeque(int k) {
        capacity = k + 1;
        arr = new int[capacity];
        rear = 0;
    }
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front - 1 +capacity) % capacity;
        arr[front] = value;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % capacity;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear - 1 + capacity) % capacity];
    }
    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}
