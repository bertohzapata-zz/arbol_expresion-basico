/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario1;

/**
 *
 * @author bertohzapata
 */
public class Nodo {
    private Object dato;
    private Nodo izquierdo;
    private Nodo derecho;
    
    // Nodo hoja
    public Nodo (Object dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
    
    // Nodo completo
    public Nodo (Nodo izq, Object dato, Nodo der) {
        this.dato = dato;
        this.izquierdo = izq;
        this.derecho = der;
    }
    
    // Setters and Getters
    public Object getDato() {
        return this.dato;
    }
    public void setDato (Object valor) {
        this.dato = valor;
    }
    
    public Nodo getIzquierdo() {
        return this.izquierdo;
    }
    public void setIzquierdo (Nodo izq) {
        this.izquierdo = izq;
    }
    
    public Nodo gerDerecho() {
        return this.derecho;
    }
    public void setDerecho (Nodo der) {
        this.derecho = der;
    }
    
    
}
