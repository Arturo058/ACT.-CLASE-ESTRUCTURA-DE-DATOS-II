package EjerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNombresArrayList {
    public void ejecutar() {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Lista de Nombres con ArrayList ===");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa un nombre: ");
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }

        System.out.println("Los nombres son: " + nombres);
        System.out.println();
    }
}
