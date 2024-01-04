/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders8;

/**
 *
 * @author tolga
 */
public class Ders8 {

    /**
     * @param args the command line arguments
     */
    //diziler özel tip nesnelerdir. Biz a'mızı değişmiş olarak buluruz.
    //işlevlere parametre olarak diziyi geçirdiğimizde nesne kuralları geçerlidir.
    static void artir(int[] dizi, int ekle){
        for(int i=0; i<dizi.length; i++) dizi[i] += ekle;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Diziyi oluşturup, değerler sonradan atıyorsun.
        //int[] a = new int[4];
        //a[0]=13;
        //a[1]=78;
        //a[2]=a[1]+21;
        //a[3]=-8;
        
        //değerleri dizi oluştururken en başta atıyorsun.
        //int[] a = {13, 78, 21, -8};
        
        //bütün elemanlara 100 ekleyip, yazdırdık.
        //for(int i=0; i<4; i++) a[i] +=100;
        
        //foreach ile 100 ekleyemeyiz.
        //değiştirsek bile yerine geri koymuyor. for(int e:a) e+=100; işe yaramaz.
        
        //araya boşluk koydum.
        System.out.println();
        
        //artir(a,100);
        
        //int toplam=0;
        //ulaşıp dizi elemanlarında değişiklik yapmayacağim için foreach ile yapabilirim.
        //for(int e:a) toplam +=e;
        //System.out.println("\nToplam = "+toplam);
        
        //2'şer artan for döngüsü 
        //for(int i=0; i<a.length;i+=2)
        //    System.out.print(a[i]+" ");
        //foreach
        //for(int e: a)
        //    System.out.print(e+" ");
        
        ///////////////////////////////////////////////
        //2boyutlu dizi
        int[][] a={{13,78}, {21}, {-8, 67, 55}};
        
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length; j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        
        //Yukarıda oluşturulmuş artir constructorunun kullanımı
        for(int i=0; i<a.length;i++)
            artir(a[i],100);
        
        System.out.println();
        for(int [] satir:a){
            for(int e:satir)
                System.out.print(e+" ");
            System.out.println();
        }
        
        
    }
    
}
