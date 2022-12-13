package collections;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        
	ArrayList<Integer> lista = new ArrayList<>();
        
	//add agrega un elemeto a la lista
        lista.add(90);
        lista.add(81);
        lista.add(72);
        lista.add(63);
        lista.add(54);
        lista.add(45);
        System.out.println("*****************");
        System.out.println("add");
        System.out.println(lista);
        System.out.println("*****************\n");
        
        
        //remove remueve un elemento en la posicion indicada
        System.out.println("*****************");
        System.out.println("remove");
        lista.remove(3);
        System.out.println(lista);
        System.out.println("*****************\n");
        
        //size pide el tamaño de la lista
        System.out.println("*****************");
        System.out.println("size");
        System.out.println(lista.size());
        System.out.println("*****************\n");
        
        //isEmpty ¿Esta vacia la lista?
        System.out.println("*****************");
        System.out.println("isEmpty");
        System.out.println(lista.isEmpty());
        System.out.println("*****************\n");
        
        //clear borra todos los elementos de la lista 
        System.out.println("*****************");
        System.out.println("clear");
        lista.clear();
        System.out.println(lista);
        System.out.println("*****************\n");
        
        //isEmpty muestra si la lista esta vacia
        System.out.println("*****************");
        System.out.println("isEmpty");
        System.out.println(lista.isEmpty());
        System.out.println("*****************\n");
    }
}
