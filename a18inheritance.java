package com.company;

import javax.xml.namespace.QName;
import java.awt.datatransfer.StringSelection;

class person{
    String name;
    String sex;
    int age;

    void display(){
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("sex "+sex);
    }
}
class teacher extends person{
    //name sex age display()
    String qualification;

    void dislplay1(){
        System.out.println("name = "+ name);
        System.out.println("age ="+ age);
        System.out.println("sex ="+sex);
        System.out.println("qualification ="+qualification);
    }
}
public class a18inheritance {
    public static void main(String[] args) {
        teacher t1 = new teacher();
        t1.name="mahadi";
        t1.sex="male";
        t1.age=40;
        t1.qualification="BSc";
        t1.dislplay1();
        t1.display();
    }
}
