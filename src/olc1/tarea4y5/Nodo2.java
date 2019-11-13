/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc1.tarea4y5;

/**
 *
 * @author KimEd
 */
public class Nodo2 {
    
    private int suma;
    private int multiplicacion;
    private int pares;
    private int impares;

    public Nodo2() {
        this.suma = 0;
        this.multiplicacion = 0;
        this.pares = 0;
        this.impares = 0;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(int multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public int getPares() {
        return pares;
    }

    public void esPar() {
        pares++;
    }

    public int getImpares() {
        return impares;
    }

    public void esImpar() {
        impares++;
    }
    
}
