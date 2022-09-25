package com.company;
class a{
    int a=10;
    void display(){
        System.out.println("a="+a);
    }
}
class b extends a{
    int b=20;
    void display(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class c extends a{
    int c;
    void display(){
        System.out.println("a="+a);
        System.out.println("c="+c);
    }
}
public class a18inheritance1 {
    public static void main(String[] args) {
        c x = new c();
        x.display();
        b y= new b();
        y.display();
        a z =new a();
        z.display();
    }
}
