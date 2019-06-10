package sel.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class QuitExample {

    //https://www.naukri.com/
    @Test
    public static void quittest() {
        WebDriverManager.chromedriver().setup();
        WebDriver quitexample = new ChromeDriver();
        quitexample.get("https://www.naukri.com/");



        /*
                Set<String> allWindowHandles = new HashSet<String>();
        use a for loop to print all the windowHandles values
        logic to iterate on the Set loop is exactly same as iterating on a List Loop

         1. Print the Window Handle of the browser on Naukri
         2. use the getWindowHandles() to print all the window handles of the naukri with additional popups


         */






        quitexample.quit();

    }
}