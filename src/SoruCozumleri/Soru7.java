package SoruCozumleri;

import java.util.Scanner;

public class Soru7 {
    /* Günün sorusu: if statement
      katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
        ax² + bx + c;

        Çözüm adımları
        kullanıcıdan a,b,c yi alın.
        Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.

     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("fonksiyonda a değerini giriniz");
        int a=input.nextInt();

        System.out.println("fonksiyonda b değerini giriniz");
        int b=input.nextInt();

        System.out.println("fonksiyonda c değerini giriniz");
        int c=input.nextInt();
        int delta=(b*b)-4*a*c;

        double x1=0;
        double x2=0;

        if(delta>0){
            x1=(-b +Math.sqrt(delta))/2*a;
            x2=(-b -Math.sqrt(delta))/2*a;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta==0) {
            x1=-b/2*a;
            System.out.println("x1 = " + x1);
        } else if (delta<0) {
            System.out.println("kök yoktur");
        }




    }

}
