package Replit;

import java.util.Arrays;

class C01 {
    public static void main(String[] args) {

        /*(Dizideki en buyuk ikinci sayyiyi, maksimum ve minimum sayiyi
        bulmak icin bir java programi yazin)
         */

        int[] arr = {100, 10001, 10001, 10001, -90, 845, 8787, 898, 0, 1, -90};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("En buyuk 2. sayi : " +arr[arr.length - 2]);
        System.out.println("------------------*------------------");

        int counter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[arr.length - 1] == arr[arr.length - (i + 1)]) {
                counter++;
            }
        }
        System.out.println("counter: " + counter);
        System.out.println("En kucuk sayi : " + arr[0]);
        System.out.println("En buyuk sayi : " + arr[arr.length - 1]);
        System.out.println("En buyuk 2. sayi : " + arr[arr.length - counter - 2]);


    }
}