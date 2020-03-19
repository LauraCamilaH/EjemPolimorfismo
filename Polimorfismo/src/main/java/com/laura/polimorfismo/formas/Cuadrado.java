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
public class Cuadrado extends Forma {

    private final double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;

    }

    @Override
    public double calcularArea() {
     return lado*lado;   
    }
}
