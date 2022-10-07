package P06_Kutuphane.src;

import java.util.*;

public class ReusableMethods {
    static boolean stokVarMi=true;
    static int siraSayac =1; //kitapListesiYazdir() && kitapListesindenSatinAl kullaniyor


    public static void kitapListesiYazdir() {
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
String[] kitapListArr;
String kitapListValue;
Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
             ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");
            System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);

        }

    }

    public static void kitapListesindenSatinAl() {
        System.out.println("Lutfen satin almak icin kitap no giriniz : ");
        Scanner scan = new Scanner(System.in);
        int kitapNoAl=scan.nextInt();

        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey = each.getKey();
            kitapListValue = each.getValue();
            kitapListArr = kitapListValue.split(", ");
            if (kitapNoAl==each.getKey()){
                System.out.println(kitapListArr[1]+" ==> "+kitapListArr[0]+" Kitabini "+kitapListArr[3] +" TL fiyatindan sepetinize eklendiniz");
                Sepet.sapetKitapList.add(kitapListArr[0]);
                Sepet.sapetFiyatList.add(Integer.valueOf(kitapListArr[3]));
            }


        }

    }

    public static void kitapKlasikYazdir() {
        System.out.println("Klasik Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Klasik")){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
    }




    }

    public static void kitapRomanYazdir() {
        System.out.println("Roman  Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Roman")){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }

    }

    public static void kitapHikayeYazdir() {
        System.out.println("Hikaye  Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        Integer turSayisi=0;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Hikaye")){
                turSayisi++;
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }
        if (turSayisi==0){
            stokVarMi=false;
            System.out.println("Hikaye turunde kitabimiz kalmamistir!");
        }




    }

    public static void kitapCocukYazdir() {
        System.out.println("Cocuk Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Cocuk")){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }

    }

    public static void kitapEgitimYazdir() {
        System.out.println("Egitim  Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Egitim")){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }
    }


    public static void kitapDergilerYazdir() {
        System.out.println("Dergi  Kitaplarimiz ...");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[2].equals("Dergi")){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }

    }

    public static void yazarYazdir() {
        System.out.println("***YAZARLAR***");
        Map<Integer,String> kitapList = Kitaplar.kitaplar();
        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;


       List<String> yazarList = new ArrayList<>();
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {

            kitapListKey = each.getKey();
            kitapListValue = each.getValue();
            kitapListArr = kitapListValue.split(", ");

            if (!yazarList.contains(kitapListArr[1])){
               yazarList.add(kitapListArr[1]);
            }
        }
        for (String eachh:yazarList
        ) {
            System.out.println(eachh);
        }


    }


    public static void yazarKitapYazdir() {
        Scanner scan = new Scanner(System.in);
        yazarYazdir();
        System.out.println("-----------------");
        System.out.println("Lutfen bir yazar adi giriniz");
        String yazarAl=scan.nextLine();

        Map<Integer,String> kitapList = Kitaplar.kitaplar();

        Set<Map.Entry<Integer,String>> kitapListEntrySet = kitapList.entrySet();
        String[] kitapListArr;
        String kitapListValue;
        Integer kitapListKey;
        for (Map.Entry<Integer,String> each:kitapListEntrySet
        ) {
            kitapListKey=each.getKey();
            kitapListValue=each.getValue();
            kitapListArr=kitapListValue.split(", ");

            if (kitapListArr[1].equalsIgnoreCase(yazarAl)){
                System.out.println("Kitap No : "+kitapListKey+" Kitap adi : "+kitapListArr[0]+" Yazar adi :"+ kitapListArr[1]+" Kitap turu : "+kitapListArr[2]+" Fiyat : "+kitapListArr[3]);
            }
        }


    }


}
