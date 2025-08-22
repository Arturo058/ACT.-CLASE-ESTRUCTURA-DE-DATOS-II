import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        //ejercicioArray();
        //ejercicioArrayList();
        //ejercicioLinkedList();
        //ejercicioHistorial();
    }

    // array (arreglo) - Estructura indexada de tamaño fijo
    // ejercicio de calificaciones 
    public static void ejercicioArray() {
        // declaramos un arreglo de 5 calificaciones 
        double[] calificaciones = new double[5]; // todo lo que tenga corchetes es una lista o un arreglo 
        Scanner sc = new Scanner(System.in); 
        double suma = 0;

        // pedimos al usuario agregar 5 calificaciones 
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingresa la calificacion: " + (i + 1) + ": ");
            calificaciones[i] = sc.nextDouble(); // guardas calificaciones 
            suma += calificaciones[i]; // sumamos para calcular el promedio después 
        }

        // calculamos promedio
        double promedio = suma / calificaciones.length;

        // demostrar el resultado 
        System.out.println("El promedio es " + promedio);
    }
}