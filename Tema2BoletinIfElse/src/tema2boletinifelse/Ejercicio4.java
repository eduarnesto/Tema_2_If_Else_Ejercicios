package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio4 {

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
				
		//Compruebo si cual es mayor
		if (num1>num2) {
			System.out.println("El número " + num1 + " es mayor que " + num2);
		} else if (num2>num1){
			System.out.println("El número " + num2 + " es mayor que " + num1);
		} else {
			System.out.println("Los dos números son iguales");
		}
				
		//Cierro el scanner
		sc.close();

	}

}
