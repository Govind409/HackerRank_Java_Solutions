package Multithreading;

public class ThreadExtendsThreadClass extends Thread {
    public void run() {
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {
        ThreadExtendsThreadClass t1 = new ThreadExtendsThreadClass();
        t1.start();
    }

}
