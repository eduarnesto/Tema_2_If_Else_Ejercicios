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
		double x1;
		
		//Variable para guardar el segundo valor de x
		double x2;
		
		//Variable para saber si se puede hacer la ecuación
		long discriminante;
				
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
		
		//Calculo el discriminante
		discriminante=(long) (Math.pow(2,b)-4*a*c);
		
		//Calculo si se puede hacer la raiz
		if(discriminante<0) {
			System.out.println("No se puede hallar el valor de x");
		} else if(a==0){
			//Si a=0 tenemos una ecuación de primer grado
			//La ecuación solo tendría una solución
			x1=(double)(-c/b);
			System.out.println("La ecuación solo tiene una solución: " +x1);
		}else {
			//El discriminante es >=0 y a no vale 0, entonces la ecuación tiene dos soluciones
			//Calculo el valor de x con el signo positivo
			x1=(float) ((-b+Math.sqrt(discriminante))/2*a);
			//Calculo el valor de x con el signo negativo
			x2=(float) ((-b-Math.sqrt(discriminante))/2*a);
			System.out.println("X vale: " + x1 + " y" + x2);
		}
		
		//Cierro el scanner
		sc.close();
	}

}
