// DeadlockDemo.java
public class deadlock11 {

    public static void main(String[] args) {

        final Object res1 = "Resource1";
        final Object res2 = "Resource2";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread1 locked Resource1");
                synchronized (res2) {
                    System.out.println("Thread1 locked Resource2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (res2) {
                System.out.println("Thread2 locked Resource2");
                synchronized (res1) {
                    System.out.println("Thread2 locked Resource1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}