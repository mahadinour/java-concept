package com.company;
class book {
    int pages;
    public book(int a) {
        pages = a;
    }
}
class novel extends book{
    String name;
    //int pages;
    novel(int i,String k){
        super(i);
        name = k;
    }
    void show(){
        System.out.println(name);
        //System.out.println(writer);
        System.out.println(pages);
    }
}
class mistry extends novel {
    String writer ;
    //String name;
    //int pages;
    mistry(int i ,String j ,String k){
        super(i,j);
        writer =k;
    }
    void show(){
        System.out.println(name);
        System.out.println(writer);
        System.out.println(pages);
    }
}

public class a18inheretance2 {
    public static void main(String[] args) {
        mistry m = new mistry(200,"abc","xyz");
        m.show();
        novel n = new novel(200,"xyz");
        n.show();
    }
}
