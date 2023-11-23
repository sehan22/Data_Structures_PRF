public class Queue {
    private int[] elementsData;
    private int front;
    private int rear;

    public Queue(final int initialCapacity) {
        elementsData = new int[initialCapacity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int data) {
        if (isFUll()) {
            throw new RuntimeException("Queue is full!");
        }
        if (front == -1) front++;
        elementsData[++rear] = data;
    }

    public void printQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        System.out.print("[");
        for (int i = front; i <= rear; i++) {
            System.out.print(elementsData[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    public void deQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        front++;
    }

    public int peek() {
        return elementsData[front];
    }

    public boolean isFUll() {
        return rear == elementsData.length - 1 || front > rear;
    }

    public void grow() {
        int[] temp = elementsData;
        elementsData = new int[temp.length * 2];
        System.arraycopy(temp, 0, elementsData, 0, temp.length);
    }

    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    public void clear() {
        front = -1;
        rear = -1;
    }
}
