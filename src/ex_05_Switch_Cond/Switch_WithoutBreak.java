package ex_05_Switch_Cond;

import java.util.Scanner;

public class Switch_WithoutBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7:");
        if(sc.hasNextInt())
        {
            int days = sc.nextInt();
            switch(days)
            {
                case 1:
                System.out.println("Monday");
                case 2:
                    System.out.println("Tuesday");
                case 3:
                    System.out.println("Wednesday");
                case 4:
                    System.out.println("Thursday");
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Invalid Days");


            }
        }
    }
}
