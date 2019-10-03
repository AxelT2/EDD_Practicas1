
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
        // TODO code application logic here
        Scanner spider = new Scanner(System.in);
        System.out.println("Ponga un número");
        int ival = spider.nextInt();
        for (int i = ival; i >= 1; i--) {
            System.out.print(i + "-");
        }
        System.out.println("");
        forFalso(ival);
        System.out.println("");
        System.out.println("Ponga un número");
        int ival2 = spider.nextInt();
        for (int i = 1; i <= ival2; i++) {
            System.out.print(i + "-");
        }
        System.out.println("");
        
    }
       
    
   public static void forFalso(int ival){
       System.out.print(ival + "-");
       if (ival > 1) {
           forFalso(ival - 1);
       }
   }
   public static void forFalso2(int ival2){
       System.out.println(ival2 + "-");
       if (0 > ival2){
           forFalso2(ival2 + 1);
       }
   }
}
