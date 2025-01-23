/**
 * Emily Góngora, Camila Sandoval, Ale Sierra
 * Clase Main es la principal, hace que el programa funcione
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions myBlender = new Functions();
        Scanner scanner = new Scanner(System.in);
        int choice;

/** 
 * bucle para mostrar el menu and to show the option
 * basically its what the user will see
 */

        do {
            System.out.println("\n Menú de la Licuadora ");
            System.out.println("1. Llenar la licuadora");
            System.out.println("2. Incrementar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Consultar velocidad actual");
            System.out.println("5. Consultar si esta llena");
            System.out.println("6. Vaciar la licuadora");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> myBlender.Fill();
                case 2 -> myBlender.SpeedUp();
                case 3 -> myBlender.SpeedDown();
                case 4 -> System.out.println("Velocidad actual: " + myBlender.GetSpeed());
                case 5 -> System.out.println("¿Está llena? " + (myBlender.IsFull() ? "Sí" : "No"));
                case 6 -> myBlender.Empty();
                case 7 -> System.out.println("Saliendo");
                default -> System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
