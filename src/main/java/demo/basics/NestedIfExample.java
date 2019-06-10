package demo.basics;

public class NestedIfExample {


    public static void main(String[] args) {
        printHighestNumber(202, 201, 30);
        compareNumbers(100, 20, 3);

    }

    private static void printHighestNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("A is greater than B and C");
            } else { // a is less than c
                System.out.println("A is greater than B and Less than C");
            }
        } else { // this block is executed only when A is Less than B
            if (a > c) { // this block is executed only when A is Greater than C
                System.out.println("A is less than B and A is Greater than C");
            } else { //
                System.out.println("A is less than B and C");
            }
        }
    }


    public static void compareNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }


    }


}
