/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 14/01/2026
* Contenido: Crea una clase Persona
*
*/
package ejA2;

public class Persona {

	// Apartado A
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	
	//Apartado B
	public Persona(String nombre, String apellidos, String dni, int edad) throws IllegalArgumentException{
		
		//Nombre
		if(nombre==null) {
			throw new IllegalArgumentException("Nombre no válido");
		}
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío");
		}
		
		//Apellidos
		if(apellidos==null) {
			throw new IllegalArgumentException("Apellidos no válidos");
		}
		if(apellidos.isEmpty()) {
			throw new IllegalArgumentException("El apellido no puede estar vacío");
		}
	
		//DNI
		if(!validarDni(dni)){
			throw new IllegalArgumentException("DNI no válido");
		}
	
		//Edad
		if(edad<0) {
			throw new IllegalArgumentException("ERROR: Edad no válida");
		}
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	//Apartado C
	
	//Guetters
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	
	public int getEdad() {
		return edad;
	}
	

	//Setters
	public void setNombre(String nombre) throws IllegalArgumentException{
		if(nombre!=null && !nombre.isEmpty()) {
			this.nombre=nombre;
		}else {
			throw new IllegalArgumentException("Nombre no válido");
		}
			
	}
	
	public void setApellidos(String apellidos) throws IllegalArgumentException{
		if(apellidos!=null && !apellidos.isEmpty()) {
			this.apellidos=apellidos;
		}else {
			throw new IllegalArgumentException("Apellidos no válidos");
		}		
	}
	
	public void setDni (String dni) throws IllegalArgumentException {
		if (validarDni(dni)) {
			this.dni= dni;	
		}else {
			throw new IllegalStateException ("DNI no válido");
		}
	}
	
	public void setEdad(int edad) throws IllegalArgumentException{
		if(edad>=0) {
			this.edad=edad;
		}else {
			throw new IllegalArgumentException("Edad no válida");
		}
	}
	
	
	
	//Apartado D
	public void imprime() { //Muestra los datos del objeto
		System.out.println("DNI: "+dni+", Nombre: "+nombre+", Apellidos: "+apellidos+", Edad: "+edad);
		
		
	}
	
	public boolean esMayorEdad() { //Devuelve si es mayor de edad
		return edad >= 18;
	}
	
	
	public boolean esJubilado() { //Devuelve si esta jubilado
		return edad >= 65;
	}
	
	public int diferenciaEdad(Persona p) { //Calcula la diferencia de edad entre dos personas
	    if (p == null) {
	        throw new IllegalArgumentException("La persona no puede ser null");
	    }
	    return Math.abs(this.edad - p.edad);
	}
	
	
	

	
	//validarDni
	private static final char[] LETRAS_DNI = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
			'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };

	public static boolean validarDni(String dni) {
		if (dni == null || dni.length() != 9) {
			return false; // Longitud incorrecta
		}

		String numeros = dni.substring(0, 8);
		char letraIntroducida = Character.toUpperCase(dni.charAt(8));

		// Validar que los primeros 8 sean números
		if (!numeros.matches("\\d+")) {
			return false;
		}

		int num = Integer.parseInt(numeros);
		int resto = num % 23;
		char letraCalculada = LETRAS_DNI[resto];

		// Comparar la letra calculada con la introducida
		return letraCalculada == letraIntroducida;
	}
}
