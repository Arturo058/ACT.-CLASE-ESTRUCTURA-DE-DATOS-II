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

    public static void ejercicioArrayList() {
        //Arraylist- Lista para almacenar nombres 
        //Creamos un Arraylist para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>(); //se utiliza el mas menos para el arraylist
        Scanner leer = new Scanner(System.in);
        String entrada;
        
        System.out.println("Ingresa nombres (escribe 'salir' para terminar): ");
        while (true){
            entrada = leer.nextLine(); //leemos la entrada del usuario
            if (entrada.equalsIgnoreCase("salir")) break; //si escribe salir termina
            nombres.add(entrada); //Agregamos el nombre a la lista 
        }
        //mostrar los nombres ingresados 
        System.out.println("Nombres ingresados");
        for (String nombre : nombres){
            System.out.println("El nombre ingresado fue: " + nombre);
        }
    }

     public static void ejercicioLinkedList() {
        //ejercicio linkelist- lista enlazada simple de tareas 
        //creamos un likendlist para las tareas 
        LinkedList<String> tareas= new LinkedList<>();
        Scanner recibir = new Scanner(System.in);
        int opcion;

        //menu principal
        do {
            System.out.println("\n1. Agregar tarea \n2. Eliminar primera tarea \n3. Mostrar tareas \n4. salir ");
            System.out.println("Elije una opcion: ");
            opcion = recibir.nextInt(); //leemos la opcion del usuario
            recibir.nextLine(); //Limpiamos el buffer

            switch (opcion) {
                case 1:
                    //agregar una nueva tarea 
                    System.out.println("escribe la tarea: ");
                    String tarea = recibir.nextLine();
                    tareas.add(tarea);
                    break;

                case 2: 
                    //eliminar la primera qie si exite
                    if (!tareas.isEmpty()){
                        System.out.println("Tarea eliminada " + tareas.removeFirst());
                    } else{
                        System.out.println("No hay tarea para eliminar");
                    }
                    break;
                
                case 3:
                    //mostar todas las tareas
                    System.out.println("Lista de tareas: ");
                    for (String t : tareas){
                        System.out.println("-" + t);
                    }
                    break;
            } 
        } while (opcion !=4); //repetir hasta que el usuario leija salir
    }

     public static void ejercicioHistorial() {
        //lista doblemente enlazada-historial de navegacion
        //creamos una lsita enlazada
        LinkedList<String> historial = new LinkedList<>();

        //usamos un iterador para poder movernos adelante y atras
        ListIterator<String> iterador = historial.listIterator();

        Scanner escanear = new Scanner(System.in);
        String comando;
        String actual = null; //pagina actual
        
        System.out.println("comando visitar [url], atras, delante, salir");

        while (true) {
            System.out.print("> ");
            comando = escanear.nextLine();

            if(comando.startsWith("Visitar")){
                //Extraemos la URL despues del comando "visitar"
                String url = comando.substring(8);
                //nos aseguramos de estar al final antes de agregar una nueva pagina 
                while (iterador.hasNext()) iterador.next();
                iterador.add(url); //agregamos la nueva pagina en nuestro historial
                actual =url;

                System.out.println("Visitando: " + actual);

            } else if (comando.equals("atras")){
                //retroseder en el historial si es posible 
                if (iterador.hasPrevious()){
                    actual = iterador.previous();
                    System.out.println("Retrocedio a: " + actual);
                }
                else {
                    System.out.println("No hay paginas anteriores");
                }

            } else if (comando.equals("adelante")){
                //avanzar en el historial si es posible
                if (iterador.hasNext()){
                    actual = iterador.next();
                    System.out.println("Avanzó a: " + actual);
                } else {
                    System.out.println("No hay paginas siguientes");
                }
            } else if (comando.equalsIgnoreCase("salir")){
                break;
            }
        }
    }
}