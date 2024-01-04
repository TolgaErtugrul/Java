/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders3;
import java.util.Scanner;
/**
 *
 * @author tolga
 */
public class Ders3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        
        String ad, soyad;
        int yıl;
        
        System.out.print("Adınız: ");
        ad = oku.next();
        System.out.print("Soyadınız: ");
        soyad = oku.next();
        
        System.out.print("Doğum yılınız: ");
        yıl = oku.nextInt();
        System.out.println(ad +" "+ soyad+" " + "Yaşınız: "+ (2023-yıl));
        
        
    }
    
}
