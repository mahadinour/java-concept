package com.company;

public class a24exception {
    public static void main(String[] args) {
        try {
            int x=10;
            int y=0;
            int r = x/y;
            System.out.println(r);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception"+e);
        }
        catch (ArithmeticException e1){
            System.out.println(e1);
        }
        catch (Exception e2){
            System.out.println(e2);
        }
        finally {
            System.out.println("end");
        }
    }
}
