package repaso_ev;

import java.util.Scanner;

public class repaso1_ev1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Declaro la cantidad de números DNI a guardar.
		System.out.println("Cuantos DNI vas a almacenar? ");
		int cantidad = entrada.nextInt();

		// Ahora que se la cantidad, puedo armar el array 'DNI'.
		int[] DNI = new int[cantidad];

		// Relleno el array 'DNI'.
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("Ingrese un numero de DNI: ");
			DNI[i] = entrada.nextInt();
		}

		// Inicio ordenamiento burbuja.
		for (int i = 0; i < (DNI.length - 1) /* i < 4 (5-1) */; i++) {

			for (int j = 0; j < (DNI.length - i - 1); j++) {

				if (DNI[j] > DNI[j + 1]) {

					int temporal = DNI[j];

					DNI[j] = DNI[j + 1];

					DNI[j + 1] = temporal;

				}
			}
		}
		// Fin ordenamiento burbuja.

		// Muestro la lista(array) de DNI ordenada.
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("El DNI " + (i + 1) + " es: " + DNI[i]);
			// Uso i+1 para que no figure en pantalla 'DNI en la posición 0'.
		}

		// Creo un array para la lista de apellidos.
		String[] apellidos = new String[cantidad];

		// Relleno la lista de apellidos.
		for (int i = 0; i < DNI.length; i++) {
			System.out.println("Ingrese el apellido del DNI numero " + (i + 1) + ":");
			// Uso i+1 para que no figure en pantalla 'Apellido en la posición numero 0'.
			apellidos[i] = entrada.next();
		}

		// Busco un apellido a través de su DNI.

		System.out.println("\nIngrese un numero de DNI a buscar: ");
		int DNI_buscado = entrada.nextInt();

		/*
		 * Genero una variable booleana para la busqueda. Esto lo que hace es armar una
		 * bandera, que inicializa en FALSE. ¿Para qué? Si se encuentra un número de
		 * DNI, la bandera pasará a estar en TRUE. Si no se encuentra, la bandera
		 * seguirá estando en FALSE, y con un IF podremos indicar que no se encontró el
		 * DNI buscado.
		 */
		boolean busqueda = false;

		for (int i = 0; i < DNI.length; i++) {

			if (DNI_buscado == DNI[i]) {
				System.out.println("El DNI " + DNI_buscado + " pertenece a: " + apellidos[i]);
				busqueda = true; // se encontró un apellido, pasamos a TRUE.
				break;
			}
			
		}

		if (busqueda == false) {
			System.out.println("El DNI buscado no figura en la base de datos.");
		}	
	

	}

}
