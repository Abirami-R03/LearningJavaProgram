package ex_05_Switch_Cond;

public class JDK13Above {
    public static void main(String[] args) {
        int itemCode = 007;
        // In Java, a number that starts with 0 is interpreted as an octal (base-8) literal — not decimal.
        //But 8 is not a valid digit in base-8
        switch (itemCode)
        {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("No Item Code Found");
        }
    }
}
