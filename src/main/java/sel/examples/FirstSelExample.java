package sel.examples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstSelExample {


    @Test
    public void doSomething() {


        WebDriverManager.chromedriver().setup();

        //   System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\IdeaProjects\\JavaBasics\\src\\main\\resources\\asdfasdfasfdaschromedriver.exe");

        WebDriver driver = new ChromeDriver();


//        driver.get("www.google.com"); - Malformed URL  exception
        driver.get("http://www.google.com");

        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);

        driver.navigate().to("http://www.atg.se");
        title = driver.getTitle();
        System.out.println(title);
        url = driver.getCurrentUrl();
        System.out.println(url);
        System.out.println();
        driver.navigate().back();
        title = driver.getTitle();
        System.out.println(title);
        url = driver.getCurrentUrl();
        System.out.println(url);
//
//        driver.navigate().forward();
//        title = driver.getTitle();
//        System.out.println(title);
//        url = driver.getCurrentUrl();
//        System.out.println(url);
//        driver.navigate().refresh();
//        title = driver.getTitle();
//        System.out.println(title);
//        url = driver.getCurrentUrl();
//        System.out.println(url);
//
        driver.close();

    }


}
