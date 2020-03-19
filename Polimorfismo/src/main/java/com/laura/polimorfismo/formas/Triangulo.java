/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laura.polimorfismo.formas;

/**
 *
 * @author dell
 */
public class Triangulo extends Forma {

   private final double  altura;
   private final double base;

    public Triangulo(String nombre, double altura, double base) {
        super(nombre);
        this.altura = altura;
        this.base = base;

    }

    @Override
    public double calcularArea() {
        double area = base * altura / 2;
        return area;
    }

}
