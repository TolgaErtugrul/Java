/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev1;
import java.util.Scanner;
/**
 *
 * @author tolgaErtugrul
 */
public class Odev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Kullanıcıdan 2 tane 3 basamaklı pozitif tam sayı al.
        //2. sayi1'in mod 10 değerini birler basamağı değerine ata.
        //3. sayi1'i 10'a böl sayi1'e ata.
        //4. sayi1'in yeni değerinin mod 10 değerini onlar basamağı değerine ata.
        //5. sayi1'i 10'a böl sayi1'e ata.
        //6. sayi1'in yeni değerinin mod 10 değerini yuzler basamağı değerine ata.
        //7. toplam1 değerine birler, onlar ve yuzler değerlerini toplayarak ata. 
        //8. 2. işlemden 7. işleme kadar olan bölümü sayi2 için yap.
        //9. toplam1, toplam2 ve toplam1 ile toplam2'nin toplamlarını yaz.
        
        Scanner scan= new Scanner(System.in);
       
        int sayi1birler, sayi1onlar, sayi1yuzler, sayi2birler, sayi2onlar, sayi2yuzler;
        
        System.out.print("Birinci sayıyı girin: ");
        int sayi1= scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2= scan.nextInt();
        
        //1. sayının rakamlarının toplama işlemi
        sayi1birler =sayi1%10;
        sayi1 /=10;
        sayi1onlar = sayi1%10;
        sayi1 /=10;
        sayi1yuzler = sayi1%10;
        int toplam1= sayi1birler+sayi1onlar+sayi1yuzler;
        
        //2. sayının rakamlarının toplama işlemi
        sayi2birler=sayi2%10;
        sayi2 /=10;
        sayi2onlar=sayi2%10;
        sayi2 /=10;
        sayi2yuzler=sayi2%10;
        int toplam2= sayi2birler+sayi2onlar+sayi2yuzler;
        
        System.out.println("Girilen birinci sayının rakamları toplamı: "+ toplam1);
        System.out.println("Girilen ikinci sayının rakamları toplamı: "+ toplam2);
        System.out.println("Her iki sayının rakamları toplamının toplamı: "+ (toplam1+toplam2));
    }
    
}
