/* Consigna
Se le da un programa a un empleado administrativo para que ingrese é, los datos de 5 estudiantes.

Para lo solicitado anteriormente, armá el algoritmo con estas características:

Se le solicita que ingrese el número de legajo de cada estudiante, que es un número de cinco cifras (ejemplo: 45876).
Ordenar de manera ascendente los números de legajo.
Luego, debe ingresar 5 apellidos de estudiantes que ingresan a la universidad.
También debe ingresar la calificación con la cual aprobó cada uno su examen de ingreso (de 6 a 10).
Determinar la nota máxima y la nota mínima.
En el algoritmo, se debe calcular el promedio de los exámenes de los 5 estudiantes.
Mostrar en pantalla el apellido de cada estudiante, su número de legajo, y su calificación del examen de ingreso.
Mostrar también en pantalla la calificación máxima, la mínima, y a quién pertenece cada una.
Mostrar en pantalla finalmente el promedio de los exámenes. */

package evaluacion1erCuatrimestre;

import java.util.Scanner;

public class evaluacion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] legajo = new int[5];
		String[] estudiantes = new String[5];
		int[] nota = new int[5];
		int nota_max = 0, nota_min = 100;
		float prom = 0, promedio_total;
		String apellido_max = null, apellido_min = null;

		// Ingreso del legajo del estudiante.
		for (int i = 0; i < legajo.length; i++) {

			System.out.println("\nIngrese el legajo del estudiante " + (i + 1) + ": ");
			legajo[i] = entrada.nextInt();
		}

		// Numerps del legajo de manera ascendente.
		for (int f = 0; f < 5; f++) {
			for (int d = 0; d < 5 - f - 1; d++) {

				if (legajo[d] > legajo[d + 1]) {

					int temporal = legajo[d];

					legajo[d] = legajo[d + 1];

					legajo[d] = temporal;

				}
			}
		}

		System.out.println("");

		// Ingreso del apellido del estudiante.
		for (int j = 0; j < 5; j++) {

			System.out.println("\nIngrese el apellido del estudiante " + (j + 1) + ": ");
			estudiantes[j] = entrada.next();
		}

		System.out.println("");

		// Ingreso de la nota del examen.
		for (int m = 0; m < 5; m++) {

			System.out.println(
					"\nIngrese la nota con la cual aprobo el examen de ingreso el estudiante " + estudiantes[m] + ": ");
			nota[m] = entrada.nextInt();

			// Definir nota max y nota min.
			if (nota[m] > nota_max) {

				nota_max = nota[m];
				apellido_max = estudiantes[m];
			}

			if (nota[m] < nota_min) {

				nota_min = nota[m];
				apellido_min = estudiantes[m];
			}

			prom += nota[m];
		}

		//Promedio.
		promedio_total = prom / 5;

		System.out.println("\nEl promedio es: " + promedio_total);

		System.out.println("");

		// Mostrar en pantalla.
		System.out.println("La nota maxima es: " + nota_max + " del estudiante " + apellido_max);
		System.out.println("La nota minima es: " + nota_min + " del estudiante " + apellido_min);

		System.out.println("");

		for (int e = 0; e < 5; e++) {

			System.out.println("El legajo " + legajo[e] + " del estudiante " + estudiantes[e]
					+ " tiene como nota del examen un " + nota[e]);

		}
	}
}
