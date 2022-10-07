package Projeler;

public class Boom {public static void main(String[] args) {

   /*     "Integer sayılardan oluşan bir diziyi parametre olarak alan  ve
           dizide 7 rakamı  var ise  "Boom!" ifadesini; aksi takdirde  "dizide 7 rakamı yok"
           ifadesini döndüren bir method oluşturun".
                Örnek çıktı:
                [1, 2, 3, 4, 5, 6, 7])➞ "Boom!"
                [8, 6, 33, 100] ➞ "dizide 7 rakamı yok"
                [2, 55, 60, 97, 86] ➞ "Boom!"
*/
    int[] arr = {35,23,14,56,1,17,10,26,99};

    String boom = boomKarsiyaka(arr);
    System.out.println(boom);
}

    public static String boomKarsiyaka(int[] arr) {
        String kontrol ="";
        String geriDonen;
        boolean sonuc = false;

        for (int each : arr) {
            kontrol=each+"";
            if (kontrol.contains("7")){
                sonuc=true;
            }
        }
        //  if (sonuc){
        //      geriDonen="Boom!";
        //  }else {
        //      geriDonen= "dizide 7 rakamı yok";
        //  }

        geriDonen=sonuc? "Boom!": "Dizide 7 rakami yok" ;

        return geriDonen;


    }


}

