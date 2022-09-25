package com.company;

public class a24exception1 {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            if(a.length >= 0){
                System.out.println("pos");
            }
            if(a.length < 0){
                System.out.println("neg");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end");
        }
    }
}
