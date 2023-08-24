package do_while;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		char respuesta;
		boolean decision = false;
		
		do {
			System.out.println("Puedo salir? ");
			respuesta = entrada.next().charAt(0);
			
			if (respuesta == 'S') {
				decision = true;
			}
		}while (respuesta != 'S' && decision == false);
					
				
		if (respuesta == 'S' && decision == true) {
		System.out.println("Gracias rey!");
		}
		
		

	}

}
