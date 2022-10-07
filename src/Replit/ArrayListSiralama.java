package Replit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSiralama {
    public static void main(String[] args) {
        int[] arr1={1232, 1134,2345,1022};
        List<Integer> liste=new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            liste.add(arr1[i]);
        }
        Collections.sort(liste);
        System.out.println(liste);

        String[] arr2={"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        List<String> liste2=new ArrayList<String>();

        for(int i=0; i<arr2.length; i++){
            liste2.add(arr2[i]);
        }
        Collections.sort(liste2);
        System.out.println(liste2);

    }
}