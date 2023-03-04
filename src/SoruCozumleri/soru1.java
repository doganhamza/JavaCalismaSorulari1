package SoruCozumleri;

import java.util.Scanner;

public class soru1 {
     /*1-
     Fahrenheit değeri, Celsius değere çeviren kod yazınız.
     formül: c = (f-32)*5/9 */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("fahrenhayt değerini giriniz");
        int fah=input.nextInt();
        int celcius;
        celcius=(fah-32)*5/9;
        System.out.println(celcius);
    }
}
