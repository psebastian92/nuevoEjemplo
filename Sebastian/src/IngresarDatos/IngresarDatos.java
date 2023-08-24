package IngresarDatos;

import java.util.Scanner;
/* Para ingresar datos, vamos a 
necesitar esta libreria (para usar la palabra Scanner). */

public class IngresarDatos {
	public static void main (String args []) {
		Scanner entrada = new Scanner (System.in);
		/* Esta línea nos ayuda a ingresar datos.
		 "entrada" en este caso lo puse yo, porque se 
		 me ocurrio, pero se puede llamar de cualquier forma.
		 "entrada" nos va a guardar TODOS nuestros datos.
		 Hacé de cuenta que "entrada" es una carpeta, y las variables
		 van a ser hojas que se guardan en esta carpeta.
		  */
		
		String nombre; // definimos una cadena "nombre"
		int edad; // definimos una variable entera "edad".
		String cadena; 
		
		System.out.println("Escribí tu nombre: ");
		nombre = entrada.next();
		
		System.out.println("Ingresá tu edad");
		edad = entrada.nextInt();
		
		System.out.println("Tu nombre es: "+nombre);
		System.out.println("Tu edad es: "+edad);
		
		}
}
