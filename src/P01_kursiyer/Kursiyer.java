package P01_kursiyer;

import java.time.LocalTime;

public class Kursiyer {
    String isim;
    String kursTipi;
    LocalTime kayitZamani;
    int kayitId;

    public Kursiyer(String isim, String kursTipi, LocalTime kayitZamani, int kayitId) {
        this.isim = isim;
        this.kursTipi = kursTipi;
        this.kayitZamani = kayitZamani;
        this.kayitId = kayitId;
    }

}
