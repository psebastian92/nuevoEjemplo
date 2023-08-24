package ejemplo_continue;

import java.util.Scanner;

public class ejemplo_continue {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] legajo = new int[4];

		for (int i = 0; i < 4; i++) {
			System.out.println("ingrese un número de legajo de 5 cifras.");
			legajo[i] = entrada.nextInt();
			if (legajo[i] > 99999 || legajo[i] < 10000) {
				i--;
				System.out.println(i);
				continue;
			}
			

		}

	}

}
