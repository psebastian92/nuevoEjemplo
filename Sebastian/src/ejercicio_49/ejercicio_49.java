package ejercicio_49;

import java.util.Scanner;

public class ejercicio_49 {

	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);

		System.out.println("Ingresa la cantidad de DNI a anotar: ");
		int cantidad = datos.nextInt();
		
		int[] DNI = new int [cantidad];
		
		// Ingreso de DNI
		for (int i = 0; i<DNI.length; i++) {
			System.out.println("Ingresa un DNI");
			DNI[i] = datos.nextInt();		
		}
		
		// Ordeno los numeros DNI
		
		
		for (int i = 0; i < (DNI.length - 1) /* i < 4 (5-1) */; i++) {
			 
			for (int j = 0; j < (DNI.length - i - 1) ; j++) {
		
				
				if (DNI[j] > DNI[j + 1]) {
					
					// Intercambiar los elementos
					int temporal = DNI[j];
					
					/* temporal sirve para guardar por un momento
						al valor mas alto. 
					*/
					DNI[j] = DNI[j + 1];
								
					// La primera posicion de las dos, toma el valor de la segunda (que es mas chico).
					DNI[j + 1] = temporal;
						
					// La segunda posicion, toma el valor mas alto.
				}
			}
		}
		
		// Mostrar lista ordenada ascendente
		
		System.out.println("LISTA ORDENADA ASCENDENTE");
		
		for (int i = 0; i<DNI.length; i++) {
			System.out.println("DNI: "+DNI[i]+"\n");
			
		}
		
		// Mostrar la lista en orden descendente
		
		System.out.println("LISTA ORDENADA DESCENDENTE");
		
		for (int i = DNI.length-1; i>=0; i--) {
			System.out.println("DNI: "+DNI[i]+"\n");
			
		}
		
		

	}

}
