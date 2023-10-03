package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int num;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		num = sc.nextInt();
		
		//Compruebo si es par
		if (num%2==0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}
		
		//Cierro el scanner
		sc.close();

	}

}
