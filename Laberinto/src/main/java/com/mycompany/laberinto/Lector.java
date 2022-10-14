package com.mycompany.laberinto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    
    private Array2D mapa;
    private Pila pasos = new Pila();
    private int[] entry = new int[2];
    private int[] exit = new int[3];
    
    public Lector(String ruta){
        
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));
            int ren;
            int col;
            ren = Integer.parseInt(lector.readLine());
            col = Integer.parseInt(lector.readLine());
            mapa = new Array2D(ren, col);
            
            int x;
            for (x = 0; x < ren; x++){
                String linea = lector.readLine();
                String[] comas = linea.split(",");
                int y;
                for (y = 0; y < col; y++){
                    String csv = comas[y];
                    switch (csv) {
                        //E de entrada; S de salida
                        case "E":
                            mapa.setElemento(x, y, true);
                            entry[0] = x;
                            entry[1] = y;
                            break;
                        case "S":
                            mapa.setElemento(x, y, true);
                            exit[0] = x;
                            exit[1] = y;
                            break;
                        //falso para pared (0); true para camino (1)
                        case "0":
                            mapa.setElemento(x, y, false);
                            break;
                        case "1":
                            mapa.setElemento(x, y, true);
                            break;
                        default:
                            break;
                    }
                }
            } 
        } catch (FileNotFoundException ex){
            System.out.println("Error");
        }catch (IOException ex){ }
    }
     public int[] reglas(int ren, int col, int avanzar){
        
        int[] lugar = new int[2];
            
        switch(avanzar){
            case 0:
                lugar [0] = ren;
                lugar [1] = col--;
                break;
                    
            case 1:
                lugar [0] = ren--;
                lugar [1] = col;
                break;
                    
            case 2:
                lugar [0] = ren;
                lugar [1] = col++;
                break;
                    
            case 3:
                 lugar [0] = ren++;
                lugar [1] = col;
                break;
                    
            default:
                break;
        }
        return lugar;
    }
    
    public boolean[] ceros(int ren, int col){
        boolean[] direccion = {true, true, true, true};
        
        if (ren == 0 ){
            direccion [1] = false;
        }else {
            if (ren == mapa.getRen() - 1);
                direccion[3] = false;
        }
        
        if (col == 0 ){
            direccion [0] = false;
        }else {
            if (col == mapa.getCol() - 1);
                direccion[2] = false;
        }
    return direccion;
    }
}
    