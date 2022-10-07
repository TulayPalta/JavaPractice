package denemeCalisma;

import java.util.Arrays;

public class C11 {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("FizzBuzz yapilacak sayiyi giriniz  :");
        int sayi = scan.nextInt();


        */
            // System.out.println(Arrays.toString.(sonuc1));
            int[] sonuc ={8,9,10,11,12,13,14,15};
            String[] sonuc1=new String [sonuc.length];

            for (int i = 0; i <sonuc.length; i++) {

                if (sonuc[i] % 3 == 0 && sonuc[i] % 5 == 0)
                    sonuc1[i] = "FizzBuzz";
                else if (sonuc[i] % 3 == 0)
                    sonuc1[i] = "Fizz";
                else if (sonuc[i] % 5 == 0)
                    sonuc1[i] = "Buzz";
                else
                    sonuc1[i] = "" + (i +8);  //     [8,9,10,11,12,13,14,27]
            }
            System.out.println(Arrays.toString(sonuc1));}


    }

