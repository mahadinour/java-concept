package com.company;
class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i <7 ; i++) {
            System.out.println("name"+this.getName());
        }
    }
}
public class a25thread3properties {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("mahadi 1 ");
        MyThr1 t2 = new MyThr1("mahadi 2 ");
        MyThr1 t3 = new MyThr1("mahadi 3 min prirt");
        MyThr1 t4 = new MyThr1("mahadi 4 ");
        MyThr1 t5 = new MyThr1("mahadi 5 most important");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.start();
        t5.start();
    }
}
