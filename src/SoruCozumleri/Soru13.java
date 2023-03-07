package SoruCozumleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru13 {
    //Kullanıcıdan aldığınız bir sayıyı bir list'e ekleyen, list'ten çıkaran yada mevcut bir
    // elementi o sayı ile güncelleyen bir kod yazınız.
    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
        System.out.println("ekleme yapmak için '+', listeden çıkartmak için '-' , listedeki sayıyı güncellemek için '*' işaretini giriniz.");
        String islem=input.next();
        System.out.println("lütfen işlem yapmak istediğiniz sayısı giriniz");
        int sayi=input.nextInt();
        System.out.println("lütfen güncellemek istediğiniz indexi giriniz");
        int index=input.nextInt();


        switch (islem){
            case "+":
                list1.add(sayi);
                break;
            case"-":
                list1.remove(sayi);
                break;
            case "*":
                list1.set(index,sayi);
                break;
        }
        System.out.println(list1);

    }
}
