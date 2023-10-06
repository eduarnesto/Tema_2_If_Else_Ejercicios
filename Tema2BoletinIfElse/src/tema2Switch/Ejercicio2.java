package tema2Switch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variable para guardar el número
		int dia;
		
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
		
		//Pregunto el número
		System.out.println("Introduzca un número del 1 al 7");
		
		//Leo el número del teclado
		dia = sc.nextInt();
		
		//Compruebo la nota
		
		switch(dia) {
		case 1->{
			System.out.println("Lunes");
		}
		case 2->{
			System.out.println("Martes");
		}
		case 3->{
			System.out.println("Miércoles");
		}
		case 4->{
			System.out.println("Jueves");
		}
		case 5->{
			System.out.println("Viernes");
		}
		case 6->{
			System.out.println("Sábado");
		}
		case 7->{
			System.out.println("Domingo");
		}
		}
		
		//Cierro el scanner
		sc.close();
	}
}
