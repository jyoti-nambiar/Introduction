package demo;


import static copy.AnotherFuncExample.calulateInterest;

public class MasterFunct {
    public static void exemple() {
        System.out.println("It is sample static function");
    }

    public void nonExemple() {
        System.out.println("It is sample non static function");

    }

    public static void main(String args[]) {
        exemple();
        MasterFunct obj = new MasterFunct();
        obj.nonExemple();

        FuncExample.add();  // accessing a static function of diffrent class
        FuncExample2 abc = new FuncExample2();
        abc.printName();


        calulateInterest(200, 150);


    }
}
