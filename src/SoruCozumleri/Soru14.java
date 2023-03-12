package SoruCozumleri;

import java.util.Scanner;

public class Soru14 {
    //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
    //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
    //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!! ? tahminde sayiyi buldunuz. Puaniniz: ?
    public static void main(String[] args) {
        int rastgeleSayi = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 0-100 arasında bir sayı giriniz");


        int tahmin;
        int count=0;
        do {
            tahmin = input.nextInt();
            count++;
            if (rastgeleSayi == tahmin) {
                System.out.println("Tebrikler kazandınız.");
            } else if (rastgeleSayi > tahmin) {
                System.out.println("Daha büyük bir sayı giriniz.");
            } else if (rastgeleSayi < tahmin) {
                System.out.println("Daha küçük bir sayı giriniz.");
            }


        } while (rastgeleSayi != tahmin);
        System.out.println(count + ". denemede buldunuz.");

    }
}
