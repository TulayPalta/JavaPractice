package Replit;

import java.util.ArrayList;
import java.util.List;

public class Array_MaxSayilar {
    public static void main(String[] args) {



                int[] arr = {2, 5, -9, 45, 43, 118, 102, 102, 47, 0};
                int n = 2;
                List<Integer> list = new ArrayList<>();
                for (int each : arr) {
                    list.add(each);
                }

                List<Integer> maxList = new ArrayList<>();
                int count = 1;
                while (count <= n) {
                    int max = list.get(0);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i) > max && !(maxList.contains(list.get(i)))) {
                            max = list.get(i);
                        }
                    }
                    maxList.add(max);
                    list.remove(list.indexOf(max));
                    count++;
                }
                System.out.println(maxList.get(1));
            }
        }
