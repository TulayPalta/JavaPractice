package Projeler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListteIslemler {

        public static void main(String[] args) {
            //Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdiriniz.
            List<String> deneme = new ArrayList<>();
            deneme.add("A");
            deneme.add("C");
            deneme.add("E");
            deneme.add("F");
            System.out.println(deneme);
            // indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
            // index’li add() methodunu kullanarak, L’yi 1 numarali index'e ekleyiniz.
            // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.
            deneme.add("B");
            deneme.add(1, "L");
            System.out.println(deneme);
            //set() methodu kullanarak, E’yi D yapiniz.
            //ArrayList’i ekrana yazdiriniz, list goyle olmalı; A, L, C, D, F, B.

            deneme.set(deneme.indexOf("E"), "D");
            System.out.println(deneme);
            // remove() methodu kullanarak, F’yi siliniz.ArrayList’i ekrana yazdiriniz,
            // list boyle olmali; A, L, C, D, B.
            deneme.remove("F");
            System.out.println(deneme);

            // sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
            // ArrayList’i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.
            Collections.sort(deneme);
            System.out.println(deneme);

            //contains() methodu kullanarak, L’nin list'de var olduğunu ve
            // M’nin list'de var olmadigini dogrulayiniz.
            System.out.println("L harfi listemizde var mi: " + deneme.contains("L"));
            System.out.println("M harfi listemizde var mi: " + deneme.contains("M"));

            //size() methodu kullanarak, list’in kac eleman oldugunu ekrana yazdiriniz.
            System.out.println("Bizim listemiz " + deneme.size() + " elemanlidir.");

            // clear() methodu kullanarak, list’deki tum elemanlari siliniz.
            //isEmpty() methodu kullanarak, list’deki tum elemanlarin silindiğini dogrulayiniz
            System.out.println("Listemiz bos mu :" + deneme.isEmpty());
            deneme.clear();
            System.out.println("Listemiz bos mu :" + deneme.isEmpty());
        }
    }


