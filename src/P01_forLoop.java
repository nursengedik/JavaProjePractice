import java.util.Scanner;

public class P01_forLoop {

    public static void main(String[] args) {

        ////Soru 2- Kullanicidan pozitif bir tamsayi alin,
        //          1’den girilen sayiya kadar(girilen sayi dahil) (for oluşturulacak)
        //          7 ile bolunebilen sayilari yazdirin.(if oluşturulacak)


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz ");
        int girilenSayı= scan.nextInt();
//
        for (int i=1; i<=girilenSayı; i++){
             if (i%7==0){
                 System.out.print(i+"- ");
             }
         }

        System.out.println("");
        System.err.println("==================İŞLEM TAMAMLANDI================");//serr yazınca olşturuluyor
                                                                                 //kırmızı yazıyor







    }
}
