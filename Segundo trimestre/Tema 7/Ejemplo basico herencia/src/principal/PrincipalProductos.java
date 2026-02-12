/*
* Nombre: Firdaus Abouhafsse Mehamed
* Fecha: 11/02/2026
* Contenido: Prueba de herencias (Clase principal)
*/

package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import padre.Producto;
import productoCongelado.ProductoCongelado;
import productoFresco.ProductoFresco;
import productoRefrigerado.ProductoRefrigerado;

public class PrincipalProductos {
	
	
	public static Producto creacionProducto(){ //Crea y comprueba los datos pedidos
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		boolean creado=false;
		String nombre;
		LocalDate fechaCad;
		String fecha;
		int numLote;
		
		Producto p=null;
		while(creado==false) {
			try {
				System.out.print("Introduce el nombre del producto: ");
				nombre=sc.nextLine();
				
				System.out.print("Introduce la fecha de caducidad del producto (dd/MM/yyyy): ");
				fecha = sc.nextLine();
				
		        fechaCad = LocalDate.parse(fecha, formato);
		        
		        System.out.print("Introduce el numero de lote: ");
		        numLote=sc.nextInt();

		        p = new Producto(nombre, fechaCad,numLote);
		        creado=true;
		        
						
			}catch(Exception e) {
				System.out.println(e.getMessage());
				creado=false;
				sc.nextLine();
			}
		}
		return p;
	}
	
	public static ProductoFresco creacionProductoFresco(){ //Crea y comprueba los datos pedidos
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		boolean creado=false;
		String nombre;
		LocalDate fechaCad;
		String fechaCaducidad;
		int numLote;
		LocalDate fechaEnvasado;
		String fechaEnvasadoTexto;
		String paisOrigen;
		
		
		ProductoFresco p=null;
		while(creado==false) {
			try {
				System.out.print("Introduce el nombre del producto: ");
				nombre=sc.nextLine();
				
				System.out.print("Introduce la fecha de caducidad del producto (dd/MM/yyyy): ");
				fechaCaducidad = sc.nextLine();
				
		        fechaCad = LocalDate.parse(fechaCaducidad, formato);
		        
				System.out.print("Introduce la fecha de envasado del producto (dd/MM/yyyy): ");
				fechaEnvasadoTexto = sc.nextLine();
				
		        fechaEnvasado = LocalDate.parse(fechaEnvasadoTexto, formato);
		        
				System.out.print("Introduce el país de origen: ");
				paisOrigen = sc.nextLine();
				
		        System.out.print("Introduce el numero de lote: ");
		        numLote=sc.nextInt();
				

		        p = new ProductoFresco(nombre, fechaCad,numLote,fechaEnvasado,paisOrigen);
		        creado=true;
		        
						
			}catch(Exception e) {
				System.out.println(e.getMessage());
				creado=false;
				sc.nextLine();
			}
		}
		return p;
	}
	
	

	public static void main(String[] args) {
		Producto p1=creacionProducto();
		System.out.println(p1.toString());
	
		ProductoFresco p2= creacionProductoFresco();
		System.out.println(p2.toString());
		
		ProductoRefrigerado p3= new ProductoRefrigerado("A", LocalDate.now(), 3 ,LocalDate.of(2007, 12, 3), (byte) -5, 2);
		System.out.println(p3.toString());
		
		ProductoCongelado p4= new ProductoCongelado("A", LocalDate.now(), 3, (byte) -5,(byte) 2);
		System.out.println(p4.toString());
			
	
	}

}
