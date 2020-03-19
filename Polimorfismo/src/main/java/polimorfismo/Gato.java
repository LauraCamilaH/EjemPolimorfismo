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
public class Gato extends Animal {

    public Gato(String nombreAnimal) {
        super(nombreAnimal);

    }

    @Override
    public void saludar() {
        System.out.println("Hola Soy un Gato mi nombre es:  " + nombreAnimal);
    }
}
