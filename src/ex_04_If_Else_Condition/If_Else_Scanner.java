package ex_04_If_Else_Condition;

import java.util.Scanner;

public class If_Else_Scanner {
    public static void main(String[] args) {
        //CLI --- Command Line Interface -- Input using args[]
       // int age = Integer.parseInt(args[0]);

        //Runtime Input using Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input:");
        int age = scanner.nextInt();
        if (age>18)
        {
            System.out.println("Allowed to Vote!");
        }
        else
        {
            System.out.println("Not Allowed to Vote");
        }
    }
}
