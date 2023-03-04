package SoruCozumleri;

import java.util.Arrays;

public class Soru5 {
    /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
   Örnek:
    String str ="$1 $12 €34 €56 $45 €78";
     dolarToplami: 58
     euroToplami: 168
     */
    public static void main(String[] args) {
        String str ="$1 $12 €34 €56 $45 €78";
        String[] str1=str.split(" ");
        System.out.println(Arrays.toString(str1));
        int dolarToplami=0;
        int euroToplami=0;
        for(String w:str1){
            if(w.contains("$")){
                dolarToplami +=Integer.parseInt(w.replaceAll("\\$",""));

            } else if (w.contains("€")) {
                euroToplami +=Integer.parseInt(w.replaceAll("€",""));

            }

        }
        System.out.println("dolarToplami = " + dolarToplami);
        System.out.println("euroToplami = " + euroToplami);
    }


}
