package week01;

import java.util.Scanner;

public class C02_ScannerÇalışma2 {

    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Birinci Sayıyı giriniz (Tamsayı):");
        int sayı1= scan.nextInt();

        System.out.println("Lütfen İkinci Sayıyı giriniz (Tamsayı):");
        int sayı2= scan.nextInt();

        //önce boş bir veri kutusu oluşturulur
        int boş=0;

        boş=sayı2;
        sayı2=sayı1;
        sayı1=boş;

        System.out.println("Sayı1' in yeni değeri:"+sayı1);
        System.out.println("Sayı2' nin yeni değeri:"+sayı2);


        // Casting
        int say1=10;
        short say2=20;
        double say3=30;
        say2=(short) say1;
        say1= (int) say3;

        byte b1=15;
        int i1=25;
        b1=(byte) i1;

    }
}
