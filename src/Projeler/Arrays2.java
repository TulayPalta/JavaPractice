package Projeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays2 {
    public static void main(String[] args) {
    //  Soru 2) Verilen bir array’deki unique elementleri yeni bir array olarak
    // döndüren bir method oluşturun
    int[] arr = {1, 2, 3, 5, 6, 4, 6, 2, 8, 9, 1, 6, 4, 5, 10, 1, 11, 10, 42};
    int[] newArr = new int[1];

    newArr = uniqueBul(arr);

    System.out.println(java.util.Arrays.toString(arr));
    System.out.println(Arrays.toString(newArr));
}

    public static int[] uniqueBul(int[] arr) {
        List<Integer> listAsil = new ArrayList<>();
        List<Integer> listUnique = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            listAsil.add(arr[i]);
            if (!listUnique.contains(arr[i])) {
                listUnique.add(arr[i]);
            }
        }
        for (int i = 0; i < listAsil.size(); i++) {
            if (listAsil.indexOf(listAsil.get(i)) != listAsil.lastIndexOf(listAsil.get(i))) {
                listUnique.remove(listAsil.get(i));
            }
        }
        int[] newArr = new int[listUnique.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = listUnique.get(i);
        }
        return newArr;
    }
}