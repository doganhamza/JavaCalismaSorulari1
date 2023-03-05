package SoruCozumleri;

public class soru9 {
    /*
        Rastgele bir harf veren bir method oluşturun ve ardından methodu kullanarak aşağıdakileri yazdırınız.
        ‘A’ ve ‘a’ için “İlk Karakter” yazdırınız.
        ‘B’ ve ‘b’ için “İkinci Karakter” yazdırınız.
        ‘C’ ve ‘c’ için “Üçüncü Karakter” yazdırınız.
        ‘D’ ve ‘d’ için “Dördüncü Karakter” yazdırınız.
        Diğerleri için “Diğer Karakterleri” yazdırınız.


        Math.random();//0-1 arasında random double sayı verir.
        System.out.println(Math.random()*10);//0-10 arasında bir sayı verir.

         */
    public static void main(String[] args) {
        char rasgeleHarf=rasgeleHarf();
        System.out.println("rasgeleHarf = " + rasgeleHarf);

        switch (rasgeleHarf){
            case 'a':
                System.out.println("ilk karakter");
                break;
            case 'b':
                System.out.println("ikinci karakter");
                break;
            case 'c':
                System.out.println("üçüncü karakter");
                break;
            case 'd':
                System.out.println("dördüncü karakter");
                break;
            default:
                System.out.println("diğer karakterler");
                break;
        }
    }
    public static char rasgeleHarf(){
     String alfabe="abcdefghijklmnopqrstuvwxyz";
     int rasgeleSayi=(int) (Math.random()*alfabe.length());
        return alfabe.charAt(rasgeleSayi);

    }
}
