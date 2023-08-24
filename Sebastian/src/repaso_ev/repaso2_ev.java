package repaso_ev;

public class repaso2_ev {
	public static void main(String[] args) {
		// Armo los arrays pedidos para las personas. 
		String[] apellido = { "Perez", "Gomez", "Ugarte" };
		int[] edad = { 30, 26, 28 };
		int[] DNI = { 37589784, 42888567, 46947858};
		
		// Armo los arrays pedidos para los automóviles.
		String[] marca = { "Chevrolet", "Peugeot", "Renault" };
		String[] modelo = { "Corsa", "208", "Sandero" };
		int[] anio = {2018, 2021, 2022};
		String[] patente = { "AD178JK", "AD200RS", "AD202VW"};
		
		// Armo el for para que recorra los array.
		for (int i = 0; i<3; i++) {
			//Coloco en el IF las condiciones solicitadas.
			if( anio[i] > 2020 && edad[i]>25 ) {
				System.out.println("El auto "+marca[i]+" "+modelo[i]+" con patente "+patente[i]+" pertenece a: "+apellido[i]);
			}
		}
		
	}
}
