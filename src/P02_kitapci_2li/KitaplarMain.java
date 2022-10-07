package P02_kitapci_2li;

import java.util.Scanner;

public class KitaplarMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Kitaplar kitap=new Kitaplar();

		System.out.println("\n ****** Grup1 Kitapci Projemize Hosgeldiniz *****");
		int secim= 0;
		while(secim!=6){
			secim=menu();
			switch(secim){
				case 1:kitap.kitapEkle(); break;
				case 2:kitap.numaraIleListele(); break;
				case 3:kitap.bilgiIleListele(); break;
				case 4:kitap.noIleSil(); break;
				case 5:kitap.Listele(); break;
				case 6:System.out.println("islemleriniz bitti");
				default: if(secim>6 || secim<1){
					System.out.println("Lutfen dogru bir secim yaptginizdan emin olunuz");
				}
			}
		}
	}

	public static int menu() {
		Scanner scan=new Scanner(System.in);
		System.out.println("\n1-kitap ekle\n" +
				"2-numara ile kitap goruntule\n" +
				"3-bilgi ile kitap goruntule\n" +
				"4-numara ile kitap sil\n" +
				"5-tum kitaplari listele\n" +
				"6-cikis\n" + "Lutfen yapmak istediginiz islemi seciniz");

		int secim=scan.nextInt();
		return secim;
	}

}

