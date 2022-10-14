package com.mycompany.laberinto;

public class Pila<T> {
    
    private int length;
    private NodoDoble<T> tope;

    public void Pila(int length, NodoDoble<T> head){
        this.tope = tope;
        this.length = 0;
    }
    
    public boolean isEmpty(){
        return this.tope == null;
    }
    
    public int getLength(){
        return this.length;
    }
    
    public void pop(){
        if (isEmpty()){
            System.out.println("La pila esta vacia...");
        }else{
            NodoDoble nuevo = this.tope;
            int tamaño = 0;
            while (nuevo.getSiguiente() != null) {
                nuevo = nuevo.getSiguiente();
                tamaño++;
            }
            NodoDoble aux = this.tope;
            for (int contador = 1; contador <= tamaño - 1; contador++) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
            aux.setAnterior(aux);
            aux = null;
            nuevo = null;
            this.length--;
        }
    }
    
    public void peek(){
        if (this.isEmpty()) {
            System.out.print("La pila esta vacia.");
        } else {
            NodoDoble aux = this.tope;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            System.out.print("El ultimo dato de la pila es: " + aux);
            System.out.println("");
        }
    }
    
    public void push(T dato){
        NodoDoble aux = new NodoDoble(dato);
        if(this.isEmpty()){
            this.tope = aux;
        }else{
            NodoDoble aux2 = this.tope;
            while(aux2.getSiguiente() != null){
                aux2 = aux2.getSiguiente();
            }
            aux2.setSiguiente(aux);
        }
        this.length++;
    }
    
    public void transversal() {
        NodoDoble nuevo = this.tope;
        while (nuevo != null) {
            System.out.print(nuevo);
            nuevo = nuevo.getSiguiente();
            System.out.println("");
        }
        System.out.println("");
    }
}
