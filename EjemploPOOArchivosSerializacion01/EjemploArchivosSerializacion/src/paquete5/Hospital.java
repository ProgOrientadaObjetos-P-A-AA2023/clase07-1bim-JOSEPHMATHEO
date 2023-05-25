/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    private Ciudad ciudad;
    
    public Hospital(String nom, int num, double pr, Ciudad c){
    
        nombre = nom;
        numeroCamas = num;
        presupuesto = pr;
        ciudad = c;
          
    }

    public void establecerNombre(String nombre) {
        nombre = nombre;
    }

    public void establecerNumeroCamas(int numeroCamas) {
        numeroCamas = numeroCamas;
    }

    public void establecerPresupuesto(double presupuesto) {
        
        presupuesto = presupuesto;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        
        return presupuesto;
        
    }

    public Ciudad obtenerCiudad() {
        
        return ciudad;
        
    }
    
}