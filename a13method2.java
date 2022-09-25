package com.company;
class add{
    int add1(int a , int b){
        int r=a+b;
        return r;
       // System.out.println(r);
    }
    int  add2(int x, int y){
        int r1 = x+y;
        return r1;
        //System.out.println(r);
    }
}
public class a13method2 {
    public static void main(String[] args) {
        add obj = new add();
        obj.add2(10 ,20);
        obj.add1(40,50);
    }
}
