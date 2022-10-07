package day1_practice.Proje_UcakBileti;

import java.util.ArrayList;
import java.util.List;

public class UcakIslemler {

    Ucak yolcu1 = new Ucak("Fatma Cimen", "B", "GD", 23);
    Ucak yolcu2 = new Ucak("Sumeyye Guler", "C", "GD", 10);
    Ucak yolcu3 = new Ucak("Tulay Palta", "D", "GD", 28);

    List<Ucak> yolcuListesi=new ArrayList<>();

    public void ucretHesapla(){
        yolcuListesi.add(yolcu1);
        yolcuListesi.add(yolcu2);
        yolcuListesi.add(yolcu3);

        double indirimYas=0;
        double indirimYon=0;
        for (Ucak each: yolcuListesi){
            if(each.getYas()<12){
                indirimYas=each.getUcret()*0.5;
                each.setYasIndirimi(indirimYas);
            } else if(each.getYas()>=12 && (each.getYas()<=24)){
                indirimYas=each.getUcret()*0.1;
                each.setYasIndirimi(indirimYas);
            } else if(each.getYas()>65){
                indirimYas=each.getUcret()*0.3;
                each.setYasIndirimi(indirimYas);
            } each.setUcret(each.getUcret()-indirimYas);

            if(each.getGidisDonus().equals("GD")){
                indirimYon=(each.getUcret()-indirimYas)*0.2*2;
                each.setGidisDonusInd(indirimYon);
                each.setUcret((each.getUcret()-indirimYas-indirimYon/2)*2);
            } System.out.println(each);
            indirimYas=0;
            indirimYon=0;
      }
    }

}
