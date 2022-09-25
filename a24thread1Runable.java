package com.company;
class threadRunnable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 1");
    }
}
class threadRunnable2 implements Runnable{
    @Override
    public void run() {
        System.out.println("thread 2");
    }
}
public class a24thread1Runable {
    public static void main(String[] args) {
        threadRunnable1 bullet1 = new threadRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        threadRunnable2 bullet2 = new threadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
