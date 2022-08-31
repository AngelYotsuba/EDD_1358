package com.mycompany.arrays;
import java.util.ArrayList;

public class ArregloADT<T>{
    
    //Atributos
    int tamanio;
    ArrayList<T> datos;
    
    //Metodos
    public ArregloADT(int tam){
        this.tamanio = tam;
        datos = new ArrayList(this.tamanio);
        for (int i = 0; i < this.tamanio; i++){
            this.datos.add(null);
        }
    }
    
    public void limpiar(T dato){
        for (int i = 0; i < this.tamanio; i++){
            this.datos.set(i, dato);
        }
    }
    
    @Override
    public String toString(){
        String estado = this.tamanio + "\n";
        for (T dato : datos) {
            if(dato != null){
                estado += dato.toString() + "\n";
            }
        }
        return estado;
    }
    
    private boolean comprobacion(int indice){
        return indice >= 0 && indice < this.tamanio;
    }

    public int getLongitud(){
        return this.tamanio;
    }
    
    //get and set
    public T getElemento(int indice){
        if (comprobacion(indice)){
            return this.datos.get(indice);
        }else{
            System.out.println("Fuera del rango");
        }
        return null;
    }

    public void setElemento(int indice, T dato){
        if (comprobacion(indice)){
            this.datos.set(indice, dato);
        }else{
            System.out.println("Fuera del rango");
        }
    }
}