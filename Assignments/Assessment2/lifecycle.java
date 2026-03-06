// ThreadLifeCycleDemo.java
class LifeThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class lifecycle{
    public static void main(String[] args) throws InterruptedException {

        LifeThread t = new LifeThread();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}