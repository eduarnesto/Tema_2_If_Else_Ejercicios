package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variable para guardar el primer número
		int num1;

		// Variable para guardar el segundo número
		int num2;

		// Variable para guardar el tercer número
		int num3;

		// Scanner para leer los números
		Scanner sc = new Scanner(System.in);

		// Pregunto el primer número
		System.out.println("Introduzca un número");

		// Leo el número del teclado
		num1 = sc.nextInt();

		// Pregunto el segundo número
		System.out.println("Introduzca otro número");

		// Leo el número del teclado
		num2 = sc.nextInt();

		// Pregunto el tercer número
		System.out.println("Introduzca otro número");

		// Leo el número del teclado
		num3 = sc.nextInt();

		// Compruebo si son iguales
		if (num1 == num2 && num2 == num3) {
			System.out.println("Los tres números son iguales");
		}

		// Compruebo si el numero 1 y el numero 2 son iguales
		else if (num1 == num2) {

			// Compruebo si el numero 1 es mayor que el numero 3
			if (num1 > num3) {
				System.out.println("El primer número y el segundo numero son iguales y mayores que el tercero");
			} else {
				System.out.println("El tercer numero es mayor que el primero y el segundo numero que son iguales");
			}
		}

		// Compruebo si el numero 2 y el numero 3 son iguales
		else if (num2 == num3) {

			// Compruebo si el numero 2 es mayor que el numero 1
			if (num2 > num1) {
				System.out.println("El segundo número y el tercer numero son iguales y mayores que el primero");
			} else {
				System.out.println("El primer numero es mayor que el segundo y el tercer numero que son iguales");
			}
		}

		// Compruebo si el numero 1 y el numero 3 son iguales
		else if (num1 == num3) {

			// Compruebo si el numero 1 es mayor que el numero 2
			if (num1 > num3) {
				System.out.println("El primer número y el tercer numero son iguales y mayores que el segundo");
			} else {
				System.out.println("El segundo numero es mayor que el primero y el tercer numero que son iguales");
			}
		}

		// Si son todos distintos compruebo si el numero 1 es mayor que el numero 3
		else if (num1 > num3) {

			// Compruebo si el numero 1 es mayor que el numero 2
			if (num1 > 2) {

				// Compruebo si el numero 2 es mayor que el numero 3
				if (num2 > num3) {
					System.out.println("El primer número es mayor que el segundo y el segundo es mayor que el tercero");
				} else {
					System.out.println("El primer número es mayor que el tecero y el tercero es mayor que el segundo");
				}

			} else {
				System.out.println("El segundo número es mayor que el primero y el primero es mayor que el tercero");
			}
		}

		// Si no es mayor compruebo que sea mayor que el numero 2
		else if (num1 > num2) {
			System.out.println("El tercer número es mayor que el primero y el primero es mayor que el segundo");
		}

		// Compruebo si el numero 2 es mayor que el numero 3
		else if (num2 > num3) {
			System.out.println("El segundo número es mayor que el tercero y el tercero es mayor que el primero");
		} else {
			System.out.println("El tercer número es mayor que el segundo y el segundo es mayor que el primero");
		}

		// Cierro el Scanner
		sc.close();
	}

}