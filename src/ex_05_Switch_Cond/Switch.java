package ex_05_Switch_Cond;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num between 1 to 7:");
        if(scanner.hasNextInt())
        {
            int day = scanner.nextInt();
            switch (day)
            {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Can you enter the number only between 1 to 7");
            }
        }
        else
        {
            System.out.println("Are You Fool? Please Enter only Integer Number");
        }
    }
}
