/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 05/02/2026
* Contenido: Crear la clase CD
*/
package ej2;

import ej1.Cancion;

public class CD {
	//-------------
	//Atributos
	//------------
	public static final byte MAX_CANCIONES = 50;
	
	private Cancion[] canciones;
    private int contador;

     

    //-------------------
    // Constructores
    //-------------------
    public CD() {
        canciones = new Cancion[MAX_CANCIONES];
        contador = 0;
    }

    
    
    //-------------------
    // Métodos
    //-------------------

    public int numeroCanciones() { // Devuelve el número de canciones en el CD
        return contador;
    }

   
    public Cancion dameCancion(int pos) {  // Devuelve la canción en la posición indicada
        if (pos < 0 || pos >= contador) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        return canciones[pos];
    }

   
    public void grabaCancion(int pos, Cancion cancionNueva) {  // Cambia la canción de la posición indicada
        if (pos < 0 || pos >= MAX_CANCIONES) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        if (cancionNueva == null) {
            throw new IllegalArgumentException("La canción no puede ser nula");
        }
        if (pos >= contador) {
            // si la posición está vacía, aumentar el contador
            contador = pos + 1;
        }
        canciones[pos] = cancionNueva;
    }

    
    public void agrega(Cancion cancionNueva) { // Agrega una canción en la primera posición disponible
        if (cancionNueva == null) {
            throw new IllegalArgumentException("La canción no puede ser nula");
        }
        if (contador >= MAX_CANCIONES) {
            throw new IllegalStateException("El CD está lleno, no se puede agregar más canciones");
        }
        canciones[contador] = cancionNueva;
        contador++;
    }

    
    public void elimina(int pos) { // Elimina la canción de la posición indicada
        if (pos < 0 || pos >= contador) {
            throw new IndexOutOfBoundsException("Posición inválida: " + pos);
        }
        for (int i = pos; i < contador - 1; i++) {
            canciones[i] = canciones[i + 1];
        }
        canciones[contador - 1] = null;
        contador--;
    }

    @Override
    public String toString() { //Muestra el contenido
        StringBuilder sb = new StringBuilder();
        sb.append("CD con ").append(contador).append(" canciones:\n");
        for (int i = 0; i < contador; i++) {
            sb.append(i + 1).append(". ").append(canciones[i]).append("\n");
        }
        return sb.toString();
    }
}
