package week04;

import java.util.Scanner;

public class P04_forLoop {

    public static void main(String[] args) {

         //Soru 10 (interview)- Kullanicidan bir String isteyin
        //                      ve String’i tersine cevirip kaydedin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");

        //önce girilen kelimenin index ini belirlemek ve sondan başlayarak yeni bir variable lı atamak
        String str= scan.next();
        String tersStr="";//buraya sondan başlayarak her bir harfi atıyoruz

        for (int i = str.length(); i >=1 ; i--) {//başlangıcı kelimenin uzunluğuna göre belirliyoruz,5 ten 1 e eşit olana kadar git
            tersStr+=str.substring(i-1,i);       //index e göre çözülünce zorlaşıyor, 1 yazmamızın sebebi karakter
                                                //sayısı en son 1 de biter
        }
        str=tersStr;
        System.out.println("Girilen kelimenin tersi : "+tersStr);




    }
}
