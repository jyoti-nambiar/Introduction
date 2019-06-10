package demo.basics;

public class ArraysExample {

    public static void main(String[] args) {
        String names[] = new String[5];
        names[0] = "Jyoti";
        names[1] = "Arun";
        names[2] = "Arjun";
        names[3] = "Username1";
        names[4] = "UserName2";


        System.out.println("Size of the names array is " + names.length);

        System.out.println(names[0]);
        System.out.println(names[4]);
        System.out.println(names[1]);


        for(int i=1;i<=names.length;i++) {
            System.out.println(names[i-1]);

        }
    }

}
