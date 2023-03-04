package SoruCozumleri;

import java.util.Scanner;

public class soru3 {
    /*
    3-
    Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
   (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
    */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Aldığınız notu giriniz.");
        int not=input.nextInt();

       /*
        if(not>89){

            System.out.println("A");
        } else if (not>79 ) {
            System.out.println("B");
        } else if (not>69) {
            System.out.println("C");
        } else if (not>59) {
            System.out.println("D");
        }else if(not>49){
            System.out.println("E");
        }else{
            System.out.println("F");
        }

        */

        //ikinci yol
        String notHarf=not>100 ? "0-100 arasında bir sayı giriniz":
                not>89? "A":
                        not>79 ? "B":
                                not>69 ? "C":
                                        not>59 ?"D":
                                                not>49 ?"E":
                                                        not>-1?"F" : "0 ile 100 arasında bir sayı giriniz.";
        System.out.println(notHarf);

    }
}
