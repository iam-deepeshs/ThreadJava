// ThreadOperations.java
// Class for encapsulating thread operations

public class ThreadOperations {

    // Function to start thread using Thread class
    public void runThreadClass() {
        System.out.println("\nRunning Thread using MyThread class:");
        MyThread t1 = new MyThread();
        t1.start();
        try {
            t1.join(); // wait for this thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Function to start thread using Runnable interface
    public void runRunnableClass() {
        System.out.println("\nRunning Thread using MyRunnable class:");
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        try {
            t2.join(); // wait for this thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
