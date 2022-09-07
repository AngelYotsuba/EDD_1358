package edd1358;
import com.mycompany.arrays.ArregloADT;
import com.mycompany.arrays.EjemploNomina.AlumnoFesAragon;

public class EDEjemplo {

    public static void main(String[] args) {
        
        AlumnoFesAragon al1 = new AlumnoFesAragon("319224568", "Angel", "ICO", "Aragón", 8.0);
        AlumnoFesAragon al2 = new AlumnoFesAragon("319445233", "Pedro", "RI", "Aragón", 11.0);
        AlumnoFesAragon al3 = new AlumnoFesAragon("142354732", "Jesús", "Derecho", "Aragón", 9.0);
        
        ArregloADT lista = new ArregloADT(3);
        lista.setElemento(0, al1);
        lista.setElemento(1, al2);
        lista.setElemento(2, al3);
        
        lista.getElemento(3);
        lista.limpiar(al1);
        
        lista.setElemento(6, al3);
        System.out.println("--- get ---");
        System.out.println(lista);
    }  
}
