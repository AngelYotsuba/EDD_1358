package edd1358;
import com.mycompany.arrays.ArregloADT;
import com.mycompany.arrays.EjemploNomina.AlumnoFesAragon;

public class EDEjemplo {

    public static void main(String[] args) {
        
        AlumnoFesAragon al1 = new AlumnoFesAragon("319224568", "Angel", "ICO", "Aragón", 8.0);
        AlumnoFesAragon al2 = new AlumnoFesAragon("319445233", "Karal", "RI", "Aragón", 11.0);
        AlumnoFesAragon al3 = new AlumnoFesAragon("142354732", "Jesús", "Derecho", "Aragón", 9.0);
        System.out.println(al3);
        
        
        ArregloADT lista = new ArregloADT(5);
        lista.setElemento(0, al1);
        lista.setElemento(2, al2);
        lista.setElemento(4, al3);
        
        System.out.println(lista);
        
        lista.setElemento(6, al3);
        System.out.println("--- get ---");
        System.out.println( lista.getElemento(2));
        
    }
    
}
