package model;

import java.util.ArrayList;

public class GestorCredenciales {
    // Definimos los atributos de la clase GestorCredenciales.
    private static GestorCredenciales instancia;
    private ArrayList<Credencial> listaCredenciales = new ArrayList<>();
    
    // Constructor privado como se vio en clases.
    private GestorCredenciales() {
        System.out.println("Gestor de credenciales inicializado.");
    }
    
    // Función para obtener instancia única de la clase.
    public static GestorCredenciales getInstancia() {
        if (instancia == null) {
            instancia = new GestorCredenciales();
        }
        return instancia;
    }
    
    // Función para agregar credenciales de la clase Credencial a la lista.
    public void agregar(Credencial c) {
        listaCredenciales.add(c);
    }
    
    // Función para listar credenciales registradas.
    // En caso de que la lista esté vacía, se le informará al usuario por medio del mensaje en System.out.println.
    public void listarCredenciales() {
        if (listaCredenciales.isEmpty()) {
            System.out.println("No existen credenciales.");
        } else {
            for (int i = 0; i < listaCredenciales.size(); i++) {
                System.out.println("Credencial #" + (i + 1));
                listaCredenciales.get(i).MostrarCredencial();
                System.out.println("-----------------------------------------");
            }
        }
    }
}
