
package P03_UcakBileti;

import java.util.ArrayList;
import java.util.List;
public class UcakIslemler {
    Ucak yolcu1 = new Ucak("Ali Kaya", "B", "GD", 68);
   // Ucak yolcu2 = new Ucak("Leyla Kaya", "C", "G", 23);
    List<Ucak> yolcuListesi = new ArrayList<>();
    public void ucretHesapla() {
        yolcuListesi.add(yolcu1);
        // yolcuListesi.add(yolcu2);

        for (Ucak each : yolcuListesi) {
            if (each.getYas() < 12) {
                each.setYasIndirimi(each.getMesafeUcreti() * 0.5);
            } else if (each.getYas() >= 12 && (each.getYas() <= 24)) {
                each.setYasIndirimi(each.getMesafeUcreti() * 0.1);
            } else if (each.getYas() > 65) {
                each.setYasIndirimi(each.getMesafeUcreti() * 0.3);
            } each.setUcret(each.getMesafeUcreti() - each.getYasIndirimi());

            if (each.getGidisDonus().equals("GD")) {
                each.setGidisDonusInd(each.getUcret() * 0.2*2);
                each.setUcret(each.getUcret()*2 - each.getGidisDonusInd());
            } System.out.println(each);
        }
    }
}