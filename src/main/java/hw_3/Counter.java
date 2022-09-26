package hw_3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private long counter = 0L;
    private final Lock lock = new ReentrantLock();

    public void increaseCounter() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread() + " " + counter++);
        } finally {
            lock.unlock();
        }
    }

    public long getCounter() {
        return counter;
    }
}

