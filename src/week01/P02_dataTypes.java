package week01;

public class P02_dataTypes {

    public static void main(String[] args) {

        /*
        byte  : sadece tamsayı değeri alır 8 bit
        short :sadece tamsayı değeri alır  16 bit
        int   : sadece tamsayı değeri alır 32 bit
        long  :sadece tamsayı değeri alır  64 bit

        float  :ondalıklı sayı değerleri alır- sonuna f veya F zorunlu
        double :ondalıklı sayı değerleri alır-sonuna d koyulabilir

        double>float>long>int>short>byte

        booleon : true ya ad false verir
        char    : tek tırnak içinde tek karakter- tırnak içinde olmadan sayı(ASCII) değerini verir

         */

        byte b1= Byte.MAX_VALUE;// maxsimum değer- eşittirden sonra byte büyük harfle yazılır kendisi küçültür
        System.out.println("b1 = " + b1);// soutv kısa komutu bize "b1 =" yazısını hazır olarak verir

        long l1= Long.MIN_VALUE;// minimum değer
        System.out.println("l1 = " + l1);
    }
}
