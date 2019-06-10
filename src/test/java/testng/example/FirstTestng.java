package testng.example;

import org.testng.Reporter;
import org.testng.annotations.*;


public class FirstTestng {
    @BeforeMethod
    public void beforeName(){
        System.out.println("This is the begining");
    }
    @AfterMethod
    public void afterName() {
        System.out.println("This is the end");
    }

    @Test(dependsOnMethods = "testName")
    public void testName2() {
        int a=2;
        int b= a++;

        Reporter.log("Sample report statement");

        System.out.println(b);
        System.out.println(a);
    }

    @Test
    public void testName() {
        System.out.println("this is an example of TestNG");
    }
}
