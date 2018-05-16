package nl.hva.pc;

public class Consumer extends Thread {

    private int id;
    private Queue q;
    private int times;

    /**
     * A simple consumer
     * @param id unique id
     * @param q reference to the queue
     * @param times how many times the consumer tries to consume
     */
    public Consumer(int id, Queue q, int times) {
        this.id = id;
        this.q = q;
        this.times = times;
    }

    public void run() {
        for(int i=0;i<times;i++) {

            // consuming a value
            String value = q.dequeue();
            System.out.println("Consumer " + id + " got " + value);
        }
    }


}
