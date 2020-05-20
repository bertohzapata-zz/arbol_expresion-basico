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
        // TODO code application logic here

        Nodo subIzq = new Nodo("+");
        Nodo subDer = new Nodo("-");
        
        subIzq.setIzquierdo(new Nodo("X"));
        subIzq.setDerecho(new Nodo("Y"));
        
        subDer.setIzquierdo(new Nodo("A"));
        subDer.setDerecho(new Nodo("B"));
        
        Nodo raiz = new Nodo(subIzq, "*", subDer);
        
        preOrden(raiz);
        
    }
    
    
    
    
    
    
    private static void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " ");
            preOrden(raiz.getIzquierdo());
            preOrden(raiz.gerDerecho());
        }
    }
    
}
