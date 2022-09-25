package com.company;
class person1{
    String name;
    int age;
    void display9(){
        System.out.println("name ="+name);
        System.out.println("age ="+age);
    }
}
class person2{
    String name;
    int age;
    void display9(){
        System.out.println("name ="+name);
        System.out.println("age ="+age);
    }
}
class teacher1 extends person1{
    String qua;
    //name
    //age
    void display9(){
        System.out.println("name ="+name);
        System.out.println("age ="+age);
        System.out.println("qua = "+qua);
    }

}
public class a19methodOverRidding {
    public static void main(String[] args) {
        teacher1 t1 = new teacher1();
        t1.display9();
        person1 p1 = new teacher1();
    }
}
