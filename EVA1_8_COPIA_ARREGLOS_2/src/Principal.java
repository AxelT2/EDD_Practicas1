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
        int copia[];
        copia = new int [10];
        
        for(int i = 0; i < datos.length; i++){
        datos[i] = (int)(Math.random()*100)+1;
        copia[i] = datos[i];
        }
        
      imprimirArreglo(datos);  
      imprimirArreglo(copia);
        System.out.println(datos);
        System.out.println(copia);
        
    }
    public static void imprimirArreglo(int[] args){
        System.out.println("");
    for(int i = 0; i < args.length; i++){
            System.out.print("["+ args[i]+"]");
        }
        System.out.println("");
    }
    
}
