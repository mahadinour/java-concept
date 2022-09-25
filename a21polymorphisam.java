package com.company;
class  d{
    int a ,b;
    void add(int a,int b){
        System.out.println(a+b);
    }
    void show (){
        System.out.println("inside D");
    }
}
class  e extends d{
    @Override
    void add(int a, int b) {
        super.add(a, b);
    }
    void show (){
        System.out.println("inside e");
    }
}
class  f extends d{
    void show (){
        System.out.println("inside f");
    }

    @Override
    void add(int a, int b) {
        super.add(a, b);
    }
}
public class a21polymorphisam {
    public static void main(String[] args) {
        d obj = new d();
        obj.show();
        obj.add(10,20);
        obj = new f();
        obj.show();
        obj.add(30,40);
        obj = new e();
        obj.show();
        obj.add(50,60);
    }
}
