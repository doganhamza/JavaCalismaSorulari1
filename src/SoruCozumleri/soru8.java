package SoruCozumleri;

import java.util.Arrays;

public class soru8 {
    /*
      Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
     */

    public static void main(String[] args) {
        int[] arr = {100, 10001, -90, 845, 8787, 898, 0, 1};

        //1.yol

        int i = 0;
        int max2 = arr[i];
        int min2 = arr[i];
        int secMax2 = arr[i];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min2) {
                min2 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            } else if (arr[i] >secMax2 && arr[i]<max2) {
                secMax2 = arr[i];
            }
        }

        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);
        System.out.println("secMax2 = " + secMax2);


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//2.yol
        int min=arr[0];
        System.out.println("min = " + min);

        int max=arr[arr.length-1];
        System.out.println("max = " + max);

        int secMax=arr[arr.length-2];
        System.out.println("secMax = " + secMax);



    }
}
