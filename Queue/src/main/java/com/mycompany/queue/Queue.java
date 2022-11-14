package com.mycompany.queue;
import java.util.ArrayList;

public class Queue<T> {
    
    private ArrayList<T> cola;
    private int tam;
    
    public Queue() {
        this.cola = new ArrayList<>();
        this.tam = tam;
    }
    
    public boolean estaVacia(){
        return cola.isEmpty();
    }
    
    public int tamano(){
        return this.tam;
    }
    
    public void agregarCola(T dato){
        cola.add(dato);
        ++tam;
    }
    
    public T quitarCola(){
        T dato;
        if (this.estaVacia()){
            dato = null;
        }else{
            dato = cola.get(0);
            cola.remove(--this.tam);
        }
        return dato;
    }

    public ArrayList<T> getCola() {
        return cola;
    }

    public void setCola(ArrayList<T> cola) {
        this.cola = cola;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }   

    @Override
    public String toString() {
        return "[ Queue--> |" + cola + "| ]";
    }
}
