package demo;

public class FuncExample2 {
    public void printGivenName(String a) {
        System.out.println("The Given name is" + a);
    }

    public void printName() {
        System.out.println("Jyoti");

    }
    public String addition(String a, String b) {
        return a +b ;
    }
    public String printstate(){
        String a= "arjun";
        return a;


    }
    public static void main(String[] args) {

        String str;
        str = "New String stored in variable";

        //  printName();


        // Intializing the class object
        //<ClassName> <ObjectName> = new <ClassName>();


        FuncExample2 funcExample2 = new FuncExample2();
        funcExample2.printName(); // using frist object to call function without input and without return type
        funcExample2.printGivenName("Jyoti"); // using first object to call func with input and without return type


        //This is a second object of the same class
        FuncExample2 funcExample21 = new FuncExample2(); // second object of the same class
        funcExample21.printGivenName("Second variable"); // using second object to call func with i/p and without return type
        funcExample21.printGivenName(str);// using second object to call func with i/p as a variable and without return type

        System.out.println(funcExample2.addition("Jyoti","Nambiar"));//With input parameters and with return type

        System.out.println(funcExample21.printstate());//with return type and without input parameters


    }





}
