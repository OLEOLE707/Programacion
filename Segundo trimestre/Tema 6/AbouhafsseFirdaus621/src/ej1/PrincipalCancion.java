/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 05/02/2026
* Contenido: Crear la clase cancion
*/

package ej1;

public class PrincipalCancion {

    public static void main(String[] args) {

        // 1. Crear una canción sin título y sin autor.
        Cancion c1 = null;
        try {
            c1 = new Cancion(null, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando c1: " + e.getMessage());
            c1 = new Cancion(); // asignamos valores por defecto
        }

        // 2. Crear una canción con los valores por defecto.
        Cancion c2 = null;
        try {
            c2 = new Cancion();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creando c2: " + e.getMessage());
        }

        // 3. Modificar el título de la canción anterior con y sin contenido.
        try {
            c2.ponTitulo(""); // sin contenido, lanza excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error modificando título de c2: " + e.getMessage());
        }

        try {
        	c2.ponTitulo("Bohemian Rhapsody"); // con contenido
        } catch (IllegalArgumentException e) {
            System.out.println("Error modificando título de c2: " + e.getMessage());
        }

        // 4. Clonar la canción anterior.
        Cancion c3 = null;
        try {
            c3 = c2.clone();
        } catch (Exception e) {
        	System.out.println("Error clonando c2: " + e.getMessage());
        }

        // 5. Crear una variable de referencia a la canción clonada.
        Cancion ref = c3;

        // 6. Modificar el autor de la canción clonada usando la referencia.
        try {
            ref.ponAutor("Queen");
        } catch (IllegalArgumentException e) {
            System.out.println("Error modificando autor de ref: " + e.getMessage());
        }

        // 7. Mostrar la información de todas las canciones.
        try {
            System.out.println("Canción 1: " + c1);
            System.out.println("Canción 2: " + c2);
            System.out.println("Canción 3 (clon): " + c3);
            System.out.println("Referencia (apunta al clon): " + ref);
        } catch (Exception e) {
            System.out.println("Error mostrando canciones: " + e.getMessage());
        }
    }
}
