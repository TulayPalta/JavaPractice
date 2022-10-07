package P01_kursiyer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KursiyerMain {
    public static void main(String[] args) {

        KursiyerKayit yeniKayit = new KursiyerKayit();
        List<Kursiyer> kisi=new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        boolean cikilsinMi=false;
        while (!cikilsinMi){
            System.out.println("işleminizi seçiniz :\n1-Kursiyer Kayıt"+
                    "\n2-Kursiyer Listele\n3-Kursiyer Ucretleri"+
                    "\n4-Ucretsiz kişiler\n5-cikis");
                    int islem= scan.nextInt();
                    switch (islem){
                        case 1:
                            kisi=yeniKayit.kayitYap(); break;
                        case 2:
                            yeniKayit.listeYap(kisi); break;
                        case 3:
                            yeniKayit.kursUcretiListesi(kisi); break;
                        case 4:
                            yeniKayit.ucretsizKursiyerler(kisi); break;
                        default:
                            System.out.println("hatali giris yaptiniz");
                    }
        }
    }
}
