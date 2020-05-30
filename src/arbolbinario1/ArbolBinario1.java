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
public class ArbolBinario1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo raiz = new Nodo("+");
        Nodo subIzq = new Nodo("*");
        Nodo subDer = new Nodo("/");
        
        subIzq.setIzquierdo(new Nodo("a"));
        subIzq.setDerecho(new Nodo("b"));
        
        subDer.setIzquierdo(new Nodo("c"));
        subDer.setDerecho(new Nodo("d"));
        
        raiz.setIzquierdo(subIzq);
        raiz.setDerecho(subDer);
        
        inorden(raiz);
        System.out.println("\nNúmero de nodos de este árbol: " + numNodos(raiz));
        
    }
    
    // Recorrido preorden
    public static void preorden(Nodo r) {
        if (r != null) {
            System.out.print(r.getDato() + " ");
            preorden(r.getIzquierdo());
            preorden(r.getDerecho());
        }
    }
    // Recorrido en orden (inorden)
    public static void inorden(Nodo r) {
        if (r != null) {
            inorden(r.getIzquierdo());
            System.out.print(r.getDato() + " ");
            inorden(r.getDerecho());
        }
    }
    // Recorrido postorden
    public static void postorden(Nodo r) {
        if (r != null) {
            postorden(r.getIzquierdo());
            postorden(r.getDerecho());
            System.out.print(r.getDato() + " ");
        }
    }
    
    
    public static int numNodos(Nodo r) {
        if (r == null)
            return 0;
        else
            return 1 + numNodos(r.getIzquierdo()) + numNodos(r.getDerecho());
    }
    
}
