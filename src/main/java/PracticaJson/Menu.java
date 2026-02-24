package PracticaJson;

import java.util.Scanner;

public class Menu {
    public static void main() {

        System.out.println("===== STAR WARS DATABASE =====");
        System.out.println("1. Mostrar todos los personajes");
        System.out.println("2. Mostrar Personaje por indice");
        System.out.println("3. Buscar personaje por nombre");
        System.out.println("0. salir");

        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                mostrarTodos();
                break;
            case 2:
                mostrarIndice();
                break;
            case 3:
                buscarNombre();
                break;
            case 0:
                break;
            default:
                System.out.println("Opcion invalda");
                break;
        }
    }
    public static void mostrarTodos(){

    }

    public static void mostrarIndice(){

    }

    public static void buscarNombre(){

    }

}
