/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Laura 
 * 
 */

//clase abstracta, no podemos generar un objeto de esta clase, pero si de sus clases hijas
abstract class   Animal {
    /**
     * Variable a nivel de clase 
     */
    String nombreAnimal;
    /**
     * 
     * @param nombreAnimal nombre del animal a crearlo
     */
    
    //constructor de la clase Animal ( recibe los parametros minimos para que pueda crear un obajeto)
    public Animal (String nombreAnimal){
        this.nombreAnimal = nombreAnimal;
      
    }
    //metodo que se implemeta diferete en las clases hijas
    public void saludar (){
        
     
}
    
}
