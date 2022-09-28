package com.mycompany.listadoble;

public class ListaDobLigadaADT<T> {
    
    NodoDoble<T> head;
    int tamanio;
    
    public ListaDobLigadaADT(){
     
    }
    
    public ListaDobLigadaADT(NodoDoble<T> head, int tamanio){
        this.head = null;
        this.tamanio = tamanio;
    }
    
    public boolean estaVacia(){
        return this.head == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }
    
    public void agregarAlFinal(T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if (this.estaVacia()){
            this.head = nuevo;
        }else{
            NodoDoble aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            aux = null;
            nuevo = null;
        }
    }
    
    public void agregarAlInicio(T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        if (estaVacia()){
            this.head = nuevo;
        }else{
            nuevo.setSiguiente(this.head);
            head.setAnterior(nuevo);
            this.head = nuevo;
        }
    }
        
    public void agregarDespuesDe(int posicion, T valor){
        NodoDoble<T> nuevo = new NodoDoble(valor);
        NodoDoble<T> aux = this.head;
        for (int lugar = 1; lugar <= posicion -1; lugar++){
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(nuevo);
        aux.setAnterior(aux);
        nuevo = null;
        aux = null;
    }
    
    public void eliminarElPrimero(){
        NodoDoble<T> aux = this.head;
        this.head = aux.getSiguiente();
        }
    
    public void eliminarElFinal(){
        NodoDoble<T> aux = this.head;
        while (aux != null){
            aux = aux.getSiguiente();
        }        
    }
    
    public void eliminar(int posicion){
        NodoDoble<T> aux = this.head;
        for(int lugar = 1; lugar <= posicion -1; lugar++){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
    }
    
    public void buscar(T valor){
        NodoDoble<T> buscador = this.head;
        NodoDoble<T> nuevo = this. head;
        
        while (buscador == valor){
            buscador = buscador.getSiguiente();
        }
                
    }
    public void transversal() {
        NodoDoble<T> nuevo = this.head;
            while (nuevo != null) {
            System.out.print(nuevo);
            nuevo = nuevo.getSiguiente();
        }
        System.out.println("");
    }
}