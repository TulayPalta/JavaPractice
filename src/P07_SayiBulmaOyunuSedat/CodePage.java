package P07_SayiBulmaOyunuSedat;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CodePage {
    static Scanner scan = new Scanner(System.in);

    public static void girisSayfasi() {
        System.out.print("\nAciklama icin 1'i, Oyun icin 2'yi giriniz 3 Cikis : ");
        String str = scan.nextLine();
        int giris = 0;
        try {
            giris = Integer.parseInt(str) % 10;
        } catch (Exception e) {
            giris = 0;
        }
        switch (giris) {
            case 1:
                aciklamaGetir();
                girisSayfasi();
                break;
            case 2:
                sayiUret();
                girisSayfasi();
                break;
            case 3:
                System.out.println("Iyi Gunler Yine Bekleriz");
                break;
            default:
                System.out.println("Lutfen 1 - 3 arasi tam sayi giriniz");
                girisSayfasi();
                break;
        }
    }

    private static void sayiUret() {
        Random rnd = new Random();
        int sayi;
        String s = "";
        int kontrol = 1;
        do {
            sayi = rnd.nextInt(8999) + 1000;
            s = "" + sayi;
            kontrol = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (s.substring(i, i + 1).equals(s.substring(j, j + 1))) {
                        kontrol = 0;
                        if (kontrol == 0) break;
                    }
                }
                if (kontrol == 0) break;
            }
            if (kontrol != 0) break;
        } while (true);
        System.out.println(sayi);// Bu satiri yoruma aliniz veya SILINIZ
        oyunKullaniciSayiKontrol(sayi);
    }

    public static void oyunKullaniciSayiKontrol(int sayi) {
        scan.nextLine();
        String asilSayi = "" + sayi;
        int tahmin = 0;
        String tahmin2 = "";
        int dogruRakam = 0;
        int rakamTamYeri = 0;
        int sayac = 0;
        do {
            sayac++;
            dogruRakam = 0;
            rakamTamYeri = 0;
            System.out.print(sayac + ". Tahmininizi Giriniz ( 4 Basamakli Rakamlari Farkli Tam Sayi Olmalidir ) :");
            tahmin2 = scan.nextLine();
            try {
                tahmin = Integer.parseInt(tahmin2);
            } catch (Exception e) {
                tahmin = 111;
            }
            if (tahmin > 999 && tahmin < 10000) {
                for (int i = 0; i < 4; i++) {
                    if (asilSayi.contains(tahmin2.substring(i, i + 1))) {
                        dogruRakam++;
                    }
                }
                for (int i = 0; i < 4; i++) {
                    if (asilSayi.substring(i, i + 1).equals(tahmin2.substring(i, i + 1))) {
                        rakamTamYeri++;
                    }
                }
            }
            System.out.println("+" + rakamTamYeri + "  -" + dogruRakam);
            if (rakamTamYeri == 4) {
                System.out.println("Tebrikler Bildiniz");
                break;
            }
        }
        while (true);
    }


    public static void aciklamaGetir() {
        int k;
        try {
            FileInputStream fis;
            fis = new FileInputStream("src/Projects01/SayiBulmaOyunuSedat/GamesRules.txt");
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (IOException e) {
            System.out.println("Dosya bulunamadi");
        }
    }
}
