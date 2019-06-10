package demo.basics;

public class LoopExample {

    /*
    1. While Loop
        Entry Controlled Loop
        - Loop Variable with initialized value
        - Loop Condition'
        - Loop Variable Increment/Decrement operator



    2. Do - While Loop
        Exit Controlled Loop
        - Loop Variable with initialized value
        - Loop Condition'
        - Loop Variable Increment/Decrement operator

    3. For Loop
     */


    public static void main(String[] args) {

        int i = 10; // Loop variable for While

        while (i < 5) {
            System.out.println(i + " - inside while");
            i++;
        }


        int j = 10;

        do {
            System.out.println(j + " - inside do - while");
            j++;
        } while (j < 5);


        for (int k = 0; k <= 5; k++) {
            System.out.println(k + " - Inside For loop ");
        }


    }

}
