package oop2;
import java.util.Scanner;

 class Member {
    int depositor;
    String account;
    double bal;
    double withdraw;
    double bal2;
    Scanner input = new Scanner(System.in);

    void initial()
    {
        System.out.println("Enter your account name");

        account = input.nextLine();
    }

    double Deposite()
    {
        System.out.println("Enter Your ammount");
        bal = input.nextDouble();
        return depositor;
    }

    double withdraw()
    {
        System.out.println("Enter the amount to withdraw");
        withdraw = input.nextDouble();
        bal2 = Math.abs(bal - bal2);
        return withdraw;
    }
    void display ()
    {
        System.out.println("ball" +bal2);
    }
}

public class kkk {
}
