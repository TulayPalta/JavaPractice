package hafta3_Sorulari;

import java.util.Arrays;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        int dizi1[]={1,2,3,4,5,6,7,8,9,10};
        int dizi2[]={5,3,14,6,9,20,1};
        int bosdiziElemanSayi=0;
        int dizi1u=dizi1.length;
        int dizi2u=dizi2.length;
        for (int i = 0; i < dizi1u; i++) {
            for (int j = 0; j < dizi2u; j++) {
                if (dizi1[i]==dizi2[j]){
                    bosdiziElemanSayi++;
                }

            }

        }
        int bosdizi[]=new int[bosdiziElemanSayi];
        int index=0;
        for (int i = 0; i < dizi1u; i++) {
            for (int j = 0; j < dizi2u; j++) {
                if (dizi1[i]==dizi2[j]){
                    bosdizi[index]=dizi1[i];
                    index++;

                }

            }

        }
        System.out.println("yeni olusan dizi   :"+ Arrays.toString(bosdizi));
    }

    public static class T10_asal {
                public static void main(String[] args) {
                    //  Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java Methodu yazınız.
                    // -->> Asal sayi : 1 ve kendisinden başka böleni olmayan sayılardır

                Scanner scan = new Scanner(System.in);
                    System.out.println("lütfen bir sayi giriniz");
                    int sayi= scan.nextInt();

                    asalMi(sayi);




         }

        public static void asalMi(int sayi) {
                    int sayac=0;

                    if (sayi<=0) {
                        System.out.println("negatif sayılarda ya da 0'da asal aranmaz");
                    } else {
                        for (int i = 2; i < sayi; i++) {
                            if (sayi % i == 0) {
                                sayac++;
                            }
                        }System.out.println(sayac==0? "True":"False");
                    }


        }
    }
}
