
import java.lang.Exception;

class Hi implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi  " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello  " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class multithreadingUsingInterface {
    public static void main(String args[]) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj1, "Thread 1");
        Thread t2 = new Thread(obj2, "Thread 2");
        t1.start();
        t2.start();

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("Exiting...");
    }
}
