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
        int datos[];
        datos = new int [10];
        int copia[] = new int [10];
     
        for(int i = 0; i < datos.length; i++){
        datos[i] = (int)(Math.random()*100)+1;
        }
        System.out.println("DATOS ORIGINALES");
        for(int i = 0; i < datos.length; i++){
            System.out.print("["+ datos[i]+"]");
        }
        System.out.println(datos);
        copia = datos;
        System.out.println("\nDATOS COPIADOS");
        for(int i = 0; i < copia.length; i++){
            System.out.print("["+ copia[i]+"]");
        }
        System.out.println(copia);
    }
    
}
