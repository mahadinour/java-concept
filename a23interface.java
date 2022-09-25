package com.company;
interface animal{
    abstract void eat();
}
class dog implements animal{
    @Override
    public void eat() {
        System.out.println("dog can eat");
    }
}
public class a23interface {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
    }
}
