package denemeCalisma;

import java.util.Scanner;

public class C01_01 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen en az iki kelimeden olusan bir isim giriniz");
        String isim= scanner.nextLine();
        String sonuc=isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+
                isim.substring(isim.length()-2);
        System.out.println("sonuc = " + sonuc);
  }
    }

