package ex_02_Java_Operator;

import java.sql.SQLOutput;

public class Instance_of_Operator {
    public static void main(String[] args) {
        String S1 = new String("Abirami");
        String S2 = new String("Abirami13071996");
        String S3 = new String("1996");
        int a=10;
        Integer b=20;
        System.out.println(S1 instanceof String);//true
        System.out.println(S2 instanceof String);//true
        System.out.println(S3 instanceof String);//true
        System.out.println(b instanceof Integer);//true
        //int is a primitive type, not an object.
        //instanceof only works with object references, not primitives like int, float, boolean, etc.
        //Integer is a wrapper class for the primitive type int.
        //So, you can't write a instanceof Integer directly if a is an int.
        //System.out.println(S3 instanceof Integer);//This will give a compile-time error
        //System.out.println(a instanceof Integer);// This will give a compile-time error

    }
}
