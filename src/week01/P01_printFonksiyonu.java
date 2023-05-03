package week01;

public class P01_printFonksiyonu {
    public static void main(String[] args) {

        //Ekranda birşey yazdırmak için sout kullanılır
        /*
        Soru 1- Konsola
        Hello World ve "Hello World"
        yazdırınız
         */
        //System.out.println("Hello World");// Run yani çalıştır yerine kısayol Ctrl+shift+F10 tuşunu kullanabiliriz
        //System.out.println("\"Hello World\"");

        /*
         Soru 2- Konsola
         "Hello  \
         'World' \/"
         yazdırınız
         */

        /*
        \n  : bir alt satırdan yazmaya başlar
        \t  : 1 TAB boşluk bırakır
        \"  :" yazar
        \'  :' yazar
        \\  :\ yazar
        \/  :/ yazar

         */

        //System.out.println("\"Hello\t\\\n'World'\t\\/\"");

        /*
        Soru3- Değer atayarak
        Nurşen Gedik - QA Software Test Engineer

        Bizden istenen cümleyi  sout diyerek çift tırnak içinde yazdırabiliriz,
        System.out.println("Nurşen Gedik - QA Software Test Enginer");

        ama burada değer atayarak konsolda yazdırmamızı istiyor

         */

        String name="Nurşen";
        String surname="Gedik";
        String job="QA Software Test Enginer";
        System.out.println(name+" "+surname+" - "+job);// variable isimleri yazılır
        System.out.println("========== KOD BAŞARIYLA TAMAMLANDI ========== ");

        System.out.print(name+" ");
        System.out.print(surname+" - ");
        System.out.print(job);
        System.out.println("");
        System.out.println("========== PRİNTLN FARKI ========== ");
        System.out.println(name+" ");
        System.out.println(surname+" - ");
        System.out.println(job);
        /*
        ÖDEV : Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.

        **********   WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 - Bakiye Sorgulama
            2 - Para Yatırma
            3 - Para Çekme
            4 - Bilgi Güncelleme
            5 - Kart İade
        **********   WISE BANK   **********
         */
        System.out.println("**********   WISE BANK   **********\n"+"\tWISE ATM'YE HOŞGELDİNİZ"+"\n\t1 - Bakiye Sorgulama"+"\n\t2 - Para Yatırma"+
                "\n\t3 - Para Çekme"+"\n\t4 - Bilgi Güncelleme"+"\n\t5 - Kart İade"+"\n**********   WISE BANK   **********");















    }
}
