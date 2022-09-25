package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i= 34;
        System.out.println("hi");
        while (i<40){
            System.out.println("thread");
            i++;
        }
    }

    public MyThr(Runnable target, String name) {
        super(target, name);
    }
}
public class a25thread2constractor {
    public static void main(String[] args) {
        MyThr t = new MyThr("mahadi");
        t.start();
        System.out.println("id "+t.getId());
    }
}
