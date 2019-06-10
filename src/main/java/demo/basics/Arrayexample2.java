package demo.basics;

public class Arrayexample2 {
    public static void main(String[] args) {
            int number[] = new int[6];
number[0]=9880;
number[1]=9589;
number[2]=83;
number[3]=9819;
number[4]=4063;
number[5]=43;
for(int j=0;j<number.length;j++) {
    System.out.println(+number[j]);
}
        System.out.println("My phone number is "+number[0]+number[1]+number[2]);
        System.out.println("My office number is "+number[3]+number[4]+number[5]);

    String country[]=new String[5];
    country[0]="India";
    country[1]="Australia";
    country[2]="Japan";
    country[3]="China";
    country[4]="Russia";
     for(int i=0;i<country.length;i++) {
         System.out.println("The name of the countries is "+country[i]);
     }



    }

}
