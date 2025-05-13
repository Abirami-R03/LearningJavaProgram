package ex_01_Java_Basics;

public class FindMaxNumNestedTernary {
    public static void main(String[] args) {
        int num1 = 29;
        int num2 = 15;
        int num3 = 19;
        System.out.println(num1>num2?(num1>num3?num1:num3):(num3>num2?num3:num2));
    }

}
