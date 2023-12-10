/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odev2;
import javax.swing.*;

/**
 *
 * @author tolga ertugrul
 */
public class Odev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    /*
        Kahraman güç puanı 2, 3 veya 4 olabilir.
        Zorluk seviyesi 1 veya 2 olacaktır.
        1. zorluk seviyesi seçilirse zorluk katsayısı 0.6 ve 2 zorluk seviyesi seçilirse zorluk katsayısı 1.0 olacaktır.
        Görev, ilgili görevdeki kahramanların güç toplamının, görev zorluğu ile oyun zorluk katsayısının çarpımından büyük olması durumunda başarılı kabul edilir. Eşit olduğu durumda başarısız olacaktır.
    Başarılı durum: Görevdeki kahramanların güç toplamı > görev zorluğu * oyun zorluk katsayısı
    1. görevde sadece 1. kahraman olacaktır. Diğer görevlerde bütün kahramanlar olacaktır.
    Görev zorlukları sırasıyla 3, 6 ve 10 olacaktır.
    Çıktı aşağıdaki şekilde olacaktır:
    Görev 1: BAŞARILI/BAŞARISIZ
    Görev 2: BAŞARILI/BAŞARISIZ
    Görev 3: BAŞARILI/BAŞARISIZ
    Hatalı girdi durumları ele alınmayacaktır. 
    Kahraman Bilgileri:

    Kahraman 1 Güç Puanı: [2 ile 4 arasında bir sayı]
    Kahraman 2 Güç Puanı: [2 ile 4 arasında bir sayı]
    Zorluk Katsayıları:

    [1] Birinci Zorluk Katsayısı: 0.6
    [2] İkinci Zorluk Katsayısı: 1.0
    Görev Zorluklari:

    Görev 1: Zorluk 3
    Görev 2: Zorluk 6
    Görev 3: Zorluk 10
    */

        int kahraman1 = Integer.parseInt(JOptionPane.showInputDialog("Kahraman 1 Güç Puanı Giriniz:")) ;
        int kahraman2 = Integer.parseInt(JOptionPane.showInputDialog("Kahraman 2 Güç Puanı Giriniz:"));
        int zorlukSecim = 0;
        zorlukSecim = Integer.parseInt(JOptionPane.showInputDialog("Zorluk Seviyesi Seçiniz(1 veya 2):"));
        
        double zorlukKatsayi=0;
        if(zorlukSecim == 1)
        zorlukKatsayi = 0.6;
        
        else if(zorlukSecim == 2)
        zorlukKatsayi = 1;        
        
        int gorev1zorluk = 3;
        int gorev2zorluk = 6;
        int gorev3zorluk = 10;
        
        String result1;
        String result2;
        String result3;
        if(kahraman1+kahraman2>gorev1zorluk*zorlukKatsayi){
            result1="BAŞARILI";
        }
        else
            result1="BAŞARISIZ";
        if(kahraman1+kahraman2>gorev2zorluk*zorlukKatsayi){
            result2="BAŞARILI";
        }
        else
            result2="BAŞARISIZ";
        if(kahraman1+kahraman2>gorev3zorluk*zorlukKatsayi){
            result3="BAŞARILI";
        }
        else
            result3="BAŞARISIZ";
        
        JOptionPane.showInternalMessageDialog(null, "Görev 1: "+result1 +
                "\nGörev 2: "+result2 + 
                "\nGörev 3: "+result3);
        
    }
    
}
