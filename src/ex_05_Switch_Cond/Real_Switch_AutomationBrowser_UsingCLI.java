package ex_05_Switch_Cond;

public class Real_Switch_AutomationBrowser_UsingCLI {
    public static void main(String[] args) {
        String browser = args[0];//If we Pass input : CHROME EDGE means it will consider first Input
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
