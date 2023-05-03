package week01;

public class C03_DataCastingÇalışma3 {
    public static void main(String[] args) {

        //ktp23-s1- Int olarak verilen 3 değerin ortalamasını double olarak yazdıran bir kod yazın

        int s1=13;
        int s2=23;
        int s3=32;

        //  (s1+s2+s3) isleminin sonucunu ondalikli olarak nasil yazdirabiliriz ?

        System.out.println((double) ((s1+s2+s3)/3) );

        // islem onceligi ((s1+s2+s3)/3)'dedir.
        // Java oncelikle  ((s1+s2+s3)/3) islemini yapar ve sonucu 22 bulur
        // ( işlemin sonucu 22.666 olsa da sayılar int oldugu için sonucun tam kısmını alır
        // sonra (double) oldugundan 22'yi double'a cast eder 22.0 bulur


        System.out.println((double) (s1+s2+s3)/3 );
        System.out.println(((double)s1+s2+s3)/3); //22.666666666666668

        // (s1+s2+s3) isleminin sonucunun double olmasi icin
        // isleme girenlerden birisi double olmalidir





    }
}
