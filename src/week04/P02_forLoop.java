package week04;

import java.util.Scanner;

public class P02_forLoop {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.(toplam +=i;)
        //        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir başlangıç değeri girin : ");
        int başlangıçDegeri = scan.nextInt();
        System.out.println("Bir bitiş değeri giriniz : ");
        int bitişDeğeri = scan.nextInt();

        int toplam = 0;

        if (bitişDeğeri < başlangıçDegeri) {

            System.out.println("===    Başlangıç değeri bitiş değerinden küçük olmalıdır      ===");

        } else{
            for (int i = başlangıçDegeri; i <= bitişDeğeri; i++) {
                toplam += i;

            }
            System.out.println("Girilen değerler arasındaki sayılar toplamı : "+toplam);

            //eğer yazdırmayı for'un içinde yaptığımızda her işlemde yani döngüde işlemi yazdıracak
            //ama soruda bizden toplamı istiyor

        }






    }
}
