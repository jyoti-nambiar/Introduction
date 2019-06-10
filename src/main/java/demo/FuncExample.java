package demo;

public class FuncExample {
    static int a = 15;

    public static void main(String[] args) {

        // Call the function with the name and required input parameters if any
        add();

     /*
        Function with input parameters and without return value
         */
        product(10, 20);

        /*
        This is a new comment
         */

        /*
        Function with Return type and without Input parameters
         */
        System.out.println(getPhoneNumber());


        int number = getPhoneNumber();
        System.out.println(number);

        /*
        Function with Retury Type and With Input parameters
         */


        String fullName = getFullName(5, "Nambiar");
        System.out.println("Full Name Obtained from Function is : " + fullName);


    }

    public static void add() {
        /*
        Function without input parameter and without return value
         */
        System.out.println("Inside the function add");
        int a = 10;
        int b = 15;
        int sum = a + b;
        System.out.println("The sum of two number is : " + sum);
    }

    public static void product(int a, int b) {


//        System.out.println("This is a local variable - " + a);
//        System.out.println("This is a gloabal variable - " + demo.FuncExample.a);
        int prod = a * b;
        System.out.println("Product of two number is : " + prod);

    }


    public static int getPhoneNumber() {

        int phoneNumber = 123;

        return phoneNumber;
    }


    public static String getFullName(int firstName, String lastName) {
        return "Mr/Mrs." + firstName + " " + lastName;
    }


}
