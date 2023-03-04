package SoruCozumleri;

import java.util.Scanner;

public class soru6 {
    /*
        Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int alinanSayi=input.nextInt();
        int sonRakam=alinanSayi%10;
        System.out.println("sonRakam = " + sonRakam);
        int ilkRakam=alinanSayi;


       while (ilkRakam>9){
           ilkRakam /=10;
       }
        System.out.println("ilkRakam = " + ilkRakam);

       int ilksontoplami=ilkRakam+sonRakam;

        System.out.println("ilksontoplami = " + ilksontoplami);


    }
}
