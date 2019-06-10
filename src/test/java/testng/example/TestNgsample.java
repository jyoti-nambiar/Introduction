package testng.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgsample {

    @BeforeMethod
    public static void printStatement() {
        System.out.println("This is a sample program to test the working ofd Dataproviders");
    }

    @AfterMethod
    public static void endOfstatement() {
        System.out.println("This is the end of the statement");
    }


    @DataProvider(name = "NamesOfCousins")
    public Object[] getName() {
        System.out.println("The names of cousins are ");
        String name[] = {"Ram", "Arjun", "Shaurya", "Aryan"};
        return name;
    }

    @DataProvider(name = "NamesOfFriends")
    public Object[] getFriends() {
        System.out.println("The name of my friends are");
        String name[] = {"Ryan", "Roshan", "Oscar", "Mio"};
        return name;
    }

    @Test(dataProvider = "NamesOfFriends")
    public void printname(String name) {
        System.out.println(name);


        }
    }





