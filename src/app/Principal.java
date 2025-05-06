/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;
import model.Credencial;
import model.GestorCredenciales;

/**
 *
 * @author vicen
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Aca se desarrollara la evaluacion de patrones de diseño
         *
         * Generador de Credenciales de Eventos
         *
         * Estudiantes: Vicente Rodriguez Cancino Gonzalo Maturana Cruces
         *
         */

        Scanner scanner = new Scanner(System.in);

        /**
         * Pude hacerlas La clase credencial con el arrayList si pero esta forma
         * creo que es mejor por motivos mios.
         *
         * Instancio Credencial como plantillaCredencial realizo un do while
         * para que despues llegue al mientras SE VE EL MENU TIENE UN SWITCH EN
         * VEZ DE UN IF.
         *
         * Instanciamos GestorCredenciales como gestor, para evitar listas de
         * credenciales desordenadas por el código, manteniendo una única instancia
         * de este gestor para todas las operaciones.
         *
         *
         */
        GestorCredenciales gestor = GestorCredenciales.getInstancia();

        Credencial plantillaCredencial = new Credencial();

        int opcion;

        do {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar nueva credencial");
            System.out.println("2. Ver credenciales generadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer.

            switch (opcion) {
                case 1:
                    // Clonamos con la plantillaCredencial  y asi podemos rellenar datos  una vez realizada se agrega a la lista y nos arroja un mensaje y salimos con break.
                    Credencial nuevaCredencial = plantillaCredencial.clone();

                    System.out.print("Ingrese nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese cargo: ");
                    String cargo = scanner.nextLine();
                    System.out.print("Ingrese RUT: ");
                    String rut = scanner.nextLine();

                    nuevaCredencial.personalizacionCredencial(nombre, cargo, rut);
                    gestor.agregar(nuevaCredencial);

                    System.out.println("Credencial agregada exitosamente.");
                    break;

                case 2:
                    // Llamamos a la función de "listarCredenciales()" para, valga la redundancia, listar las credenciales que hayan sido registradas.
                    gestor.listarCredenciales();
                    break;

                case 3:
                    // Salimos del programa.
                    System.out.println("Saliendo del programa...");
                    break;

                default:

                    // Cualquier otra opción ingresada por el usuario se considerará no válida.
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 3);

        scanner.close();

    }

}
