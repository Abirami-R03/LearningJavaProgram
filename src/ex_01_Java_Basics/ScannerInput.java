package ex_01_Java_Basics;

import java.util.Scanner;

public class ScannerInput
{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        if(age>18)
        {
            System.out.println("Voting is Eligible");
        }
        else {
            System.out.println("Voting is not eligible");
        }
    }
}
