/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 08/01/2026
* Contenido: Crear una clase alumno con las especificaciones indicadas.
*
*/

package alumno;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alumno {

	// Niveles de ingles
	public enum Ingles {Principiante, A1, A2, B1, B2, C1, C2, Nativo}
	

	// Atributo de clase constante y público.
	public final static int MAX_ALUMNOS_CENTRO = 100;
	public final static int MAX_ALUMNOS_GRUPO = 10;
	public final static int MIN_ALUMNOS_GRUPO = 2;
	public final static LocalTime HORA_MAX_CENTRO = LocalTime.of(00, 00);

	// Atributo de clase variable y privada
	private static int numAlumnos;

	// Atributo de objeto variable y privado.
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fecha_nacimiento;
	private float peso;
	private float altura;
	private boolean mayorEdad;
	private byte numHermanos;
	private LocalTime hora_max_alumno;
	private Ingles nivelIngles;
	
	
	//Defaults
	private static final String NOMBRE_DEFAULT= "Pepe";
	private static final String APELLIDOS_DEFAULT=  "Pepe";
	private static final String DNI_DEFAULT= "00000000A";
	private static final LocalDate FECHA_NAC_DEFAULT=LocalDate.of(1950, 01, 01);
	private static final float PESO_DEFAULT=0;
	private static final float ALTURA_DEFAULT=0;
	private static final byte NUM_HERMANOS_DEFAULT=0;
	private static final LocalTime HORA_MAX_ALUMNOS_DEFAULT=HORA_MAX_CENTRO;
	private static final Ingles NIVEL_INGLES_DEFAULT= Ingles.A1;



	//Constructor de 9 parámetros
	public Alumno (String nombre, String apellidos, String dni, LocalDate fecha_nacimiento, float peso, float altura, boolean mayorEdad, byte numHermanos, LocalTime hora_max_alumno, Ingles nivelIngles) throws IllegalArgumentException {
	
		// Comprobacion de los valores de entrada
		
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
		if(nombre.isEmpty()) {
			throw new IllegalArgumentException("El apellido no puede estar vacío");
		}
	
		//DNI
		if(!validarDni(dni)){
			throw new IllegalArgumentException("DNI no válido");
		}
		if(dni.isEmpty()) {
			throw new IllegalArgumentException("ERROR: El dni es obligatorio");
		}
		
		//Fecha de nacimiento
		if(fecha_nacimiento==null||fecha_nacimiento.getYear()<1900||fecha_nacimiento.isAfter(LocalDate.now())){
			throw new IllegalArgumentException("Fecha de nacimiento no válida");
		}
		
		//Peso
		if(peso<0) {
			throw new IllegalArgumentException("Peso del alumno no válido");
		}
		
		//Altura
		if(altura<0) {
			throw new IllegalArgumentException("Altura del alumno no válida");
		}
		
		//Hermanos
		if(numHermanos<0) {
			throw new IllegalArgumentException("Número de hermanos del alumno no válido");
		}
		
		//Hora maxima del alumno
		if(hora_max_alumno.isAfter(HORA_MAX_CENTRO)||hora_max_alumno==null) {
			throw new IllegalArgumentException("Hora máxima del alumno no válida");
		}
		
		
		//Contador de cantidad de alumnos
		if(numAlumnos<MAX_ALUMNOS_CENTRO) {
			Alumno.numAlumnos++;
		}
		
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.fecha_nacimiento=fecha_nacimiento;
		this.peso=peso;
		this.altura=altura;
		this.numHermanos=numHermanos;
		this.hora_max_alumno=hora_max_alumno;
	}
	
	
	//Constructor de 3 parámetros
	public Alumno (String nombre, String apellidos, String dni) throws IllegalArgumentException {
		this(nombre, apellidos, dni, FECHA_NAC_DEFAULT, PESO_DEFAULT, ALTURA_DEFAULT, true, NUM_HERMANOS_DEFAULT, HORA_MAX_ALUMNOS_DEFAULT, NIVEL_INGLES_DEFAULT);
	}
	
	
	
	//Constructor sin parámetros
	public Alumno () throws IllegalArgumentException{
		this(NOMBRE_DEFAULT, APELLIDOS_DEFAULT, DNI_DEFAULT, FECHA_NAC_DEFAULT, PESO_DEFAULT, ALTURA_DEFAULT, true, NUM_HERMANOS_DEFAULT, HORA_MAX_ALUMNOS_DEFAULT, NIVEL_INGLES_DEFAULT);
	}
	
	
	
	
	
	
	//METODOS
	
	
	//Validador de la letra del DNI
	private final static String LETRAS_DNI = "TRWAGBVCKMXJTZSNPRQG";

	public static boolean validarDni(String dni) { 
		
		String letra="";
		String letraCalculada="";
		
		if(dni.matches("[0-9]{8}[A-H J-N P-S V-Z]")){
			String numeros = dni.substring(0, 8);
			letra = dni.substring(8).toUpperCase();

			int numDNI = Integer.parseInt(numeros);
			int resto = numDNI % 23;
			letraCalculada = String.valueOf(LETRAS_DNI.charAt(resto));
		}

		return letra.equals(letraCalculada); // Comprobar si la letra coincide
	}
	
	
}