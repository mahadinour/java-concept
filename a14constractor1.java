package com.company;

import java.util.Scanner;
//parameterize constractor
class student{
    String name ;
    int sec ;
    int id ;
    int age ;

    student(String n , int s , int i , int a){//constractor, it can ran with out para miter
        name = n ;
        sec = s ;
         id = i ;
         age = a ;
    }
    void diplay(){
        System.out.println(" name "+ name);
        System.out.println(" sec " + sec);
        System.out.println(" id " + id );
        System.out.println(" age "+ age);
    }
}
public class a14constractor1 {
    public static void main(String[] args) {
        //conastractro using for initila the obj
        student st1 = new student("mahadi", 2, 2345 , 20);
        st1.diplay();

        Scanner input = new Scanner(System.in);
        String name;
        int sec , id , age;
        System.out.println("name");
        name = input.nextLine();
        System.out.println("sec");
        sec = input.nextInt();
        System.out.println("id");
        id = input.nextInt();
        System.out.println("age");
        age = input.nextInt();

        student st2 = new student(name, sec , id  , age);//pass argumant
        st2.diplay();//calling
    }
}
