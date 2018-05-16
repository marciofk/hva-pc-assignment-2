package nl.hva.pc;

public class Main {

    public static void main(String[] args) {

        Queue q = new Queue();

        // Creating producer
        Producer p = new Producer(1,q,300);

        // Creating consumers
        Consumer c1 = new Consumer(2,q,150);
        Consumer c2 = new Consumer(2,q,150);

        // Starting producers and consumers
        p.start();
        c1.start();
        c2.start();
    }
}
