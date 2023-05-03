package week04;

import java.util.Scanner;

public class P06_forLoop {

    public static void main(String[] args) {

        //Verilen bir pozitif tamsayının
        //pozitif tam bölenlerini yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir pozitif bir tamsayı girin");
        int sayı=scan.nextInt();
        if (sayı<=0){
            System.out.println("Yanlış giriş");
        }else {
            for (int i = 1; i <=sayı ; i++) {
                if (sayı%i==0){
                    System.out.print(i+" ");

                }

            }
        }






    }
}
