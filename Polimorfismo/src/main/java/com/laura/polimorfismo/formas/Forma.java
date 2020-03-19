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
public abstract class Forma {

    private final String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;

    }
    // getter la varibale esta privada no la puedo ver desde afuera,
    //pero quiero que si lo haga y por eso hago el getter

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();
    
    public void imprimir(){
        System.out.println("El area es: " + calcularArea());
    }

}
