package week01;

import java.util.Scanner;

public class P04_Scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ad/soyad/yaş/mail adresi/şifre bilgilerini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın

        *****     KAYIT BAŞARILI     *****
             Adınız: Nurşen
             Soyadınız: Gedik
             Yaşınız: 41
             Mail Adresiniz: gedik@nursen.com.tr
             Şifreniz:A2*365

             şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String name = scan.nextLine();
        System.out.println("LÜtfen soyadınızı giriniz: ");
        String surname = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz: ");
        int age = scan.nextInt();
        System.out.println("E-posta adresinizi giriniz: ");
        String mail = scan.next();
        System.out.println("Lütfen şifrenizi giriniz: ");
        String pass = scan.next();

        System.out.println("*****     KAYIT BAŞARILI     *****\n" +
                "\tAdınız: " + name +
                "\n\tSoyadınız: " + surname +
                "\n\tYaşınız: " + age +
                "\n\tMail Adresiniz: " + mail +
                "\n\tŞifreniz: " + pass +
                "\nşeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");
        System.out.println("=================SORU BİTTİ================");













    }
}

        //Ctrl+Alt+L satırın yanında bastıgımızda satırı veya tüm yazıyı düzenler
        //Ctrl+Shift+F10 kısayolu RUN yani çalıştır tuşunun kısayoludur.