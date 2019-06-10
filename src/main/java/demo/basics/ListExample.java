package demo.basics;


import java.util.ArrayList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();

        System.out.println("Size of the names list : " + names.size());


        names.add("Usame1");
        names.add("Userme2");
        names.add("UserName3");



        System.out.println("Size of the names list : " + names.size());

        System.out.println(names.get(2));


        for (String s: names) {
            System.out.println(s + " - - - " + s.length() + " --index is " + names.indexOf(s));
        }



    }

}
