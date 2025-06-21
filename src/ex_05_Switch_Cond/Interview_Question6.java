package ex_05_Switch_Cond;

public class Interview_Question6 {
    public static void main(String[] args) {
        int a =11;
        switch (-1)
        {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("Negative Number");
                break;
            case 11:
                System.out.println("Positive Number");
                break;
            case 2:
                System.out.println("Positive2 Number");
                break;

        }
    }
}
