package nl.hva.pc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A limited queue
 */
public class Queue {

    // Queue limit
    public static final int LIMIT = 10;

    // The buffer representation
    private List<String> buffer;

    public Queue() {
        buffer = new ArrayList<String>();
    }

    public void enqueue(String value) {

        while (buffer.size() == LIMIT) {
            // waiting
        }
        synchronized (buffer) {
            buffer.add(value);
        }
    }

    public String dequeue() {
        while (buffer.size() == 0) {
            // waiting
        }

        synchronized (buffer) {
            String value = buffer.remove(0);
            return value;
        }

    }


}
