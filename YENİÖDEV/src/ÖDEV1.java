/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
import java.util.Scanner;
public class ÖDEV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayı=1234;
        int tersi=0; 
        int yedek=sayı;
        for(;sayı!=0;sayı=sayı/10){
            int basamak=sayı%10;
            tersi=tersi*10+basamak;
    }
        System.out.println("Sayıyı yazdır: "+yedek);
        System.out.println("Tersini yazdır: "+tersi);
    
}
}