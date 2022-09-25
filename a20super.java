package com.company;
class a1 {
    void display(){
        System.out.println("a");
    }
    void massage(){
        System.out.println("massage");
    }
    void add(int a, int b){
        int r= a+b;
        System.out.println(r);
    }
}
class b1 extends a1{
    void display(){
       // display();
        massage();
        super.display();
        System.out.println("b");
    }

    @Override
    void add(int a, int b) {
        super.add(a, b);
    }

    @Override
    void massage() {
        super.massage();
    }
}
public class a20super {
    public static void main(String[] args) {
        b1 obj = new b1();
        obj.display();
        obj.massage();
        obj.add(10,20);
    }
}
