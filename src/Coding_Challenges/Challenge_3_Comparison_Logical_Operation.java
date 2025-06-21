package Coding_Challenges;

public class Challenge_3_Comparison_Logical_Operation {
    public static void main(String[] args) {
        int a = 10 , b = 5;
        boolean equcomp = a==b;
        boolean comparison = a>b;
        boolean comparoper = a<b;
        boolean logicaloper = (a > b) && (a > 0);
        boolean logicalandcomp = (a < b) || (a > 0);
        boolean notequoper = !(a > b);

        System.out.println("a == b: " + equcomp);
        System.out.println("a > b: " + comparison);
        System.out.println("a < b: " + comparoper);
        System.out.println("(a > b) && (a > 0): " + logicaloper);
        System.out.println("(a < b) || (a > 0): " + logicalandcomp);
        System.out.println("!(a > b): " + notequoper);
    }
}
