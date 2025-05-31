package Ternary_Operator;

public class FindPositiveorNegativeNumber {
    public static void main(String[] args) {
        int num = 10;
        String result = num>0?"Positive":"Negative";
        System.out.println(result);
        //System.out.println(String result = num>0?"Positive":"Negative");
        //This code will cause a compilation error in Java.
        //Why? Because in Java:
        //You cannot declare a variable (like String result) inside a method call (like System.out.println()).
    }
}
