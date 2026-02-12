/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 05/02/2026
* Contenido: Crear la clase cancion
*/
package ej1;

public class Cancion implements Cloneable{

	//-----------
	//Atributos
	//----------
	private String titulo;
	private String autor;
	
	
	//--------------
	//Constructores
	//--------------
	public Cancion(String titulo, String autor) throws IllegalArgumentException{
		if(titulo==null||titulo.isEmpty()) {
			throw new IllegalArgumentException("Error en el titulo");
		}
		
		if(autor==null||autor.isEmpty()) {
			throw new IllegalArgumentException("Error en el autor");
		}
		
		this.titulo=titulo;
		this.autor=autor;
	}
	
	
	public Cancion() {
		this("Sin título","Autor desconocido");
	}
	
	
	//--------------------
	//Guetters y setters
	//--------------------
	
	public String dameTitulo() { //Devuelve el titutlo de la cancion
		return titulo;
	}
	
	public String dameAutor() { //Devuelve el autor de la cancion
		return autor;
	}
	
	
	public void ponTitulo(String tituloNuevo) { //Establece el titulo de la cancion
		if(tituloNuevo==null||tituloNuevo.isEmpty()) {
			throw new IllegalArgumentException("Error en el titulo");
		}
		
		this.titulo=tituloNuevo;
	}
		
	
	public void ponAutor(String autorNuevo) { //Establece el autor de la cancion
		if(autorNuevo==null||autorNuevo.isEmpty()) {
			throw new IllegalArgumentException("Error en el autor");
		}
		
		this.autor=autorNuevo;
	}
	
	
	//----------
	//Metodos
	//----------	
	@Override
	public Cancion clone(){
		 return new Cancion(this.titulo, this.autor);
	}
	
	@Override
    public String toString() {
        return "Cancion { titulo='" + titulo + "', autor='" + autor + "' }";
    }
				
}
