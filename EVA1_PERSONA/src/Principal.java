
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
       Persona[] Persons = new Persona[10];
       Scanner spider = new Scanner(System.in);
        for (int i = 0; i < Persons.length; i++) {
            Persons[i] = new Persona();
            System.out.println("Nigga get your name on");
            Persons[i].Nombre =spider.nextLine();
        }
        imprimir(Persons);
        Persona[] copias = new Persona[Persons.length];
    }
    public static void imprimir(Persona[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println("nombre: " + args[i].Nombre);
        }
    
    }
}
class Persona{
    String Nombre;
}

