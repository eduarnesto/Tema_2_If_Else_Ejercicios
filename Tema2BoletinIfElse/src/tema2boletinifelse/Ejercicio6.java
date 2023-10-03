package tema2boletinifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Variable para guardar el valor de a
		float a;
		
		//Variable para guardar el valor de b
		float b;
		
		//Variable para guardar el valor de c
		float c;
		
		//Variable para guardar el primer valor de x
		float x1;
		
		//Variable para guardar el segundo valor de x
		float x2;
				
		//Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregunto por el valor de a
		System.out.println("Introduzca el valor de a");
		
		//Leo del teclado el valor de a
		a = sc.nextFloat();
		 
		//Pregunto por el valor de b
		System.out.println("Introduzca el valor de b");
			
		//Leo del teclado el valor de b
		b = sc.nextFloat();
			 
		//Pregunto por el valor de c
		System.out.println("Introduzca el valor de c");
				
		//Leo del teclado el valor de c
		c = sc.nextFloat();
		
		//Calculo si se puede hacer la raiz
		if(Math.pow(2,b)-4*a*c>=0) {
			//Calculo el valor de x con el signo positivo
			x1=(float) ((-b+Math.sqrt((Math.pow(2,b)-4*a*c)))/2*a);
			//Calculo el valor de x con el signo negativo
			x2=(float) ((-b-Math.sqrt((Math.pow(2,b)-4*a*c)))/2*a);
			System.out.println("X vale: " + x1 + " y" + x2);
		} else {
			System.out.println("No se puede hallar el valor de x");
		}
		
		//Cierro el scanner
		sc.close();
	}

}
