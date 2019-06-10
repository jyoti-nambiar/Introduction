package demo.basics;

public class May31Task {

    public static void main(String[] args) {
        checkEvenLength(5, "Jyoti");
        checkEvenLength(2, "Arun");

        displayEven(100);

    }

    private static void displayEven(int i) {
        System.out.println("The list of even numbers are");
        int k = 1;
        while (k < i/2) {
                System.out.println(k*2);
            k++;
        }
    }





    private static void checkEvenLength(int m, String l) {
        if (m % 2 == 0) {
            System.out.println("The number " + m + " is  Even and the length of the string is " + l.length());
        } else {
            System.out.println("The number " + m + " is  Odd and the length of the string is " + l.length());

        }

    }
}


    /*
    A function that takes 2 input parameters
    - String and Integer

    Function should print if the number is an even number or not
    And Print the lenght of the string in the same line



    A function that takes one integer
    Run a loop till the given number from 1
    And Print only Even Numbers between 1 and given number


     */



