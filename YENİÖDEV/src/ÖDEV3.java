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
public class ÖDEV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Pay giriniz");
        int pay=input.nextInt();
        
        System.out.println("Payda giriniz");
        int payda=input.nextInt();
        
        int k=pay/payda;
        int r=0;
        System.out.println(k);
        System.out.println("Kacıncı basamgı öenmek istersiniz");
        for(int i=1;i<=k;i++){
            r=k%10;
            k=k/10;
        }
        System.out.println(r);
    }
    
}
