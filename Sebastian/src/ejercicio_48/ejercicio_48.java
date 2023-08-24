package ejercicio_48;

public class ejercicio_48 {

	public static void main(String[] args) {
		
		String[] apellidos = {"Gonzalez", "Perez", "Arregui", "Ferreyra"};
		String apellidosMax = "";
		String apellidosMin= "{"; 
		// LA '{' es el primer símbolo que sigue a las letras en el código ASCII.
		
		for (int i = 0; i<apellidos.length; i++) {
			
			if (apellidos[i].compareTo(apellidosMax)>0) {
				apellidosMax = apellidos[i];
			}
			
			if (apellidos[i].compareTo(apellidosMin)<0) {
				apellidosMin = apellidos[i];
			}			
			
		}
		
		System.out.println("Ultimo apellido: " + apellidosMax);
		System.out.println("Primer apellido: " + apellidosMin);
		
	}
	
	
	
}
