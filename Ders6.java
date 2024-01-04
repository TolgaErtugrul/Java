/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders6;

/**
 *
 * @author tolga
 */
public class Ders6 {

    /**
     * @param args the command line arguments
     */
    static void altSatıraGec(){
        System.out.println();
    }
    
    static void cizgiciz(int m){
        for(int i =1; i<=m; i++)
            System.out.print("-");
        altSatıraGec();
    }
    
    public static long faktoryel(int n){
        long sonuc=1;
        for(int i=1; i<=n; i++)
            sonuc *=i;
        return sonuc;
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        long ftl;
        cizgiciz(9);
        ftl = faktoryel(7);
        System.out.println("7!= "+ ftl);
        cizgiciz(9);
        System.out.println();
        
        cizgiciz(21);
        System.out.println("17! = "+ faktoryel(17));
        cizgiciz(21);
    }
    
}
