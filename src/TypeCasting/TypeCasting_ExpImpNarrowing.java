package TypeCasting;

public class TypeCasting_ExpImpNarrowing {
    public static void main(String[] args) {
        long l = 933777557l;
        // short s = l;-->Narrow Implicit
        short s = (short) l;//Narrow Explicit
        System.out.println(s);//20629
    }
}
