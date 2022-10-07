package P02_kitapci_2li;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitaplar {
	int kitapNo = 1000;
	String kitapAdi, yazarAdi;
	double kitapFiyati;
	static Scanner scan = new Scanner(System.in);
	List<Kitaplar> kitapListesi = new ArrayList<>();

	public Kitaplar() {
	}
	public Kitaplar(int kitapNo, String kitapAdi, String yazarAdi, double kitapFiyati) {
		this.kitapNo = kitapNo;
		this.kitapAdi = kitapAdi;
		this.yazarAdi = yazarAdi;
		this.kitapFiyati = kitapFiyati;
	}

	public void kitapEkle() {
		System.out.println("Lutfen kitabin adini giriniz: ");
		kitapAdi = scan.nextLine();
		kitapNo++;
		System.out.println("Lutfen yazar adini giriniz: ");
		yazarAdi = scan.nextLine();
		System.out.println("Lutfen kitabin fiyatini giriniz: ");
		kitapFiyati = scan.nextInt();
		scan.nextLine();
		Kitaplar eklenecekler = new Kitaplar(kitapNo, kitapAdi, yazarAdi, kitapFiyati);
		kitapListesi.add(eklenecekler);
		System.out.println("Kitabiniz listeye eklendi.");
	}

	public void numaraIleListele() {
		System.out.println("Lutfen listelenmesini istediginiz kitap numarasini giriniz: ");
		int musNo = scan.nextInt();
		int temp=0;
		for (Kitaplar each : kitapListesi) {
			if (each.kitapNo == musNo) {
			System.out.print(each);
				temp=1; break;
			}
		} if( temp==0){
			System.out.println("Aradiginiz kriterlerde bir kitap bulunamadi.");
		}
	}

	public void bilgiIleListele() {
		System.out.println("Lutfen listelenmesini istediginiz kitabin adini ya da yazarini giriniz");
		String kitapBilgi = scan.nextLine();
		int temp=0;
		for(Kitaplar each: kitapListesi){
			if( each.kitapAdi.equals(kitapBilgi) || each.yazarAdi.equals(kitapBilgi) ){
				System.out.println(each);
				temp=1;
			}
		} if( temp==0){
			System.out.println("Aradiginiz kriterlerde bir kitap bulunamadi.");
		}
	}

	public void noIleSil(){
		System.out.println("Lutfen silmek istediginiz kitabin numarasini giriniz.");
		int silNo= scan.nextInt();
		for (Kitaplar each: kitapListesi){
			if(each.kitapNo==silNo){
				System.out.println(each+ "Silinmesini istediginiz kitap silindi.");
				kitapListesi.remove(each); break;
			}
		}
	}

	public void Listele() {
		System.out.println("\n");
		if (kitapListesi.isEmpty()) {
			System.out.println("Listelenecek kitap yok.");
		} else {
			for (Kitaplar each : kitapListesi) {
				System.out.println(each);
			}
		}
	}

	@Override
	public String toString() {
		return "\nKitap Adi :\t" + kitapAdi + "\nYazar Adi :\t" + yazarAdi + "\nFiyat :\t\t" + kitapFiyati
				+ "\nKitap No :\t" + kitapNo;
	}

}
