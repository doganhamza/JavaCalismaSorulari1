package SoruCozumleri;

import java.util.Arrays;
import java.util.Scanner;

public class Soru10 {
     /*
     Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
     Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("array eleman sayısını giriniz.");
        int arru=input.nextInt();
        int[] arr=new int[arru];
        for(int i=0; i<arru;i++){
            System.out.println("array"+i+". elemanı giriniz.");
            arr[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Silmek istediğiniz indexi giriniz.");
        int silinecekindex= input.nextInt();

        int[] arr2=new int[arr.length-1];
        int idx=0;
        for(int i=0; i<arr.length; i++){
            if(i!=silinecekindex){
                arr2[idx]=arr[i];
                idx++;

            }
        }

        System.out.println(Arrays.toString(arr2));


    }
}
