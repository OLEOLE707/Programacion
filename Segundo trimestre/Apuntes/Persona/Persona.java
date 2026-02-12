package Persona;

public class Persona {
	//Variables
	String nombre;
	int edad;
    double altura;
    boolean activo;
	
	//Constructores
    public Persona() {
        nombre = "";
        edad = 0;
    }
    
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, double altura, boolean activo) {
	    this.nombre = nombre;
	    this.edad = edad;
	    this.altura = altura;
	    this.activo = activo;
	}

	
	//Guetter y Setters
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}
	
	public int getEdad() {
	    return edad;
	}

	public void setEdad(int edad) {
	    if (edad >= 0) {
	        this.edad = edad;
	    }
	}
	
	
	//Métodos
	void saludar() {
		System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años");
	}
	
	public int cumplirAnios() {
	    edad++;
	    return edad;
	}
	
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
