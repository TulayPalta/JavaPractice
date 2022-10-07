package P05_Starbucks.src;

import java.util.Scanner;

public class Kafe {
    static int kahveNo;
    static boolean sutMu;
    static boolean sekerMi;
    static String ebat;



Kafe()  {
    Scanner scan = new Scanner(System.in);
    this.kahveNo = Starbucks.menuSecim;
    System.out.println("Kahveniz hazirlaniyor lutfen bekleyiniz...");
    for (int i = 1; i < 11; i++) {
        System.out.println("%" + (i * 10) + " tamamlandi...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("ok");
        }
    }


    int sut;
    while (true) {
        System.out.println("Sut eklememi istermisiniz ?\nEvet => 1  Hayir=>2");
        try {
            sut = scan.nextInt();
            if (sut == 1) {
                System.out.println("Kahvenize sut ekleniyor");
                for (int i = 1; i < 11; i++) {
                    System.out.println("Sut %" + (i * 10) + " eklendi");
                    Thread.sleep(1000);
                }
                System.out.println("Islem tamamlandi");
                sutMu = true;
                break;
            } else if (sut == 2) {
                System.out.println("Kahveniz sade hazirlanacak");
                sutMu = false;
                break;
            } else {
                System.out.println("Lutfen dogru tercih yapiniz");
            }
        } catch (Exception e) {
            System.out.println("Lutfen sayi giriniz!!!");
        }


    }

    System.out.println("------------------------------");

    int seker;
    while (true) {
        System.out.println("Seker eklememi istermisiniz ?\nEvet => 1  Hayir=>2");
        try {
            seker = scan.nextInt();
            if (seker == 1) {
                System.out.println("Kahvenize seker ekleniyor");
                for (int i = 1; i < 11; i++) {
                    System.out.println("Seker %" + (i * 10) + " eklendi");
                    Thread.sleep(1000);
                }
                System.out.println("Islem tamamlandi");
                sekerMi = true;
                break;
            } else if (seker == 2) {
                System.out.println("Kahveniz sade hazirlanacak");
                sekerMi = false;
                break;
            }else {
                System.out.println("Lutfen 1 yada 2 giriniz!");
            }
        } catch (Exception e) {
            System.out.println("Lutfen sayi giriniz!!!");
        }

    }

    System.out.println("------------------------------");

    int boyut;
    while (true) {
        System.out.println("Kahveniz Hangi boyutta olsun ?\n1--> Buyuk boy\n2--> Orta boy\n3--> Kucuk boy");
        boyut = scan.nextInt();
        if (boyut==1){
            System.out.println("Kahveniz buyuk boy olarak hazirlanacak");
            for (int i = 1; i < 11; i++) {
                System.out.println("Kahve %" + (i * 10) + " dolduruldu");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("ok");
                }
            }
            System.out.println("Kahveniz Hazir :)");
            ebat="Buyuk Boy";
            break;

        } else if (boyut==2) {
            System.out.println("Kahveniz orta boy olarak hazirlanacak");
            for (int i = 1; i < 11; i++) {
                System.out.println("Kahve %" + (i * 10) + " dolduruldu");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("ok");
                }
            }
            System.out.println("Kahveniz Hazir :)");
            ebat="Orta Boy";
            break;
        } else if (boyut==3) {
            System.out.println("Kahveniz kucuk boy olarak hazirlanacak");
            for (int i = 1; i < 11; i++) {
                System.out.println("Kahve %" + (i * 10) + " dolduruldu");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("ok");
                }
            }
            System.out.println("Kahveniz Hazir :)");
            ebat="Kucuk Boy";
            break;
        }else {
            System.out.println("Lutfen 1 yada 2 yada 3 giriniz!");
        }
    }

    System.out.println("Kahveniz hazir afiyet olsun...");


}

}

