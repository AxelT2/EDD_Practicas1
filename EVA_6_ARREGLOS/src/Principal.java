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
        //DECLARACION
      int datos[], a, b;
      int[] datos2, x, y;
      
      int copia[];
      datos = new int [100];
      for(int i = 0; i < datos.length; i++){
      datos[i] = (int)(Math.random()*100)+1;
      }
        System.out.println(datos);
        
      //SON OBJETOS
      //LA MEMORIA ES CONSECUTIVA
      //SON ACCESO ALEATORIO
      datos[4] = 5000;
      datos[69] = 700;
      //SON MUY RÁPIDOS
      //SON INMUTABLES (RECÁLQUESE EL "INMUTABLES")
    }
    
}
