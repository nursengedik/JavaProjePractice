package week01;

import java.util.Scanner;

public class C04_SayınınRakamlarToplamınınBulma {
    public static void main(String[] args) {

        // Kullanicidan 3 basamakli bir sayi alin
        // ve sayinin rakamlar toplamini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir tamsayı giriniz");

        int girilenSayı= scan.nextInt();// sayı 123 olsun

        int rakam= girilenSayı%10;//rakamı bulabilmek için macınıs kullanılır yani sayının 10 a bölümünden kalan

        int rakamlarToplamı=rakam;// burada kodu çalıştırdığımızda konsolda sadece
                                 // birler basamagını bulduğumuz için 3 görürüz
                                // işlemi diğer rakamları da bulabilmek için 2 defa daha tekrar etmeliyiz
        //==============

        girilenSayı=girilenSayı/10;//kalan sayıyı bulabilmek içinse girilenSayı 10 na bölünür yani 123/10 sayı 12
        rakam=girilenSayı%10;// rakam 2
        rakamlarToplamı=rakamlarToplamı+rakam;//ilk rt 3'tü + 2 = 5 olur

        //==============

        girilenSayı=girilenSayı/10;// 12/10 sayı 1
        rakam=girilenSayı%10;// rakam 1
        rakamlarToplamı=rakamlarToplamı+rakam;// rt 5'ti + 1 = 6 olur


        System.out.println("Girilen sayının rakamları toplamı:"+rakamlarToplamı);



    }
}
