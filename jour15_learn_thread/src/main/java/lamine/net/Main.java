package lamine.net;

public class Main {
    Thread thread = new Thread(new MyThread());
    public static void main(String[] args) {
        Thread thread3 = new Thread(() ->{
            System.out.println("thread started "+ Thread.currentThread().getName());

        });
        thread3.start();

    }
}