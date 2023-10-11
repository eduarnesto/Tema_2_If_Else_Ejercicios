package tema2Switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int nota;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		nota = sc.nextInt();
		
		//Compruebo la nota
		
		switch(nota) {
		case 0,1,2,3,4->{
			System.out.println("Tiene un insuficiente");
		}
		case 5->{
			System.out.println("Tienes un suficiente");
		}
		case 6->{
			System.out.println("Tienes un bien");
		}
		case 7,8->{
			System.out.println("Tienes un notable");
		}
		case 9,10->{
			System.out.println("Tienes un sobresaliente");
		}
		default->{
			System.out.println("El valor no es váido");
		}
		}
		
		//Cierro el scanner
		sc.close();
	}

}
