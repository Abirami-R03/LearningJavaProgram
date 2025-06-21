package ex_05_Switch_Cond;

import java.util.Scanner;

public class Real_Switch_Automation_UsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Required Browser Name");
        String browser = sc.next();
        browser=browser.toLowerCase();
        switch (browser) {
            case "chrome":
                System.out.println("Launching Chrome Browser");
                System.out.println("Executing Test Cases");
                System.out.println("Closing the Chrome Browser");
                break;
            case "firefox":
                System.out.println("Launching Firefox Browser");
                System.out.println("Executing Test Cases");
                System.out.println("Closing the Firefox Browser");
                break;
            case "edge":
                System.out.println("Launching Edge Browser");
                System.out.println("Executing Test Cases");
                System.out.println("Closing the Edge Browser");
                break;
            default:
                System.out.println("I have no idea about this browser");
                break;

        }
    }
}
