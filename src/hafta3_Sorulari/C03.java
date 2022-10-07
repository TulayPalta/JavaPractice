package hafta3_Sorulari;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        //kullanıcıdan alacagınız sayının rakamlarının benzersiz olup olmadıgını kontrol eden bir kod yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("tam sayı giriniz : ");
        int sayi= scan.nextInt();
        // String sayiStr=""+sayi;
        String sayiStr=String.valueOf(sayi);
        String box="";

        for (int i = 0; i <sayiStr.length() ; i++) {
            String sayiIndex=sayiStr.substring(i,i+1);
            if (sayiStr.indexOf(sayiIndex)==sayiStr.lastIndexOf(sayiIndex)){

            } box+=sayiIndex;
        }
        System.out.println(box+" ");
    }
}

