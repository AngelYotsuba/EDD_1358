package com.mycompany.laberinto;

public class Laberinto {

    public static void main(String[] args) {
        
        Pila lista = new Pila();
        
        lista.push(10);
        lista.push(20);
        lista.push(30);
        lista.getLength();
        lista.transversal();
        lista.peek();
        lista.pop();
        lista.transversal();
        lista.peek();
        System.out.println("El tamaño de la pila es de: " + lista.getLength() + " elementos");
    }
}
