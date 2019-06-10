package demo.basics;

import java.io.FileNotFoundException;

public class ExceptionExample {


    public static void main(String[] args) {


        System.out.println("Start");



        divideNumber(4, 2);
      //  divideAnotherNumber(4, 0);


        System.out.println("execution completed");


        System.out.println("End");


    }

    private static void divideAnotherNumber(int i, int i1) {
        System.out.println(" Value is " + i/i1);

    }

    private static void divideNumber(int i, int j) {
       try {
           System.out.println("inside the divide function");
           System.out.println(" Value is " + i/j);
       } catch (ArithmeticException exc) {
           System.out.println("Found Exception");
           System.err.println("Error found is :"  + exc.getMessage());


       }
    }


}
