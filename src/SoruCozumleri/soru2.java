package SoruCozumleri;

import java.util.Scanner;

public class soru2 {
    /*
    Hipotenüs hesaplayan bir kod yazınız.
    a^2 + b^2=c^2
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a kenar uzunluğunu giriniz");
        int a=input.nextInt();
        System.out.println("b kenarının uzunluğunu giriniz");
        int b=input.nextInt();

        double c=Math.sqrt(a*a+b*b);
        System.out.println(c);
    }
}
