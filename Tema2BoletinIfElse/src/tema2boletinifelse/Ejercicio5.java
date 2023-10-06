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
		
		//Variable para guardar el número mayor
		int mayor;

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

		// Ordeno los números
		if (num1>=num2){
			if(num2>=num3) {
				System.out.println(num1+">="+num2+">="+num3);
			} else if (num1>num3){
				System.out.println(num1+">="+num2+">="+num3);
			} else {
				System.out.println(num3+">="+num1+">="+num2);
			}
		} else if(num2>=num3){
			if (num1>=num3) {
				System.out.println(num2+">="+num1+">="+num3);
			} else {
				System.out.println(num2+">="+num3+">="+num1);
			}
		} else {
			System.out.println(num3+">="+num2+">="+num1);
		}
		// Cierro el Scanner
		sc.close();
	}

}