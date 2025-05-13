package ex_01_Java_Basics;

public class Byte {
    public static void main(String[] args) { // JVM Recognize only this format of main method() -->public static void main(String[] args)
        byte age =10; // Local Variable is within method
        System.out.println(age);

        //Memory can store 0 and 1 so age-->00001010 bit --> byte will store only in 8 digit if 128 it overflow


    }

   // public static void main(int[] args) {
        //-- we can add n no of main method.This method will not execute becoz one main method JVM recognize
        //int score = 100; //This is also a Local variable, any Variable inside the method that is local Variable
       // System.out.println(score);
   // }
}
