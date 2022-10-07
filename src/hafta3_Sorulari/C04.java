package hafta3_Sorulari;

import java.util.ArrayList;
import java.util.List;

public class C04 {
    public static void main(String[] args) {
        /* 2-) A number is called an Armstrong number if it equals the sum of the cube of
        its every digit. For example, 153 is an Armstrong number because of
        153= 1 + 125 + 27, which equals the cube of every digit.
        Type a code to check if the given number is the Armstrong number or not.
         */

        int num=37;
        int numLenght=(num+"").length();
        int toplam=0;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i<numLenght; i++){
            list.add(i,(int)(num/Math.pow(10,i))%10);
            toplam+=Math.pow(list.get(i),3);
        }
        System.out.println(toplam==num? "Sayiniz Amstrong bir sayidir":"Sayiniz Amstrong bir sayi değildir");

    }

}
