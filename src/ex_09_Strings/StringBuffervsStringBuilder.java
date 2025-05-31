package ex_09_Strings;

public class StringBuffervsStringBuilder {
    public static void main(String[] args) {
        String S =new String("Abirami");
        StringBuilder S1 =new StringBuilder("Abirami");
        StringBuffer S2 =new StringBuffer("Abirami");
        System.out.println(S1.reverse());
        System.out.println(S2.reverse());
        System.out.println(S);
    }
}
