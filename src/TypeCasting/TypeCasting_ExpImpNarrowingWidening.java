package TypeCasting;

public class TypeCasting_ExpImpNarrowingWidening {
    public static void main(String[] args) {
        int course =100;
        float GST = 3.5f;
        //Implicit Narrowing
        //int total = course + GST;
        //Explicit Narrowing
        int total = course + (int) GST;
        System.out.println(total);//103
        //Implicit widening
        //float total1 = course +GST;
        //Explicit widening
        float total1 = (float) course +GST;

    }
}
