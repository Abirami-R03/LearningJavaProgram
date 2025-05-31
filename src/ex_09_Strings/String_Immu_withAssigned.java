package ex_09_Strings;

public class String_Immu_withAssigned {
    public static void main(String[] args) {
        String S1 = "Hello";
        S1 = S1.concat("World");//it immutable if we assign it will update
        System.out.println(S1);
    }
}
