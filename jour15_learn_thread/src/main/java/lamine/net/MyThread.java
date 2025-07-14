package lamine.net;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyThread implements Runnable{
    @Override
    public  void run(){
        System.out.println("thread started "+ Thread.currentThread().getName());
    }
}
