package oop2;

import java.util.Scanner;
class account{

    static int balance;

    public  void deposit (){
        System.out.println("enter ur deposit cash");
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        System.out.println("u have deposited = " + p);
        balance = balance + p;

    }

    public void withdraw () {
        Scanner input = new Scanner(System.in);
        System.out.println("with draw cash");
        int p = input.nextInt();
        if (p > balance){
            System.out.println("u cant withdraw");
        }
        else if(p > balance){
            balance = balance - p;
        }
        else if(balance >= p){
            balance = balance - p;
        }
        else {
            System.out.println("thanx");
        }
        System.out.println("u have withdraw = "+ p);
    }
    public int Balance() {
        return balance;
    }

    public String name(){
        Scanner input = new Scanner(System.in);
        System.out.println(" enter ur name = ");
        String a = input.nextLine();
        return a;
    }
    public void type(){
        System.out.println("only available deposit");
    }



}
public class TestAccount {
    public static void main(String[] args) {

        System.out.println("press 1 for member details \n press 2 for method ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        account obj = new account();
        switch (a){
            case 1 :
                obj.name();
                obj.type();
                System.out.println("balance = " + obj.Balance());
                break;
            case 2:
                obj.deposit();
                obj.withdraw();
                System.out.println("balance = " + obj.Balance());
        }
    }
}
