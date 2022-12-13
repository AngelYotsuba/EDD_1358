package collections;

import java.util.Stack;

public class CollectionStack {

    public static void main(String[] args) {
        
        Stack<Integer> Pila = new Stack<>();
        
        //push agrega numeros a la lista creada de stack
        Pila.push(2);
        Pila.push(3);
        Pila.push(5);
        Pila.push(7);
        Pila.push(11);
        Pila.push(13);
        Pila.push(17);
        Pila.push(23);
        
        System.out.println("********************");
        System.out.println("Metodo: push");
        System.out.println("Imprime los numeros agregados recientemente");
        System.out.println(Pila);
        System.out.println("********************\n");
        
        //size consulta la catidad de elementos en la pila
        System.out.println("********************");
        System.out.println("size");
        System.out.println(Pila.size());
        System.out.println("********************\n");
        
        //pop elimina o bota, el ultimo elemento de la pila
        System.out.println("********************");
        System.out.println("pop");
        Pila.pop();
        System.out.println(Pila);
        System.out.println("********************");
        
        //peek consulta el ultimo elemeto de la pila
        System.out.println("********************");
        System.out.println("peek");
        System.out.println(Pila.peek());
        System.out.println("********************\n");
        
        //isEmpty ¿Esta vacia la pila?
        System.out.println("********************");
        System.out.println("isEmptyt");
        System.out.println(Pila.isEmpty());
        System.out.println("********************\n");
        
        //clear Vacia la pila
        System.out.println("********************");
        System.out.println("CLEAR");
        Pila.clear();
        System.out.println(Pila);
        System.out.println("********************\n");
        
        //isEmpty ¿Esta vacia la pila? (comprobacion)
        System.out.println("********************");
        System.out.println("isEmpty");
        System.out.println(Pila.isEmpty());
        System.out.println("********************\n");
        
    }
    
}
