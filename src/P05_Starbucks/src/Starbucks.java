package P05_Starbucks.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {
    static List<String> menu = new ArrayList<>();
    static List<Integer> menuNo = new ArrayList<>();
    static List<Integer> fiyat = new ArrayList<>();

    static int menuSecim;

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("  *WELCOME STARBUCKS*");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        menu();

        Scanner scan = new Scanner(System.in);

        while (true) {
            menuSecim = scan.nextInt();

            switch (menuSecim) {
                case 1:
                    Kafe kahve1 = new Kafe();
                    break;
                case 2:
                    Kafe kahve2 = new Kafe();
                    break;
                case 3:
                    Kafe kahve3 = new Kafe();
                    break;
                default: {
                    System.out.println("Lutfen kahve seciniz.");
                }
            }
            Odeme.Hesap();
            System.out.println("...iyi gunler dileriz...");
            break;

        }


    }

    public static void menu() {

        menu.add("TURK KAHVESI");
        menu.add("FILTRE KAHVE");
        menu.add("EXPRESSO");

        menuNo.add(1);
        menuNo.add(2);
        menuNo.add(3);

        fiyat.add(30);
        fiyat.add(45);
        fiyat.add(60);

        System.out.println("----------- MENUMUZ -----------");
        System.out.println("_______________________________");
        System.out.println("NO       TUR              FIYAT");
        System.out.println("-------------------------------");
        for (int i = 0; i < menu.size(); i++) {
            System.out.printf("%-2s    %-12s         %d TL\n", menuNo.get(i), menu.get(i), fiyat.get(i));
        }
        System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
        System.out.println("Lutfen secim yapiniz...");


    }
}
