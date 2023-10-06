package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Variable para guardar piedra
		String piedra = "Piedra";
		
		//Variable para guardar papel
		String papel = "Papel";
		
		//Variable para guardar tijeras
		String tijeras = "Tijeras";
		
		//Variable para guardar la elección del jugador 1
		String eleccionJ1;
		
		//Variable para guardar la elección del jugador 2
		String eleccionJ2;
		
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto al jugador 1 que escoja una opción
		System.out.println("Jugador 1 elija Piedra, Papel o Tijeras");	
		
		//Leo el valor del teclado
		eleccionJ1 = sc.nextLine();
		
		//Pregunto al jugador 2 que escoja una opción
		System.out.println("Jugador 2 elija Piedra, Papel o Tijeras");	
		
		//Leo el valor del teclado
		eleccionJ2 = sc.nextLine();
		
		//Compruebo quien ha ganado
		if (eleccionJ1.equals(eleccionJ2)) {
			System.out.println("Es un empate");
		} else if (eleccionJ1.equals(piedra)&&eleccionJ2.equals(papel)){
			System.out.println("Jugador 2, has ganado");
		} else if (eleccionJ1.equals(papel)&&eleccionJ2.equals(tijeras)){
			System.out.println("Jugador 2, has ganado");
		} else if (eleccionJ1.equals(tijeras)&&eleccionJ2.equals(piedra)){
			System.out.println("Jugador 2, has ganado");
		} else if (eleccionJ2.equals(piedra)&&eleccionJ1.equals(papel)){
			System.out.println("Jugador 1, has ganado");
		} else if (eleccionJ2.equals(papel)&&eleccionJ1.equals(tijeras)){
			System.out.println("Jugador 1, has ganado");
		} else if (eleccionJ2.equals(tijeras)&&eleccionJ1.equals(piedra)){
			System.out.println("Jugador 1, has ganado");
		}
		
		//Cierro el scanner
		sc.close();
	}

}
