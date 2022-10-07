package P06_Kutuphane.src;

import java.util.Scanner;

public class MainMenu {


    public static void karsilama() {
        System.out.println("^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-");
        System.out.println("-------DEDELER***BOOKSTORE------");
        System.out.println("................................");



    }

    public static void anaMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1 -->  Tum Kitap Listesi");
        System.out.println("2 -->  Klasik Kitaplar");
        System.out.println("3 -->  Romanlar");
        System.out.println("4 -->  Hikayeler");
        System.out.println("5 -->  Cocuk kitaplari");
        System.out.println("6 -->  Egitim kitaplari");
        System.out.println("7 -->  Dergiler");
        System.out.println("8 -->  Yazar'in kitaplarini ara");
        System.out.println("9 -->  Sepetim");
        System.out.println("10 --> Odeme yap ");
        System.out.println("Lutfen secim yapiniz :");
        int secimMenu=scan.nextInt();

        switch (secimMenu){
            case 1 :
                ReusableMethods.kitapListesiYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 2 :
                ReusableMethods.kitapKlasikYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 3 :
                ReusableMethods.kitapRomanYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 4 :
                ReusableMethods.kitapHikayeYazdir();
                if (ReusableMethods.stokVarMi==false){
                    anaMenu();
                }else {
                    ReusableMethods.kitapListesindenSatinAl();
                }

                anaMenu();
                break;

            case 5 :
                ReusableMethods.kitapCocukYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 6 :
                ReusableMethods.kitapEgitimYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 7 :
                ReusableMethods.kitapDergilerYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 8 :
                ReusableMethods.yazarKitapYazdir();
                ReusableMethods.kitapListesindenSatinAl();
                anaMenu();
                break;

            case 9 :
                Sepet.sepet();
                break;

            case 10 :
                Sepet.odemeYap();

                break;











        }//main menu switch
    }
}