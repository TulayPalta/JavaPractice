import java.util.Scanner;
class Main {
  public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int sayi=scan.nextInt();
int toplam=0;
    for(int i=1;i<sayi;i++){
      if(sayi%i==0){
        toplam+=i;
      }
    }
    if(sayi==toplam){
      System.out.println(sayi+" Mukemmel Sayidir.");
    }else
    {System.out.println(sayi+" Mukemmel Sayidir degildir."); }

  }
}