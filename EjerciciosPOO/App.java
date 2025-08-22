package EjerciciosPOO;

public class App {
    public static void main(String[] args) {
        // Ejecutar cada estructura de datos con POO
        CalificacionesArray calificaciones = new CalificacionesArray();
        calificaciones.ejecutar();

        ListaNombresArrayList listaNombres = new ListaNombresArrayList();
        listaNombres.ejecutar();

        TareasLinkedList tareas = new TareasLinkedList();
        tareas.ejecutar();

        System.out.println("=== Historial de Navegacion ===");
        HistorialNavegacion historial = new HistorialNavegacion();
        historial.visitar("google.com");
        historial.visitar("youtube.com");
        historial.visitar("github.com");
        historial.atras();
        historial.atras();
        historial.adelante();
    }
}
