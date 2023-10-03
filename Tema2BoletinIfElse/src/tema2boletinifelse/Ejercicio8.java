package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Variable para guardar el número
		float num;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		num = sc.nextFloat();
		
		//Compruebo la nota
		if (num<5) {
			System.out.println("Tiene un insuficiente");
		} else if (num<6) {
			System.out.println("Tienes un suficiente");
		} else if (num<7) {
			System.out.println("Tienes un bien");
		} else if (num<9) {
			System.out.println("Tienes un notable");
		} else if (num>=9) {
			System.out.println("Tienes un sobresaliente");
		} 
		
		//Cierro el scanner
		sc.close();
	}


}
