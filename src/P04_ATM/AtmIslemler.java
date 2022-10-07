package P04_ATM;

import java.util.Scanner;
public class AtmIslemler {
    Atm musteri1 = new Atm("sümeyye güler", "1212", "1111 1111 1111 1111", 10000);
    static Scanner scan = new Scanner(System.in);
    void sifre() {
        System.out.println("kartlı işlem için 1\nkartsız işlem için 2 tuşlayınız. ");
        Scanner scan2 = new Scanner(System.in);
        int sayi = scan2.nextInt();
        boolean degistir = false;
        while (!degistir) {
            if (sayi == 1) {
                System.out.println("kart numaranızı giriniz : ");
                String kartNo = scan.nextLine().replaceAll("\\s", "");
                System.out.println("şifrenizi giriniz : ");
                String sifre = scan2.nextLine();
                if (sifre.equals(musteri1.getSifre()) && kartNo.equals(musteri1.getKartNo())) {
                    degistir=true;
                } else {
                    System.out.println("sifre/kart no yanlış");
                }
            } else if (sayi == 2) {//kartsız işlem durumu
                System.out.println("sifrenizi giriniz : ");
                String sifre = scan.nextLine();
                if (sifre.equals(musteri1.getSifre())) {
                    System.out.println("sifre kabul edildi.");
                    degistir=true;
                }else{
                    System.out.println("sifre yanlis");}
            }else{
                System.out.println("yanlış seçim yaptınız");//1 veya 2 dışında seçim yapılırsa
                sifre();
            }
        }
    }
void menu(){
    System.out.println("islem secini \n1-Bakiye sorgula, \n2-para yatirma, \n3-para çekme, \n4-para gönderme, \n5-sifre değiştirme \n6-cikis");
       int secim=0;
    try {
        secim= scan.nextInt();
    } catch (Exception e) {
        System.out.println("hatali giris");
        menu();
    }
    switch (secim) {
        case 1: bakiyeSorgula(); break;
        case 2: paraYatirma(); break;
        case 3: paraCek(); break;
        case 4: paraGonder(); break;
        case 5: sifreDegistirme(); break;
    }
}

    private void sifreDegistirme() {
        System.out.println("mevcut sifrenizi giriniz");
        String sifre= scan.nextLine();
        if(sifre.equals(musteri1.getSifre())){
            System.out.println("yeni sifre giriniz");
            musteri1.setSifre(scan.nextLine());
            System.out.println("sifreniz değiştirildi");
        } else {
            System.out.println("tekrar sifre giriniz");
            sifreDegistirme();
        }
    }

    private void paraGonder() {
        System.out.println("Lutfen ıban no giriniz");
        String ibanNo = scan.nextLine().toUpperCase().replaceAll(" ", "");
        if (ibanNo.length() == 26 && ibanNo.startsWith("TR")) {
            System.out.println("ıban no dogru, Lutfen gondereceginiz miktari giriniz");
            double gonderilecekTtr = scan.nextDouble();
            if (gonderilecekTtr <= musteri1.getBakiye()) {
                musteri1.setBakiye(musteri1.getBakiye() - gonderilecekTtr);
                System.out.println("isleminiz tamamladi bakiyeniz: " + musteri1.getBakiye());
            } else {
                System.out.println("Bakiyeniz yetersiz lutfen para ekleyiniz");
                paraGonder();
            }

        } else {
            System.out.println("gecersiz iban");
            paraGonder();
        }

    }

    private void paraCek() {
        System.out.println("çekmek istediğiniz tutarı giriniz :");
        double cekilecekTutar = scan.nextDouble();
        if (musteri1.getBakiye() >= cekilecekTutar) {
            musteri1.setBakiye(musteri1.getBakiye() - cekilecekTutar);
        } else {
            System.out.println("yetersiz bakiye !");
            paraCek();
        }
    }

        void paraYatirma() {
        System.out.println("Ne kadar yatirmak istediginizi giriniz lutfen");
        double yatirilan=scan.nextDouble();
        if(yatirilan<0) {
            yatirilan=yatirilan*(-1);}
        musteri1.setBakiye(musteri1.getBakiye() + yatirilan);
        bakiyeSorgula();
    }

    void bakiyeSorgula() {
        System.out.println("Bakiyeniz : " +musteri1.getBakiye());
    }

}