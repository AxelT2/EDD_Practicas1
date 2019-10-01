
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner spider = new Scanner(System.in);
        int x = 0;
        
        System.out.println("How many, fucker?");
        x = spider.nextInt();
        bruh[] edades = new bruh[x];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = new bruh();
            System.out.println("Get your age on nibba");
            edades[i].bruh = spider.nextInt();
        }
        
       Impri(edades);
    }
    
    public static void Impri(bruh[] args){
       for (int i = 0; i < args.length; i++) {
            System.out.println("Ages: " + args[i].bruh);
        }
       
       }
}
class bruh{
    int bruh;
}