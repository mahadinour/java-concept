package com.company;

public class a13method1 {
     int add1 (int x ,int y){
        int z;
        z=x +y ;
        return z;
    }
    public static void main(String[] args) {
        int a, b;
        a= 10;
        b= 20;
       // System.out.println(add1(a,b));
       // System.out.println(add1(10, 30));
        a13method1 obj = new a13method1();
        System.out.println(obj.add1(a,b));
    }
}
