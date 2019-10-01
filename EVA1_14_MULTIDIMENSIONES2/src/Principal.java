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
        int nibba[][] = new int [2][3];
        int mynibba[][];
        mynibba = new int [3][];
        mynibba [0] = new int [10];
        mynibba [1] = new int [100];
        mynibba [2] = new int [24];
        for (int i = 0; i < mynibba.length; i++) {
            for (int j = 0; j < mynibba[i].length; j++) {
                mynibba[i][j] = (int)(Math.random()*100)+1;
            }
        }
        for (int i = 0; i < mynibba.length; i++) {
            for (int j = 0; j < mynibba[i].length; j++) {
                System.out.print("[" + mynibba[i][j] + "]");
            }
            System.out.println("");
    }
    
}
}
