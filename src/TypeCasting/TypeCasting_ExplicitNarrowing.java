package TypeCasting;

public class TypeCasting_ExplicitNarrowing {
    public static void main(String[] args) {
        int val =300;
        byte b = (byte)val;
        //Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b); // 44
    }
}
