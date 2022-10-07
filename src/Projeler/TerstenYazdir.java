package Projeler;

import java.util.Scanner;

public class TerstenYazdir {public static void main(String[] args) {
    // Kullanıcının girdiği integer sayıyı
    // tersten yazdıran kod bloğu yazınız.123==>321 yada 1045==>5401 gibi.

    Scanner scan = new Scanner(System.in);
    System.out.print("Klavyeden bir sayi giriniz = ");
    int sayi = scan.nextInt();

    tersCevirStringleDonmeyen(sayi);
    System.out.println("Girilen sayinin tersi : " + tersCevirStringleDonen(sayi));

    tersCevirIntegerleDonmeyen(sayi);
    System.out.println("Girilen sayinin tersi : " + tersCevirIntegerleDonen(sayi));

}

    private static int tersCevirIntegerleDonen(int sayi) {
        int temp = sayi;
        int basamak = 0;
        do {
            temp /= 10;
            basamak++;
        } while (temp != 0);
        int terssayi = 0;
        temp = sayi;
        for (int i = 1; i <= basamak; i++) {
            terssayi *= 10;
            terssayi += temp % 10;
            temp /= 10;
        }
        return terssayi;
    }

    public static void tersCevirIntegerleDonmeyen(int sayi) {
        int temp = sayi;
        int terssayi = 0;
        for (int i = 1; i <= ("" + sayi).length(); i++) {
            terssayi *= 10;
            terssayi += temp % 10;
            temp /= 10;
        }
        System.out.println("Girilen sayinin tersi : " + terssayi);
    }

    public static String tersCevirStringleDonen(int sayi) {
        String str = "" + sayi;
        String tersstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersstr += str.substring(i, i + 1);
        }
        return tersstr;
    }

    public static void tersCevirStringleDonmeyen(int sayi) {
        String str = "" + sayi;
        String tersstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersstr += str.charAt(i);
        }
        System.out.println("Girilen sayinin tersi : " + tersstr);
    }
}

