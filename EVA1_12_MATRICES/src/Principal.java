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
        int bruh[][] = new int[3][3]; 
        for (int i = 0; i < bruh.length; i++) {
            for (int j = 0; j < bruh[i].length; j++) {
                bruh[i][j] = (int)(Math.random()*100)+1;
            }
        }
        for (int i = 0; i < bruh.length; i++) {
            for (int j = 0; j < bruh[i].length; j++) {
                System.out.print("[" + bruh[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
