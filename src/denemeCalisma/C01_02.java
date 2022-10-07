package denemeCalisma;

import java.util.Scanner;

public class C01_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir isim giriniz");
        String isim=scan.nextLine();
        System.out.println("lütfen bir karakter giriniz");
        String karakter=scan.next();
        String sonuc="";
        for (int i = 0; i <isim.length() ; i++) {
                if(karakter.equals(isim.substring(i,i+1))){
                    sonuc+=isim.substring(i,i+1);
                }
        } //Number of a = 2
        System.out.println("Number of "+karakter+" = "+sonuc.length());
    }
}
