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
        int datillos[][] = new int [3][4];
        System.out.println("Dirección del arreglo: " +  datillos);
        System.out.println("Tamaño del arreglo: " + datillos.length);
        
        System.out.println("Dirección del arreglo[0]: " +  datillos[0]);
        System.out.println("Tamaño del arreglo[0]: " + datillos[0].length);
        
        System.out.println("Valor de la posición datillos[0][0]: " +  datillos[0][0]);
        //System.out.println("Tamaño del arreglo[0][0]: " + datillos[0][0].length); ESTOS YA NO SON ARREGLOS SON ENTEROS
    }
    
}
