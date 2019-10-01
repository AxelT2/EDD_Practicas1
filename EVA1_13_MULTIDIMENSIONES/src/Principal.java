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
        int bruhbruh[][][][][] = new int [20][20][15][8][5];
        for (int i = 0; i < bruhbruh.length; i++) {
            for (int j = 0; j < bruhbruh[i].length; j++) {
                for (int k = 0; k < bruhbruh[i][j].length; k++) {  
                    for (int t = 0; t < bruhbruh[i][j][k].length; t++) {
                        for (int l = 0; l < bruhbruh[i][j][k][t].length; l++) {
                            bruhbruh[i][j][k][t][l] = (int)(Math.random()*100)+1;
                        }
                      
                }
                }
                
            }
        }for (int i = 0; i < bruhbruh.length; i++) {
            for (int j = 0; j < bruhbruh[i].length; j++) {
                for (int k = 0; k < bruhbruh[i][j].length; k++) {  
                    for (int t = 0; t < bruhbruh[i][j][k].length; t++) {
                        for (int l = 0; l < bruhbruh[i][j][k][t].length; l++) {
                            System.out.print("[" + bruhbruh[i][j][k][t][l] + "]");
                        }
                        System.out.println("");
    }
    

                }
            }
        }
    }
}
