package week01;

import java.util.Scanner;

public class C01_ScannerÇalışma1 {

    public static void main(String[] args) {
        //kullanıcıdan bir sayı alın
        //ve sayının karesini yazdırın

        //Önce scanner objesi oluşturulur
        Scanner scan= new Scanner(System.in);

        //Sonra kullanıcıya mesaj verilir
        System.out.println("Lütfen bir sayı giriniz");

        // girilen bilgiyi içine koyabileceğiniz bir variable oluştururuz
        // oluşturduğumuz scanner objesi ile uygun method'u kullanarak bilgiyi alırız.

        double girilenSayı= scan.nextDouble();

        //sonra yazdırırız

        System.out.println("Girilen sayının karesi:"+girilenSayı*girilenSayı);




    }
}
