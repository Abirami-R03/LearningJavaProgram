package Ternary_Operator;

public class Nested_TernaryOperator {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int age = 24;
        String AgeCategory = (age>18)?(age>25?"You Can Drink":"You Can't Drink"):"You Can't Go GOa";
        System.out.println(AgeCategory);
    }
}
