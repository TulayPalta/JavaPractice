package denemeCalisma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_list {
    public static void main(String[] args) {
    List<Integer> sayi = new ArrayList<>(Arrays.asList(1,8,15,85,96));
        System.out.println(sayi);
        List<String> ulkeler=new ArrayList< String >(List.of("turkiye","azerbaycan","litvanya","almanya","kanada"));
        System.out.println(ulkeler);
        ulkeler.add("turkmenistan");
        System.out.println(ulkeler);
        sayi.add(90);
        System.out.println(sayi);
        sayi.add(2,30);
        System.out.println(sayi);
        ulkeler.add(3,"norveç");
        System.out.println(ulkeler);
        List<Integer> sayilar= new ArrayList< Integer>(Arrays.asList(9,12,47,35,72,90));
        System.out.println(sayilar.size());
        System.out.println(sayilar.addAll(1,sayi));
        System.out.println(sayilar);
        System.out.println(sayilar.remove(5));
        List<Integer>  yeniList= new ArrayList< Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        List<Integer> yeniList1= new ArrayList< Integer>(yeniList.subList(4,8));
        System.out.println(yeniList1.subList(1,3));

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        List<Integer> sayi1=new ArrayList<Integer>(Arrays.asList(5,6,9,7,15,12));

    }
}
