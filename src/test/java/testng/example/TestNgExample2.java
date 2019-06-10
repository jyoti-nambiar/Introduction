package testng.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgExample2 {


    @DataProvider(name = "UserNames")
    public Object[] getData() {
        String names[] = {"Roshan", "Ryan", "Arjun"};
        return names;
    }


    @DataProvider(name = "failingTests")
    public Object[] getNames() {
        String names[] = {"ABC", "asdf", "aasfas"};
        return names;
    }


    @Test(dataProvider = "UserNames")
    public void printNamesUsingInputFromDataProvider(String name) {
        System.out.println(name);

        System.out.println("names\b\nthis is in a new line\\");


    }


}
