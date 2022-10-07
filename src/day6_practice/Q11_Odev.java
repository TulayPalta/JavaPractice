package day6_practice;

import java.util.Scanner;

public class Q11_Odev {

    // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    public static void main(String[] args) {
        String pin="mehmet.1234";
        int girisHakki=3;

        Scanner scan=new Scanner(System.in);
        System.out.println("*********Hoşgeldiniz*********");

        while (true) {
            System.out.println("pin kodunuzu giriniz : ");
            String girilenPin=scan.nextLine();
            if(pin.equals(girilenPin)) {
                System.out.println("başarılı giriş yaptınız");
                break;
            } else {
                System.out.println("yanlış giriş yaptınız.. ");
                girisHakki--;
                System.out.println("kalan giriş hakkınız : " + girisHakki);
            }
            if (girisHakki==0) {
                System.out.println("Giriş hakkınız kalmadı.. bloklandınız..");
                break;
            }
        }


    }
}
