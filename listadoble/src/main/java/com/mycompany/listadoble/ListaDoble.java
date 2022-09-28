package com.mycompany.listadoble;

public class ListaDoble {

    public static void main(String[] args) {
     
        ListaDobLigadaADT<Integer> listaD = new ListaDobLigadaADT();
        
        listaD.agregarAlInicio(10);
        listaD.transversal();
        listaD.agregarAlFinal(15);
        listaD.transversal();
        listaD.agregarAlInicio(5);
        listaD.transversal();
        listaD.eliminar(2);
        listaD.transversal();
        listaD.agregarAlInicio(2);
        listaD.transversal();
        listaD.agregarAlInicio(13);
        listaD.transversal();
        //listaD.eliminarElPrimero();
        //listaD.transversal();
        listaD.eliminarElFinal();
        listaD.transversal();
        }
}