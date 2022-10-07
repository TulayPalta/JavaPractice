package Projeler;

import java.util.Arrays;
import java.util.Scanner;

public class StringKelimeSayisi {
    public static void main(String[] args) {
        /*
            Soru = Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle girin lutfen");
        String str = scan.nextLine().trim();
        int kontrol = 1;
        do {
            if (!str.contains("  ")) {       // iki bosluk ( space )
                kontrol = 0;
            } else {
                str = str.replace("  ", " "); // iki bosluk ( space ) tek bosluga cevriliyor
            }
        } while (kontrol == 1);
        String[] cumle = str.split(" ");
        int kelimeSayisi = cumle.length;
        System.out.println("Cumledeki kelimeler :" + Arrays.toString(cumle));
        System.out.println("Cumledeki kelime sayisi :" + kelimeSayisi);
    }
}