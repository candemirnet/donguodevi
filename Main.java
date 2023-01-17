import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int i, sayi,toplam=0, sayac=0, ortalama;
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = imp.nextInt();

        for(i = 0; i<=sayi; i++){
            if(i % 12 ==0){
                toplam += i;
                sayac ++;
            }
        }
        ortalama = toplam / sayac;
        System.out.println("3 ve 4 e kalansız bölünenlerin ortalaması: " + ortalama);

    }
}