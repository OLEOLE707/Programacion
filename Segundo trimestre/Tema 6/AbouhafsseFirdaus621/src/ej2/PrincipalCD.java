/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 05/02/2026
* Contenido: Crear la clase principalCD
*/

package ej2;

import ej1.Cancion;

public class PrincipalCD {

    public static void main(String[] args) {

        // 1. Crear un CD llamado unCd
        CD unCd = new CD();

        // 2. Incluir tres canciones
        try {
            unCd.agrega(new Cancion("Imagine", "John Lennon"));
            unCd.agrega(new Cancion("Hey Jude", "The Beatles"));
            unCd.agrega(new Cancion("Hotel California", "Eagles"));
            System.out.println("Número de canciones en unCd: " + unCd.numeroCanciones());
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error agregando canciones a unCd: " + e.getMessage());
        }

        // 3. Eliminar la segunda canción
        try {
            unCd.elimina(1);
            System.out.println("Después de eliminar la segunda canción:");
            System.out.println(unCd);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error eliminando canción: " + e.getMessage());
        }

        // 4. Crear otro CD y copiar el contenido de unCd
        CD otroCd = new CD();
        try {
            for (int i = 0; i < unCd.numeroCanciones(); i++) {
                otroCd.agrega(unCd.dameCancion(i).clone());
            }
        } catch (Exception e) {
            System.out.println("Error copiando canciones a otroCd: " + e.getMessage());
        }

        // 5. Agregar una canción a otroCd
        try {
            otroCd.agrega(new Cancion("Stairway to Heaven", "Led Zeppelin"));
        } catch (Exception e) {
            System.out.println("Error agregando canción a otroCd: " + e.getMessage());
        }

        // 6. Mostrar contenido de unCd
        System.out.println("Contenido de unCd:");
        System.out.println(unCd);

        // 7. Mostrar contenido de otroCd
        System.out.println("Contenido de otroCd:");
        System.out.println(otroCd);
    }
}
