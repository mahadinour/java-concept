package com.company;
interface football {
    void play();
}

interface cricket{
    void play();
    void play1();
}

class game implements football,cricket{
    @Override
    public void play() {
        System.out.println("hi");
    }

    @Override
    public void play1() {
        System.out.println("hello");
    }
}
public class a23interface1 {
    public static void main(String[] args) {
        game obj = new game();
        obj.play();
        obj.play1();
    }
}
