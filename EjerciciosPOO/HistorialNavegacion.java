package EjerciciosPOO;

public class HistorialNavegacion {
    private Nodo actual;

    public void visitar(String url) {
        Nodo nuevo = new Nodo(url);
        if (actual != null) {
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
        actual = nuevo;
        System.out.println("Visitando: " + url);
    }

    public void atras() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            System.out.println("Regresando a: " + actual.url);
        } else {
            System.out.println("No hay páginas anteriores.");
        }
    }

    public void adelante() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            System.out.println("Avanzando a: " + actual.url);
        } else {
            System.out.println("No hay páginas siguientes.");
        }
    }
}
