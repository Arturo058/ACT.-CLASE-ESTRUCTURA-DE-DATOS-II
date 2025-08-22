package EjerciciosPOO;

import java.util.LinkedList;
import java.util.Scanner;

public class TareasLinkedList {
    public void ejecutar() {
        LinkedList<String> tareas = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Lista de Tareas con LinkedList ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa una tarea: ");
            String tarea = sc.nextLine();
            tareas.add(tarea);
        }

        System.out.println("Tareas pendientes: " + tareas);
        System.out.println();
    }
}
