package Ternary_Operator;

public class Real_Age_Classification {
    public static void main(String[] args) {
        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String results = age<18?"Minor":(age>65?"Senior Citizen":"Adults");
        System.out.println(results);
    }
}
//with passing Input we getting this error
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
at Ternary_Operator.Real_Age_Classification.main(Real_Age_Classification.java:5)*/
/*60th is String but it will not format of age age should be in INT
Every element in args[] is a String — even if the user types a number like 25, it's passed as "25" (a string). Java doesn’t know ahead of time what type you intended — so it gives you everything as a String, and you convert it as needed.
Exception in thread "main" java.lang.NumberFormatException: For input string: "60th"
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt(Integer.java:564)
at java.base/java.lang.Integer.parseInt(Integer.java:661)
at Ternary_Operator.Real_Age_Classification.main(Real_Age_Classification.java:9)*/