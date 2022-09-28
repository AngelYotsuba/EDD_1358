package com.mycompany.listadoble;

public class NodoDoble<T> {
    
    private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;
    
    public NodoDoble(){}
    
    public NodoDoble(T valor){
        this.dato = valor;
    }
    public NodoDoble(T dato, NodoDoble<T> siguiente, NodoDoble<T> anterior){
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public NodoDoble<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(NodoDoble<T> siguiente){
        this.siguiente = siguiente;
    }
    
    public T getDato(){
        return dato;
    }
    public void setDato(T dato){
        this.dato = dato;
    }
    
    public NodoDoble<T> getAnterior(){
        return anterior;
    }
    public void setAnterior(NodoDoble<T> anterior){
        this.anterior = anterior;
    }
    
    @Override
    public String toString(){
        return "-> |" + dato + "| <-";
    }
}