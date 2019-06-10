package junit.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FirstTestExample {


    @Before
    public void setUp() {
        System.out.println("Launch WebBrowser");
        System.out.println("Launch WebUrl");
    }



    @Test
    public void test2() {
        String expectedMessage = "Welcome Jyoti";
        String actualString = "Welcome Jyoti"; // This is a dummy actual value


        System.out.println("Second test case");
        assertEquals("Error message that will be displayed if the comparision fails", expectedMessage, actualString);

    }




    @Test
    public void test() {
        String expectedMessage = "Welcome Jyoti";
        String actualString = "Welcome     Jyoti"; // This is a dummy actual value

        System.out.println("Inside the test function");
        System.out.println("Enter credentials");
        System.out.println("Click Login Button");
        System.out.println("Compare the Welcome message with the expected value");

        assertTrue("Expected valued mismatch", expectedMessage.equalsIgnoreCase(actualString));
    }

    @Test
    public void test3() {
        assertEquals("The test case fails if the two numbers are not equal", 3,6);
    }

    @After
    public void cleanUp() {
        System.out.println("Close the browser");
    }




}
