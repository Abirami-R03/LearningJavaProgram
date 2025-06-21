package ex_05_Switch_Cond;

public class JDK13 {
    public static void main(String[] args) {
        int itemCode = 005;
        switch (itemCode)
        {
            case 001,002,003:
                System.out.println("All of them are Electronic Gadgets");
                break;
            case 004,005,006:
                System.out.println("All of them are Mechanical Items");
                break;
            case 007:
                System.out.println("System");
                break;
            default:
                System.out.println("None");
                break;

        }
    }
}

