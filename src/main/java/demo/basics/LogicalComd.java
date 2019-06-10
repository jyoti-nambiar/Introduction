package demo.basics;

public class LogicalComd {
    public static void main(String[] args) {
        isEven(4);
        isEven(21);
        isEven(214);
        isEven(2145);
        isEven(21456);
        isEven(214567);
        colorOfFruit("Apple");
        colorOfFruit("Grapes");
        colorOfFruit("orange");
        colorOfFruit("apple");
        colorOfFruit("apples");
        colorOfFruit("APPLE");
    }

    static final int TWO = 2;


    public static void isEven(int a) {
        //    System.out.println("Printing if the given number is Even or Odd");

//        System.out.println(5 % 2 == 0);
//        System.out.println(4 % 2 == 0);
//        System.out.println(a % 2 == 0);

        if (a % TWO == 0) {
            System.out.println("the given number " + a + " is an even");
        } else {
            System.out.println("the given number " + a + " is an odd");
        }


//        if (a % TWO != 0) {
//            System.out.println("the given number " + a + " is an odd");
//        }


    }

    public static void colorOfFruit(String fruitName) {
        if (fruitName.equalsIgnoreCase("Apple")) {
            System.out.println("The fruit is apple");

        } else if (fruitName.equalsIgnoreCase("Grapes")) {
            System.out.println("The fruit is Grape");
        } else {
            System.out.println("some other fruit");
        }
    }

}

