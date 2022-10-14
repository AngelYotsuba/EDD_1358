package com.mycompany.laberinto;

public class Array2D<T> {
    
    private int ren;
    private int col;
    private ArrayADT<T> renDatos;
    private ArrayADT<T> colDatos;
    
   public Array2D(){}
    
    public Array2D(int ren, int col){
        this.col = col;
        this.ren = ren;
        this.colDatos = new ArrayADT<>(col);
        this.renDatos = new ArrayADT<>(ren);
        
        int x;
        for (x = 0; x < ren; x++){
            ArrayADT aux = new ArrayADT<>(col);
            int y;
            for (y = 0; y < col; y++){
                aux.setElemento(y, null);
            }
            renDatos.setElemento(x, (T)aux);
        }
    }
    
    public void clear(T dato){
        int x;
        for (x = 0; x < ren; x++){
            int y;
            for (y = 0; y < col; y++){
                colDatos.setElemento(y, dato);
            }
            renDatos.setElemento(x, (T)colDatos);
        }
    }
    
    public void setElemento(int ren, int col, T dato){
        if (comprobacion(ren, col)){
            ArrayADT temp = (ArrayADT) renDatos.getElemento(ren);
            temp.setElemento(col, dato);
            renDatos.setElemento(ren, (T) temp);
	}else{
            System.out.println("Fuera de rango");
	}
    }
    
    public T getElemento(int ren, int col){
	if (comprobacion(ren, col)){
            ArrayADT temp = (ArrayADT) renDatos.getElemento(ren);
            return (T) temp.getElemento(col);
	}else{
            System.out.println("Fuera de rango");
	}
	return null;
    }
    
    private boolean comprobacion(int ren, int col){
        return ren >= 0 && ren < this.ren && col >= 0 && col < this.col;
    }
    
    public int getRen(){
        return this.ren;
    }
    
    public void setRen(int ren){
        this.ren = ren;
    }
    
    public int getCol(){
        return this.col;
    }
    
    public void setCol(int col){
        this.col = col; 
    }    
}
