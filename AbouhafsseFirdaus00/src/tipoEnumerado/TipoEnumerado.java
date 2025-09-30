package tipoEnumerado;

public class TipoEnumerado {
		
		public enum Estaciones {PRIMAVERA,VERANO,OTOÑO,INVIERNO}

		public static void main(String[] args) {
			
			Estaciones var1=Estaciones.PRIMAVERA;
			Estaciones var2=Estaciones.VERANO;
			Estaciones var3=Estaciones.OTOÑO;
			Estaciones var4=Estaciones.INVIERNO;
			
			System.out.println("El valor de la variable uno es: "+var1);
			
			System.out.println("El valor de la variable dos es: "+var2);
			
			System.out.println("El valor de la variable tres es: "+var3);
			
			System.out.println("El valor de la variable cuatro es: "+var4);
			
		
		}
		

	}