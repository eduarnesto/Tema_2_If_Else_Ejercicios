package tema2Switch;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variable para guardar la letra del carnet
		String letraCarnet;
		
		//Variable para guardar el tipo de carnet
		String tipoCarnet;
		
		//Varibale para guardar el carnet de remolques
		String remolque = "remolques";
		
		//Varibale para guardar el carnet de autobuses
		String autobus = "autobuses";
		
		//Varibale para guardar el carnet de camion
		String camion = "camiones";
		
		//Varibale para guardar el carnet de motocicletas
		String motocicleta = "motocicletas";
		
		//Varibale para guardar el carnet de automoviles
		String automovil = "automoviles";
		
		//Creo un scanner pàra leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pregnuto por la letra del carnet de conducir
		System.out.println("¿Cuál es la letra de tu carnet de conducir?");
		
		//Leo del teclado
		letraCarnet = sc.next();
		
		//Compruebo que carnet tiene
		switch (letraCarnet) {
		case "A"->{
			tipoCarnet = motocicleta;
			System.out.println("Su permiso es de " + tipoCarnet);
		}
		case "B1-B2"->{
			tipoCarnet = automovil;
			System.out.println("Su permiso es de " + tipoCarnet);
		}
		case "C1-C5"->{
			tipoCarnet = camion;
			System.out.println("Su permiso es de " + tipoCarnet);
		}
		case "D"->{
			tipoCarnet = autobus;
			System.out.println("Su permiso es de " + tipoCarnet);
		}
		case "E"->{
			tipoCarnet = remolque;
			System.out.println("Su permiso es de " + tipoCarnet);
		}
		default -> System.out.println("Valor introducido no válido");
		}
		
		//Cierro el scanner
		sc.close();
	}

}
