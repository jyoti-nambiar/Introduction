package junit.example;

import org.junit.*;

public  class SecondJunitExample {

    @BeforeClass
    public static void beforeClassMethod() {
        System.out.println("Inside the Before Class Method");
    }


    @Before
    public void beforeMethod() {
        System.out.println(" - Inside the before method");
    }



    @Test
    public void testmethod2() {
        System.out.println(" - - Inside the Second Test method");
    }

    @Test
    @Ignore
    public void testmethod() {
        System.out.println(" - - Inside the Test method");
    }

    @After
    public void afterMethod() {
        System.out.println(" - Inside the after method");
    }

    @AfterClass
    public static void afterClassMethod() {
        System.out.println("inside the after class method");
    }

}
