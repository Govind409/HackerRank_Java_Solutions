package Multithreading;

public class UsingRunnableInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        UsingRunnableInterface t2 = new UsingRunnableInterface();
        Thread t3 = new Thread(t2);
        t3.start();
    }

}
