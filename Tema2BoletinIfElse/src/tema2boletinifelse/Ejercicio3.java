package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para guardar el número
		float num;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número");
		
		//Leo el número del teclado
		num = sc.nextFloat();
		
		//Compruebo si es un número casi-cero
		if (num!=0&&num<1&&num>-1) {
			System.out.println("El número es un número casi-cero");
		} else {
			System.out.println("El número no es un número casi-cero");
		}
		
		//Cierro el scanner
		sc.close();

	}

}
