package com.mycompany.queue;

public class MainQueue {

    public static void main(String[] args) {
        
        Queue<Integer> cola = new Queue<>();
        
        cola.agregarCola(5);
        cola.agregarCola(50);
        cola.agregarCola(500);
        cola.agregarCola(5000);
        cola.agregarCola(50000);
        cola.agregarCola(500000);
        
        System.out.println(cola);
        System.out.println("Tamaño: " + cola.getTam());
        
        cola.quitarCola();
        cola.agregarCola(5);
        
        System.out.println(cola);
        
        cola.quitarCola();
        cola.quitarCola();
        cola.quitarCola();
        
        System.out.println(cola);
        System.out.println("Tamaño: " + cola.getTam());
    }
    
}
