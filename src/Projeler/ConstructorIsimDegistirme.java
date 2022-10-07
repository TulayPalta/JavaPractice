package Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConstructorIsimDegistirme {

// class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)

    /*
     * - Main method icerisinde bir ogrenciye ait variable’lar olusturun ve bu
     * variable’lara atama yapin

     * - isimDegistir adinda bir method olusturun, parametre olarak ogrenci
     * bilgilerini alsin ve methodun icinde tum bilgileri degistirip, yeni
     *  bilgileri
     * yazdirsin

     * - Main method icinde isimDegistir methodunu cagirdigimiz satirin hemen
     * sonrasinda yeniden ogrenci bilgilerini yazdirin

     * -Soyisimdegistir isminde bir method olusturun, bu method parametre olarak
     *  "soyisim"
      variable'ini alsin. method'un icinde kullaniciya yeni soyisim girmesini
      istesin ve
      eski soyismi degistirsin.

     * Not :Instance variable'lar object'lere aittir ve diger adi object
     * variable'dir
     */
    String isim;
    String soyIsim;
    int sinif;
    String sube;
    int okulNo;
public ConstructorIsimDegistirme(String isim, String soyIsim, int sinif, String sube, int okulNo) {
       this.isim = isim;
       this.soyIsim = soyIsim;
       this.sinif = sinif;
       this.sube = sube;
       this.okulNo = okulNo;
   }

    @Override
    public String toString() {
        return "ConstructorIsimDegistirme{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", sinif=" + sinif +
                ", sube='" + sube + '\'' +
                ", okulNo=" + okulNo +
                '}';
    }

    public ConstructorIsimDegistirme() {
    }
    
    public static void main(String[] args) {


        String isim = "Ayse";
        String soyIsim = "Yilmaz";
        int sinif = 5;
        String sube = "A";
        int okulNo = 321;


        ConstructorIsimDegistirme ogrenci = new ConstructorIsimDegistirme(isim, soyIsim, sinif, sube, okulNo);
        System.out.println("ilk hali: " + ogrenci);

        isimDegistir(ogrenci);
        System.out.println("son hali: " + ogrenci);
        ogrenci.soyIsim=soyisimDegisitir(ogrenci.soyIsim);
        System.out.println(ogrenci);


    }



    private static void isimDegistir(ConstructorIsimDegistirme ogrenci) {
        ogrenci.isim = "Ali";
        ogrenci.soyIsim = "Kaya";
        ogrenci.sinif = 4;
        ogrenci.sube = "B";
        ogrenci.okulNo = 333;

    }
    private static String soyisimDegisitir(String soyIsim) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni soyadinizi girin");
        soyIsim= scan.nextLine();


return soyIsim;
    }



}











