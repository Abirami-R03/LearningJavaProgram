package ex_02_Java_Operator;

public class All_Operator {
    public static void main(String[] args) {
        boolean b1=true;
        int a=10,b=20;
        //Arithmetic Operator
        System.out.println(a+b);//10+20=30
        System.out.println(a-b);//10-20=-10
        System.out.println(a*b);//10*20=200
        System.out.println(a/b);//10/20=0
        //Relational Operator
        System.out.println(a>b);//false
        System.out.println(a<=b);//true
        System.out.println(a==b);//false
        System.out.println(a!=b);//true

        // Compound Assignment Operators
        int age =10;
        System.out.println(age+=10);//10+10=20
        System.out.println(age=age+11);//20+11=31
        System.out.println(age/=10);//31/10=3

// Bitwise - Not important for Automation--Digital Electronics
        //
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR

    }
}
