package demo.basics;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {


        List<String> getnames = new ArrayList<String>(); // creating an instance.



        getnames.add("Arjun");//0
        getnames.add("Friend");//1 --//2
        getnames.add("Roshan");//2 --//3
        getnames.add("Ryan"); // 3 -- //4

        getnames.add(1, "has a ");
        getnames.add(3, "by name");


        System.out.println("Arjun`s friend is "
                + getnames.get(2) + " the index number of his friend is "
                + getnames.indexOf("Friend"));


        System.out.println(getnames.toString());

        getnames.remove(5);

        System.out.println(getnames.toString());




    }

}

