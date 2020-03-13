/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Laura herreda clase animal
 */
public class Perro extends  Animal {
    
 
  public Perro (String nombreAnimal){
      
      /**
       * se envia el parametro recibido a la clase padre-
       */
      super(nombreAnimal);
      
  
  }
  /**
   * metodo que se implementa diferente en la clases perro
   */
  @Override
  public void saludar(){
      System.out.println("Gua soy un perro mi nombre es: " + nombreAnimal);
      
  }
    
}
