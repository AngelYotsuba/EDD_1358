package collections;

import java.util.LinkedList;

public class CollectionLinkedList {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
    
        //add agrega un elemento a la lista
        System.out.println("*****************");
        list.add("Paco");
        list.add("Pedro");
        list.add("Pablo");
        list.add("Panfilo");
        list.add("Paulo");
        System.out.println("add");
        System.out.println(list);
        System.out.println("*****************\n");
        
        //add index agrega un elemeto en la posicion indicada
        System.out.println("*****************");
        list.add(0, "Picasso");
        System.out.println("add index");
        System.out.println(list);
        System.out.println("*****************\n");
        
        //set selecciona y cambia un elemento }
        System.out.println("*****************");
        list.set(2, "Pablo");
        System.out.println("set");
        System.out.println(list);
        System.out.println("*****************\n");
        
        //remove elimina el elemento indicado
        System.out.println("*****************");
        list.remove("Paco");
        System.out.println("remove");
        System.out.println(list);
        System.out.println("*****************\n");
        
        //clear Elimina todos los elementos de list
        System.out.println("*****************");
        list.clear();
        System.out.println("clear");
        System.out.println(list);
        System.out.println("*****************\n");        
        
    }
    
}
