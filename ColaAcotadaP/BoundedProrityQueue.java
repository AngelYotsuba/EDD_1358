package ColaAcotadaP;
import com.mycompany.queue.Queue;

public class BoundedProrityQueue<T> {
    
    private Queue[] cola;
    private int tamanio;
    private int niveles;

    public BoundedProrityQueue() {
    }

    public BoundedProrityQueue(int nivelesP) {
        this.tamanio = tamanio;
        this.niveles = nivelesP;
        this.cola = new Queue[nivelesP];
        //Recorrido de los niveles
        for(int x = 0; x < nivelesP; x++){
            cola[x] = new Queue<>();
        }
    }
    
    public boolean estaVacia(){
        return tamanio == 0;
    }
    
    public int lenght(){
        return tamanio;
    }
    
    public T agregarDato(int prioridad, T dato){
        //if para evitar sobre pasar los niveles que hay
        if(prioridad > niveles){
            cola[prioridad].agregarCola(dato);
            this.tamanio++;
        }else{
            System.out.println("No se encuentra el nivel");
        }
        //Siempre regreas el dato que pides (Este caso tipo T)
        return dato;
    }
    
    public T quitarCola(){
        boolean comprobacion = false;
        if (!estaVacia()){
            for(int x = 0; !comprobacion && tamanio > 0; x++ ){
                if (!cola[x].estaVacia()){
                    T aux = null;
//Si revisa mi codigo, tengo la pregunta por que me pide el "(T)"
                    aux = (T) cola[x].quitarCola();
                    --this.tamanio;
                }else{
                    System.out.println("Fuera de rango");
                }
            }
        }
        return null;
    }

    public Queue[] getCola() {
        return cola;
    }

    public void setCola(Queue[] cola) {
        this.cola = cola;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        this.niveles = niveles;
    }

    @Override
    public String toString() {
        return "BoundedProrityQueue{" + "cola=" + cola + ", tamanio=" + tamanio + ", niveles=" + niveles + '}';
    }

}
