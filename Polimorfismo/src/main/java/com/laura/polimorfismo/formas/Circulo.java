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
public class Circulo extends Forma {

    double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
    return Math.PI *radio*radio;
    }

}
