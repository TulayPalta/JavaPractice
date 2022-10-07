package day1_practice.Proje_UcakBileti;

import java.util.ArrayList;
import java.util.List;

public class UcakBilet {
    public static void main(String[] args) {

        UcakIslemler yeniIslem= new UcakIslemler();
        List<Ucak> yolcular=new ArrayList<>();

        yeniIslem.ucretHesapla();
    }
}
