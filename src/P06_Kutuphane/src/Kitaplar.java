package P06_Kutuphane.src;

import java.util.HashMap;
import java.util.Map;

public class Kitaplar {

    public static Map<Integer,String> kitaplar(){
        Map<Integer,String> kitapList = new HashMap<>();
        kitapList.put(1001,"Da Vinci Sifresi, Dan Brown, Roman, 160");
        kitapList.put(1002,"Melekler ve Seytanlar, Dan Brown, Roman, 160");
        kitapList.put(1003,"Cehennem, Dan Brown, Roman, 155");
        kitapList.put(1004,"Kayip Sembol, Dan Brown, Roman, 150");
        kitapList.put(1005,"Baslangic, Dan Brown, Roman, 220");
        kitapList.put(1006,"Dijital Kale, Dan Brown, Roman, 160");
        kitapList.put(1007,"Ihanet Noktasi, Dan Brown, Roman, 180,");
        kitapList.put(1009,"Seker Portakali, Vasconcelos, Klasik, 95");
        kitapList.put(1010,"Simyaci, Paulo Coelho, Roman, 160");
        kitapList.put(1011,"Hayvan Cifligi, George Orwell, Klasik, 90");
        kitapList.put(1012,"Kurk Mantolu Madonna, Dan Brown, Klasik, 55");
        kitapList.put(1013,"Savasci, Dogan Cuceloglu, Egitim, 105");
        kitapList.put(1014,"Ogretmen olmak, Dogan Cuceloglu, Egitim, 112");
        kitapList.put(1015,"Evlenmeden Once, Dogan Cuceloglu, Egitim, 38");
        kitapList.put(1016,"Var Misin?, Dogan Cuceloglu, Egitim, 101");
        kitapList.put(1017,"Uzaya Giden Tren, Mert Karik, Cocuk, 75");
        kitapList.put(1018,"Benim Zurefam Ucabilir, MertArik, Cocuk, 45");
        kitapList.put(1019,"Yaz Tatili, Varol Yasaroglu, Cocuk, 67");
        kitapList.put(1020,"Bilim Cocuk, Tubitak, Dergi, 78");
        kitapList.put(1022,"PC Net, Net yayin, Dergi, 78");
        kitapList.put(1023,"Bilimci, Tubitak, Dergi, 87");

        return kitapList ;
    }
}
