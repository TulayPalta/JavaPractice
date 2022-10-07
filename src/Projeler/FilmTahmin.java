package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {
        static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "HOME ALONE 3", "KARTALIN PENCESINDEKI YILAN", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
        static Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {
 /*
     TASK :
      ***yukaridaki film listinde bulunan filmlerden herhangi birisini kullanicinin film ismini  gormeden
      ***filmin index nosuna gore sectiriniz
      ***secilen filmin  ismini filmin harf sayisinin 2 kati kadar hak taniyarak tahmin etmesini
      ***saglayan method create ediniz...

      *** kullanicinin sectigi filmin harf sayisini  console yazdiriniz.
      *** kullanicinin sectigi film icin tahmin hakkini  console yazdiriniz.
      *** kullanicinin her tahmininde kalan hak sayisini console yazdiriniz.
      *** kullanicinin her tahmininde dogru ve yanlis tahmin  sayisini console yazdiriniz.
      *** kullanicinin kaybedip veya kazandigini ve tahmin etmesi gereken filmin ismini  console yazdiriniz.
     */
            System.out.print(filmler.size() + " tane filmden birini sayisini giriniz :");
            int tahminindex = scan.nextInt() - 1;     // film sayisi ile index sayisi arasindaki fark icin -1 kullandik
            scan.nextLine();
            filmTahmin(tahminindex);
        }

        public static void filmTahmin(int tahminindex) {
            String starWords = "";

            String filmAdi = filmler.get(tahminindex);

            int filmUzunlugu = filmAdi.length();

            System.out.println(filmAdi); // DAHA Sonra yorum satirina aliniz

            starWords = filmAdi.replaceAll("\\w", "_");
            System.out.println(starWords);

            System.out.println("Filmin harf sayisi : " + filmUzunlugu);

            System.out.println("Tahmin sayiniz : " + (filmUzunlugu * 2));

            String tahmin = "";
            int control = 0;

            for (int i = 0; i < filmUzunlugu * 2; i++) {
                System.out.print((i + 1) + ". tahmininiz icin harf giriniz : ");
                tahmin = scan.nextLine().substring(0, 1).toUpperCase();
                for (int j = 0; j < filmAdi.length(); j++) {
                    if (filmAdi.contains(tahmin)) {     // Aradigimiz harfin icinde olup olmadigini konrol ettik
                        System.out.println("Dogru");
                        starWords = harfYerlestir(filmAdi, starWords, tahmin);
                        break;
                    } else {
                        System.out.println("Yanlis");
                        break;
                    }
                }
                System.out.println(starWords);
                if (!starWords.contains("_")) break;

                if ((filmUzunlugu * 2 - i - 1) == 0) {
                    System.out.println("Filmin adi : " + filmler.get(tahminindex) + " olacakti");
                    break;
                }
                System.out.println((filmUzunlugu * 2 - i - 1) + " tahmininiz kaldi");
            }
        }

        public static String harfYerlestir(String filmAdi, String starWords, String tahmin) {
            String str = "";
            for (int i = 0; i < filmAdi.length(); i++) {
                if (filmAdi.substring(i, i + 1).equals(tahmin)) {
                    str += filmAdi.substring(i, i + 1);
                } else {
                    str += starWords.substring(i, i + 1);
                }
            }
            return str;
        }
    }

