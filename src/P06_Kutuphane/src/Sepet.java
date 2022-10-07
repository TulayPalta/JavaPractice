package P06_Kutuphane.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sepet {
    static List<String> sapetKitapList = new ArrayList<>();
    static List<Integer> sapetFiyatList = new ArrayList<>();

    public static void sepet() {

        for (int i = 0; i < sapetKitapList.size(); i++) {
            System.out.println(sapetKitapList.get(i) + " --- " + sapetFiyatList.get(i) + " TL");
        }
        toplamTutar();

    }

    public static void toplamTutar() {
        int toplamTutar = 0;
        for (int i = 0; i < sapetKitapList.size(); i++) {

            toplamTutar += sapetFiyatList.get(i);

        }
        System.out.println("Toplam tutar : " + toplamTutar);
    }

    public static void odemeYap() {
        Scanner scan= new Scanner(System.in);
        System.out.println("Sepetinizdeki Urunler : ");
        sepet();
        System.out.println("Odemeyi onayliyor musunuz ? E yada H giriniz");
        String odemeDevamMi=scan.next();

        if (odemeDevamMi.equalsIgnoreCase("E")){
            System.out.println("Tesekkur ederiz...\nIYI OKUMALAR");
        } else if (odemeDevamMi.equalsIgnoreCase("H")) {
            System.out.println("Yine Bekleriz");
        }else {
            System.out.println("Yanlis giris yaptiniz!");
            odemeYap();
        }
    }
}
