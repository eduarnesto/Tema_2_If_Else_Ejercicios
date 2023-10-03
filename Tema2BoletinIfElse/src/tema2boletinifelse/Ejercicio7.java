package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int num;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		num = sc.nextInt();
		
		//Compruebo si cuántas cifras tienes
		if (num>9999) {
			System.out.println("El número tiene 5 cifras");
		} else if (num>999) {
			System.out.println("El número tiene 4 cifras");
		} else if (num>99) {
			System.out.println("El número tiene 3 cifras");
		} else if (num>9) {
			System.out.println("El número tiene 2 cifras");
		} else {
			System.out.println("El número tiene 1 cifra");
		}
		
		//Cierro el scanner
		sc.close();
	}

}
