package tema2Switch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variable para guardar el primer número
		float num1;
		
		//Variable para guardar el segundo número
		float num2;
		
		//Variable para guardar el resultado
		float res;
		
		//Variable para guardar la selección
		String select;
				
		//Scanner para leer el número
		Scanner sc = new Scanner(System.in);
				
		//Pregunto el primer número
		System.out.println("Introduzca un número");
				
		//Leo el número del teclado
		num1 = sc.nextFloat();
		
		//Pregunto el segundo número
		System.out.println("Introduzca otro número");
				
		//Leo el número del teclado
		num2 = sc.nextFloat();
		
		//Pregunto la operación que quiere realizar
		System.out.println("Elija la operación que quiera realizar\n"
				+ "A.SUMAR LOS NÚMEROS\n"
				+ "B.RESTAR LOS NÚMEROS\n"
				+ "C.MULTIPLICAR LOS NÚMEROS\n"
				+ "D.DIVIDIR LOS NÚMEROS");
		
		//Leo la elección
		select = sc.next();
		
		//Realizo la operación indicada
		switch (select) {
		case "A"->{
			res=num1+num2;
			System.out.println("El resultado de la operación elegida es: " + res);
		}
		case "B"->{
			res=num1-num2;
			System.out.println("El resultado de la operación elegida es: " + res);
		}
		case "C"->{
			res=num1*num2;
			System.out.println("El resultado de la operación elegida es: " + res);
		}
		case "D"->{
			if(num2!=0) {
				res=num1/num2;
				System.out.println("El resultado de la operación elegida es: " + res);
			}else {
				System.out.println("No se puede dividir por cero");
			}
		}
		default->{
			System.out.println("Elección no válida");
		}
		}
		
		//Cierro el Scanner
		sc.close();

	}

}
