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
        Prueba[] array = new Prueba[5];
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = new Prueba();
            System.out.println(array[i]);
        }
        
        
    }
    static class Prueba{}
}
