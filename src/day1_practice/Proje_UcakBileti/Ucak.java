package day1_practice.Proje_UcakBileti;

public class Ucak {
    private String adiSoyadi, gidilecekYer, gidisDonus;
    private int yas;
    private double kmucret = 0.10;
    private double ucret, yasIndirimi, gidisDonusInd;

    public Ucak() {
    }

    public Ucak(String adiSoyadi, String gidilecekYer, String gidisDonus, int yas) {
        this.adiSoyadi = adiSoyadi;
        this.gidilecekYer = gidilecekYer;
        this.gidisDonus = gidisDonus;
        this.yas = yas;
    }

    public double getUcret() {
        switch (gidilecekYer) {
            case "B": ucret = 1500 * kmucret;break;
            case "C": ucret = 700 * kmucret;break;
            case "D": ucret = 900 * kmucret;break;
        }
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getGidilecekYer() {
        return gidilecekYer;
    }

    public void setGidilecekYer(String gidilecekYer) {
        this.gidilecekYer = gidilecekYer;
    }

    public String getGidisDonus() {
        return gidisDonus;
    }

    public void setGidisDonus(String gidisDonus) {
        this.gidisDonus = gidisDonus;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getKmucret() {
        return kmucret;
    }

    public void setKmucret(double kmucret) {
        this.kmucret = kmucret;
    }

    public double getYasIndirimi() {
        return yasIndirimi;
    }

    public void setYasIndirimi(double yasIndirimi) {
        this.yasIndirimi = yasIndirimi;
    }

    public double getGidisDonusInd() {
        return gidisDonusInd;
    }

    public void setGidisDonusInd(double gidisDonusInd) {
        this.gidisDonusInd = gidisDonusInd;
    }

    @Override
    public String toString() {
        return"\n"+
                "\nadiSoyadi= "+ adiSoyadi +
                "\ngidilecekYer= "+ gidilecekYer +
                "\ngidisDonus= " + gidisDonus +
                "\nyas= " + yas +
                "\nucret= " + ucret +
                "\nyasIndirimi= " + yasIndirimi+
                "\ngidisDonusInd= " + gidisDonusInd;
    }
}
