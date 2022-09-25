package com.company;

import java.util.Scanner;

class student4{
    int id ;
    String name;
    static String uniName = "gub";
    student4(int i,String n){
        id= i;
        name= n;
    }
    void diplay (){
        System.out.println("id = "+ id);
        System.out.println("name = "+ name);
        System.out.println("university = "+ uniName);
    }

}
public class a15satic {
    public static void main(String[] args) {
        student4 obj = new student4(34,"mahadi");
        obj.diplay();
        student4 obj1 = new student4(666, "nour");
        obj1.diplay();

    }

}
