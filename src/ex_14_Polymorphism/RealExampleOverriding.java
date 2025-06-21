package ex_14_Polymorphism;

public class RealExampleOverriding {
    public static void main(String[] args) {
        Common_Browser_Seletion browser = new ChromeBrowser();
        browser.open_browser();
        ChromeBrowser browserChrome = new ChromeBrowser();
        browserChrome.open_browser();
    }
}
    class Common_Browser_Seletion
    {
        void open_browser()
        {
            System.out.println("Open Browser");
        }
    }
    class ChromeBrowser extends Common_Browser_Seletion
    {
        @Override
        void open_browser()
        {
            System.out.println("Open Chrome Browser");
        }
    }

