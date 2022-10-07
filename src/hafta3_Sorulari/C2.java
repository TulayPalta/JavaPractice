package hafta3_Sorulari;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        int sayi1, sayi2, obeb;
        System.out.println("İki sayai giriniz:");
        Scanner scan = new Scanner(System.in);
        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();
        if (sayi1 < sayi2) {
            obeb = sayi1;
        } else {
            obeb = sayi2;
        }
        while ((sayi1 % obeb != 0) || (sayi2 % obeb != 0)) {
            obeb = obeb - 1;
        }
        if (obeb == 1) {
            System.out.println("Sayilar aralarinda asaldir..");
        } else {
            System.out.println("obeb  : " + obeb);

        }
    }}
