package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Variable para guardar el primer número
		int num1;
		
		//Variable para guardar el segundo número
		int num2;
		
		//Variable para guardar el tercer número
		int num3;
				
		//Scanner para leer los números
		Scanner sc = new Scanner(System.in);
				
		//Pregunto el primer número
		System.out.println("Introduzca un número");
				
		//Leo el número del teclado
		num1 = sc.nextInt();
		
		//Pregunto el segundo número
		System.out.println("Introduzca otro número");
				
		//Leo el número del teclado
		num2 = sc.nextInt();
		
		//Pregunto el tercer número
		System.out.println("Introduzca otro número");
				
		//Leo el número del teclado
		num3 = sc.nextInt();
		
		//Compruebo si la suma de dos números da como resultado el tercero
		if(num1+num2==num3) {
			System.out.println("La suma del primer número y del segundo número da el tercer número");
		} else if(num1+num3==num2) {
			System.out.println("La suma del primer número y del tercer número da el segundo número");
		} else if(num2+num3==num1) {
			System.out.println("La suma del tercer número y del segundo número da el primer número");
		} else {
			System.out.println("Ninguna combinación de dos números da como resultado el otro número");
		}
		
		//Cierro el Scanner
		sc.close();

	}
}
