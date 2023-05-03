package week04;

public class P05_forLoop {

    public static void main(String[] args) {

        /*
        Verilen String deki kullanılan harfleri, kelimeleri
        ve tekrarsız halini yazdırıp kelimede kullanılan
        farklı harf sayısını yazdırın

         */

        String input="Have a nice a day";
        String tekrarsızInput="";//girişin tekrarsız hali
        String islenecekKelime=input.replaceAll("\\W","");//boşlukları kaldır demek-Haveaniceaday
        System.out.println(input.substring(0,1));//H -ilk index i alma -15 ve 16. satır kontrol amaçlı yazılıyor
        tekrarsızInput=islenecekKelime.substring(0,1);//H

        for (int i = 1; i <islenecekKelime.length() ; i++) {//1. karakterden başla lenght ine so karaktere kadar git
            if (!tekrarsızInput.contains(islenecekKelime.substring(i,i+1)));{
                System.out.print(","+islenecekKelime.substring(i,i+1));
                tekrarsızInput+=islenecekKelime.substring(i,i+1);
            }

        }
        System.out.println(" ");
        System.out.println("input : "+input);
        System.out.println("tekrarsız input : "+tekrarsızInput);
        System.out.println("tekrarsız harf sayısı : "+tekrarsızInput.length());



    }
}
