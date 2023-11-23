public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        /*enQueue*/
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);

        /*printQueue*/
        queue.printQueue();

        /*deQueue*/
        queue.deQueue();
        queue.printQueue();

        System.out.println("Peek : " + queue.peek());

        System.out.println("isFull : " + queue.isFUll());

        System.out.println("isEmpty : " + queue.isEmpty());

        /*queue*/
        queue.grow();

        /*clear*/
//        queue.clear();
        queue.printQueue();

    }
}
