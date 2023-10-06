package tema2Switch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para guardar el primer número
		int num1;
		
		//Variable para guardar el segundo número
		int num2;
		
		//Variable para guardar la selección
		char select;
				
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
		
		//Pregunto la operación que quiere realizar
		System.out.println("Elija la operación que quiera realizar\nA.SUMAR LOS NÚMEROS\n"
				+ "B.RESTAR LOS NÚMEROS\n"
				+ "C.MULTIPLICAR LOS NÚMEROS\n"
				+ "D.DIVIDIR LOS NÚMEROS\n");
		
		//Leo

	}

}
