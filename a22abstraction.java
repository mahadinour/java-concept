package com.company;

abstract class mobile{
    abstract void massage();
}
class nokia extends mobile{
    @Override
    void massage() {
        System.out.println("nokia phone");
    }
}
class samsung extends mobile{
    @Override
    void massage() {
        System.out.println("samsung phone");
    }
}
public class a22abstraction {
    public static void main(String[] args) {
        mobile mp;
        mp = new nokia();
        mp.massage();
        mp= new samsung();
        mp.massage();

    }
}
