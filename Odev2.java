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
