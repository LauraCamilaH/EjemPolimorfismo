/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Laura
 */
public class Polimorfismo {

    public static final boolean GATO = true;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Animal animal;

        if (GATO) {
            animal = new Gato("Michi");
        } else {
            animal = new Perro("Paco");
        }
        animal.saludar();

        // TODO code application logic here
    }

}
