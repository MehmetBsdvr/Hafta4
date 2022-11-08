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
public class ÖDEV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        int fx, x ;
        System.out.print("Klavyeden bir x değeri giriniz: ");
        x = input.nextInt();
        fx = (int) (Math.pow(x,2)-5*x+3);
        System.out.println("f(x)=x^2-5*x+3");

        if (fx<0){
            System.out.println("f(x)<0");
        } 
        else if (fx>0){
            System.out.println("f(x)>0");
        }
        else
            System.out.println("f(x)=0");
    }
    }
    

