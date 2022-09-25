package com.company;
class myThread1 extends Thread {
    public void run(){
        while (true){
            System.out.println("fuck ur self-----------------------------------");
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("fuck u");
        }
    }
}
public class a25thread {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
       myThread2 t2 = new myThread2();
       t1.start();
       t2.start();
       t1.run();
    }
}
