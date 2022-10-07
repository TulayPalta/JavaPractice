package P01_kursiyer;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class KursiyerKayit {
    static int sayac = 1000;
    List<Kursiyer> kursiyerler = new ArrayList<>();

    public List<Kursiyer> kayitYap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad ve soyadınızı giriniz");
        String isim = scan.nextLine();
        System.out.println("Kurs tipini giriniz: \nQA\nDEV\nSALESFORCE\nCYBER SECURITY");
        String kursTipi = scan.nextLine().toUpperCase();
        int kayitId = ++sayac;
        Kursiyer kisi = new Kursiyer(isim, kursTipi, LocalTime.now(), kayitId);
        kursiyerler.add(kisi);
        return kursiyerler;
    }

    public void kursUcretiListesi(List<Kursiyer> kurs) {
        for (Kursiyer each : kurs) {
            if (each.kayitId % 5 != 0) {
                if (each.kursTipi.charAt(0) == 'Q') {
                    System.out.println(each.isim + "Kurs ücretiniz: 850€");
                }
                if (each.kursTipi.charAt(0) == 'D') {
                    System.out.println(each.isim + "Kurs ücretiniz: 950€");
                }
                if (each.kursTipi.charAt(0) == 'C') {
                    System.out.println(each.isim + "Kurs ücretiniz: 750€");
                }
                if (each.kursTipi.charAt(0) == 'S') {
                    System.out.println(each.isim + "Kurs ücretiniz: 650€");
                }
            }
        }
    }
    public void listeYap(List<Kursiyer> etka){
        for (Kursiyer each : etka) {
            System.out.println(each.kayitId+ " "+each.isim + " "+each.kursTipi+ " "+each.kayitZamani);
        }
    }
    public void ucretsizKursiyerler(List<Kursiyer> etka2) {
        if (sayac > 1004) {
            for (Kursiyer each : etka2) {
                if (each.kayitId % 5 == 0) {
                    System.out.println("Tebrikler" + each.isim + " kursumuz size ücretsizdir.");
                }
            }
        }else System.out.println("Ücretsiz kursiyerimiz yoktur");
    }
}