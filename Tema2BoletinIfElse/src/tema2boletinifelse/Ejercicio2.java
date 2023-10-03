package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para guardar el primer número
		int num1;
		
		//Variable para guardar el segundo número
		int num2;
				
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
				
		//Pregunto el primer número
		System.out.println("Introduzca un número");
				
		//Leo el número del teclado
		num1 = sc.nextInt();
		
		//Pregunto el segundo número
		System.out.println("Introduzca otro número");
				
		//Leo el número del teclado
		num2 = sc.nextInt();
				
		//Compruebo si son iguales
		if (num1==num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números son distintos");
		}
				
		//Cierro el scanner
		sc.close();

	}

}
