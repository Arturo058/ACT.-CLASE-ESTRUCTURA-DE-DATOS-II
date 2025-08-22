package EjerciciosPOO;

public class Nodo {
    String url;
    Nodo anterior;
    Nodo siguiente;

    public Nodo(String url) {
        this.url = url;
        this.anterior = null;
        this.siguiente = null;
    }
}
