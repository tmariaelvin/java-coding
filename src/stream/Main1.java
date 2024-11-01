package stream;

// A class that extends Thread
class MyThread extends Thread {
    private String threadName;

    // Constructor to set the thread name
    public MyThread(String name) {
        this.threadName = name;
    }

    // Override the run method to define the task
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                // Sleep for 500 milliseconds
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " exiting.");
    }
}

// Main class to demonstrate multithreading
public class Main1 {
    public static void main(String[] args) {
        // Creating two threads
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Main thread continues to run
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main Thread interrupted.");
            }
        }
        System.out.println("Main Thread exiting.");
    }
}
