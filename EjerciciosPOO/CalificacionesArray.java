package EjerciciosPOO;

import java.util.Scanner;

public class CalificacionesArray {
    public void ejecutar() {
        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        double suma = 0;

        System.out.println("=== Calificaciones con Array ===");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble();
            suma += calificaciones[i];
        }

        double promedio = suma / calificaciones.length;
        System.out.println("El promedio es: " + promedio);
        System.out.println();
    }
}
