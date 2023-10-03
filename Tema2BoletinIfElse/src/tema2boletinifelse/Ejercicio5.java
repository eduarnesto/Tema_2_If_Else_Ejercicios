package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio5 {

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
				
		//Compruebo si cual es mayor
		if (num1!=num2&&num2!=num3) {
			if (num1>num2) {
				if (num2>num3) {
					System.out.println("El número " + num1 + " es mayor que " + num2 + " y este a su vez es mayor que " + num3);
				} else if (num1>num3){
						System.out.println("El número " + num1 + " es mayor que " + num3 + " y este a su vez es mayor que " + num2);
				}
			} else if (num2>num3){
				if (num1>num3) {
					System.out.println("El número " + num2 + " es mayor que " + num1 + " y este a su vez es mayor que " + num3);
			}
			}else {
				System.out.println("El número " + num3 + " es mayor que " + num2 + " y este a su vez es mayor que " + num1);
			}	
		} else if (num1==num2&&num2==num3) {
			System.out.println("Todos los números son iguales");
			} else if (num1==num2) {
				if (num1>num3){
				System.out.println("El número " + num1 + " es igual que el " + num2 + " y estos a su vez son mayor que " + num3);
				} else {
					System.out.println("El número " + num3 + " es mayor que el " + num1 + " y este es igual a " + num2);
				}
			} else if (num1==num3){
				System.out.println();
				if (num1>num2) {
				System.out.println("El número " + num1 + " es igual que el " + num3 + " y estos a su vez son mayor que " + num2);
				} else {
					System.out.println("El número " + num2 + " es mayor que el " + num1 + " y este es igual a " + num3);
				}
			} else if (num2==num1) {
				System.out.println("El número " + num2 + " es igual que el " + num3 + " y estos a su vez son mayor que " + num1);
			} else {
				System.out.println("El número " + num1 + " es mayor que el " + num2 + " y este es igual a " + num3);
			}
				
		//Cierro el scanner
		sc.close();

}
	}
