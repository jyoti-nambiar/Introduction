package demo;

public class HelloWorld {

    public void addNumber() {//Non static function w/o input parameters and return type
        int a = 6;
        int b = 12;
        int c = a + b;
        System.out.println("The sum of the the two numbers =" + c);
    }

    public String giveName() {//function with return type and w/o input parameters
        String a = "Helloworld";
        return a;
    }

    public void product(int a, int b) {//function with input characters and no return type
        int c = a * b;
        System.out.println("The product of the numbers =" + c);
    }

    public String printName(int a, String b) {//function with input parameters and return type

        product(2, 2);

        return +a + " " + b + giveName();
    }


    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.addNumber();
        helloWorld.product(3, 6);
        System.out.println(helloWorld.giveName());
        System.out.println(helloWorld.printName(10, "Shruti"));

    }


}



