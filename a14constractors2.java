package com.company;
//type of constractors

//parameterize constractor
class student1{
    String name ;
    int sec ;
    int id ;
    int age ;

    public student1(String n , int s , int i , int a){//constractor, it can ran with out para miter
        this.name = name ;
        this.sec = sec ;
        this.id = id ;
        this.age = age ;
    }
    student1(){
        System.out.println("no value");
    }
    void diplay(){
        System.out.println(" name "+ name);
        System.out.println(" sec " + sec);
        System.out.println(" id " + id );
        System.out.println(" age "+ age);
    }
}

public class a14constractors2 {
    public static void main(String[] args) {
        student1 st1 = new student1("mahadi", 2, 2345 , 20);
        st1.diplay();
        student1 st2 = new student1();
        st2.diplay();
    }
}
