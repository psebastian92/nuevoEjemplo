package tp_1er_bim;
// nombre del paquete
import java.util.Scanner;
// liberia para scanner, para ingresar datos
public class tp_1er_bim {
	public static void main(String[] args) {
		// funcion principal
	
		Scanner datos = new Scanner(System.in);
		// clase scanner para ingresar 
		System.out.printn("\tEste programa te permite resolver algunos problemas");
		System.out.println('\tElegí una opción: ');
		System.out.println("1. Calcular raiz cuadrada.")
		System.out.println("2. Analizar si un numero es positivo, negativo o cero.");
		System.out.println("3. Jugar al bingo." + \n);
		// comandos para mostrar en pantalla
		opc = datos.nextInt();

		switch (opc) {

		case 1:
			System.out.println("Ingresa un número para calcular su raiz cuadrada: ");

			int num_raiz;
			num_raiz = datos.nextFloat();

			if (num raiz >= 0) {
				int raiz_cuadrada = (int)  Math.sqrt() ;
				System.out.println("El resultado es: " + raiz_cuadrada);
			 else {
				System.out.println("No se puede calcular la raiz de un negativo.");
			}

			
		case '2':
			System.out.println("Ingresa un numero: ");

			int num signo;
			num signo = datos.next();

			if (num_signo == 0) {
				System.out.println("El numero es cero");
			} else if (num_signo > 0) {
				System.out.println("El numero es positivo");
			} else (num_signo < 0){
				System.out.println("El numero es negativo");
			}

			break;

		case = 3:
			System.out.println("Ingresa un numero entre 0 y 9");

			int num bingo;
			num_bingo = datos.nextInt();

			double num_ganador_double = Math.random() * 9;
			int num_ganador =  num_ganador_double;

			if (num bingo = num_ganador) {
				System.out.println("Ganaste!");
			} else {
				systemoutprintln("Perdiste :(";
				System.out.println("El numero ganador es: " + num_ganador);
			}

			

		default:
			System.out.println("Opcion incorrecta.");
			break;

		}
	}

}
