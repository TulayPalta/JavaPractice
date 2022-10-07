package hafta6_sorulari;

public class Ogrenci {
    String adSoyad= "";
    int sinif;
    String ders;
    String dersAlimSekli;
    int ucret;

    public Ogrenci(String adSoyad, int sinif, String ders, String dersAlimSekli, int ucret) {
        this.adSoyad = adSoyad;
        this.sinif = sinif;
        this.ders = ders;
        this.dersAlimSekli = dersAlimSekli;
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return  "Ogrenci Bilgileri"+
                "\nadSoyad = " + adSoyad +
                "\nsinif = " + sinif +
                "\nders = " + ders +
                "\ndersAlimSekli = " + dersAlimSekli +
                "\nucret = " + ucret;
    }
}
