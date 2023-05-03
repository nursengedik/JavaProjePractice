package week04;

import java.util.Scanner;

public class P03_forLoop {

    public static void main(String[] args) {

        /*
        kullanıcıdan 150 den küçük pozitif bir sayı alın, 1 den başlayarak tüm
        tamsayıları yazdırın //başlayarak denildiği için for loop
        - 3 ile bölünebilen bir sayıya gelirse, sayı yerine WISE  // şart cümleleri-if var
        - 5 ile bölünebilen bir sayıya gelirse, sayı yerine QUARTER
        - hem 3 ile hem 5 ile bölünebilen bir sayıya gelirse, sayı yerine WISE QUARTER
        yazdırın

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("150 den küçük pozitif bir tamsayı giriniz");
        int girilenSayı=scan.nextInt();

        for (int i = 1; i <=girilenSayı ; i++) {

            if (i%3==0 && i%5==0){//önce en kapsamlı olan şartı yazarız

                System.out.print(" WISE-QUARTER");
            } else if (i % 5 == 0) {

                System.out.print(" QUARTER");

            } else if (i % 3 == 0) {
                System.out.print(" WISE");

            }else {
                System.out.print(i+" ");
            }

        }





    }
}
