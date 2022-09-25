package com.company;
class person1a{
    String name;
    int age;
    public person1a(String n ,int a){
        name=n;
        age = a;
    }
    void display(){
        System.out.println("1name ="+name);
        System.out.println("1age ="+age);
    }
}
class teacher1a extends person1a{
    int id;
    public teacher1a(String n, int a, int i) {
        super(n, a);
        //name=n;
        //age = a;
        id = i;
    }
    void display(){
        System.out.println("2name ="+name);
        System.out.println("2age ="+age);
        System.out.println("2id ="+id);
    }
}
class teacher2a extends teacher1a{
    int exp;

    public teacher2a(String n, int a, int i, int exp) {
        super(n, a, i);
        this.exp = exp;
    }
    void display(){
        System.out.println("3name ="+name);
        System.out.println("3age ="+age);
        System.out.println("3id ="+id);
        System.out.println("3exp ="+exp);
    }
}
public class a19methodOverridding1 {
    public static void main(String[] args) {
        teacher1a t1 = new teacher2a("mahadi",20,201902121,2);
        t1.display();
        person1a t2 = new teacher1a("mahadi",20,201902121);
        t2.display();
    }
}
