package ColaAcotadaP;

public class MainColaAcotadaP {

    public static void main(String[] args) {
        
        BoundedProrityQueue cola = new BoundedProrityQueue<>(6);
        
	cola.agregarDato(5, "Capitán");
	cola.agregarDato(4, "Timonel");
	cola.agregarDato(3, "Mujeres");
	cola.agregarDato(2, "3ra Edad");
	cola.agregarDato(1, "Niñas");
	cola.agregarDato(4, "Maestre");
	cola.agregarDato(2, "Niños");
	cola.agregarDato(4, "Mecánico");
	cola.agregarDato(3, "Hombres");
	cola.agregarDato(4, "Vigia");
        
        System.out.println(cola);
    }
    
}
