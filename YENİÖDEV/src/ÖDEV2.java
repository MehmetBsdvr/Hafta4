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
public class ÖDEV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Dönüştürme İşlemleri\n1-mm\n2-cm\n3-dm\n4-km");

        Scanner input = new Scanner(System.in);

        System.out.print("Yapmak İstediğiniz İşlemi Giriniz: ");
        int islem = input.nextInt();

        System.out.print("Metre Cinsinden Bir Değer Giriniz: ");
        int n = input.nextInt();

        if (islem == 1) {
            int mm = n*1000;
            System.out.println(n+" m = "+mm+" mm");
        } else if (islem == 2) {
            int cm = n*100;
            System.out.println(n+" m = "+cm+" cm");
        } else if (islem == 3) {
            int dm = n*10;
            System.out.println(n+" m = "+dm+" dm");
        } else if (islem == 4) {
            int km = n/1000;
            System.out.println(n+" m = "+km+" km");
        }else
            System.out.println("Geçersiz İşlem Girdiniz...");
    }
    }
    

