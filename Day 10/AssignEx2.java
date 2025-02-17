package com.celcom.day10;

class SharedResource {
    private int data;
    private boolean available = false;

   
    public synchronized void produce(int value) {
        while (available) { 
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); 
    }

 
    public synchronized void consume() {
        while (!available) { 
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); 
    }
}

class Producer extends Thread {
    private SharedResource resource;

    public Producer(SharedResource resource) { 
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;

    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AssignEx2 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
