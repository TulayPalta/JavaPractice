package P05_Starbucks.src;

public class Odeme {
    static int toplamTutar;
    static int sut=10;
    static int seker=2;
    static int boyut=15;
    public static void Hesap(){

        for (int i = 0; i < Starbucks.menu.size(); i++) {

            if (Starbucks.menuSecim==Starbucks.menuNo.get(i)){
                toplamTutar+=Starbucks.fiyat.get(i);
            }
            if (Kafe.sekerMi==true){
                toplamTutar+=seker;
            }
            if (Kafe.ebat.equalsIgnoreCase("Buyuk Boy")){
                toplamTutar+=45;
            }
            if (Kafe.ebat.equalsIgnoreCase("Orta Boy")){
                toplamTutar+=30;
            }
            if (Kafe.ebat.equalsIgnoreCase("Kucuk Boy")){
                toplamTutar+=15;
            }

        }

        System.out.println("Odemeniz gereken tutar : "+toplamTutar);

    }
}
