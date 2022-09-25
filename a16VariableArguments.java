package com.company;
class varargs{
    void add(int ... num) {
        int sum = 0;
        for (int x:num) {
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
public class a16VariableArguments {
    public static void main(String[] args) {
        varargs obj = new varargs();
        obj.add(89,98,78,90);
    }
}
