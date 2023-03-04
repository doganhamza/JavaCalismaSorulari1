package SoruCozumleri;

import java.util.Scanner;

public class Soru4 {
    /*
    Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Örn:" ali  can "
       Ad: Ali
       Soyad: Can
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı arasıda boşluk ile giriniz.");
        String adSoyad=input.nextLine().replaceAll("\\s+"," ").trim();
        String [] adSoyad1=adSoyad.split(" ");
        String ad=adSoyad1[0];
        String soyad=adSoyad1[1];

        String adIlkHarf=ad.substring(0,1).toUpperCase();
        String soyadIlkHarf=soyad.substring(0,1).toUpperCase();

        String adFinal=adIlkHarf+ad.substring(1);
        String soyadFinal=soyadIlkHarf+soyad.substring(1);
        System.out.println("Adı:"+adFinal+"\n"+"Soyadı:"+soyadFinal);
    }
}
