package com.company;
class a3{
    void add(int a , int b){
        int r;
        r=a+b;
        System.out.println("add "+r);
    }
    void show(){
        System.out.println("add");
    }
}
class b3 extends a3{
    void sub(int a ,int b){
        int r;
        r=a-b;
        System.out.println("sub "+r);
        super.add(a,b);
    }

}
public class a21super {
    public static void main(String[] args) {
        a3 obj = new a3();
        obj.add(10,20);

        b3 obj1 = new b3();
        obj1.sub(30,40);
    }
}
