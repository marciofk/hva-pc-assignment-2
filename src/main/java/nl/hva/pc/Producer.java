package nl.hva.pc;

public class Producer extends Thread {

    private Queue q;
    private int times;
    private int id;

    /**
     * A simple producer
     * @param id unique id
     * @param q reference to the queue
     * @param times number of times to produce
     */
    public Producer(int id,Queue q,int times) {
        this.id = id;
        this.q = q;
        this.times = times;
    }

    public void run() {
        for(int i=0;i<times;i++) {
            String value = id + "-" + i;

            // producing a value
            q.enqueue(value);
            System.out.println("Producer " + getId() + " produced " + value);
        }
    }
}
