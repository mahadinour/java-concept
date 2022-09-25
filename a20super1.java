package com.company;
class a2{
    int age;
    int id;
    public  a2(int a, int i){
        age = a;
        id = i;
    }
    void display(){
        System.out.println("age " + age);
        System.out.println("id " + id);
        System.out.println("a");
    }
}
class b2 extends a2 {
    int batch;
    //super.display ->super must call at function
    public  b2(int a , int i, int b){
        super(a,i);
        batch =b;
        // super(a,i);
    }
    @Override
    void display() {
        super.display();
        System.out.println("batch "+batch);
        super.display();
    }
}
public class a20super1 {
    public static void main(String[] args) {
        b2 obj = new b2(10,20,30);
        obj.display();
    }
}
