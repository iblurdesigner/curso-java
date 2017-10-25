package findLineal;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Forma_secuencial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int enteroBusqueda;
		int posicion;
		
		ArregloLineal arregloBusqueda = new ArregloLineal(10);
		System.out.println(arregloBusqueda + "/n");
		
		System.out.print("Escriba un valor entero (-1 para terminar): ");
		enteroBusqueda = entrada.nextInt();
		
		while(enteroBusqueda != -1) {
			posicion = arregloBusqueda.busquedaLineal(enteroBusqueda);
			
			if(posicion == -1)
				System.out.println("El entero " + enteroBusqueda + " no se encontro. \n");
			else
				System.out.println("El entero " + enteroBusqueda + " se encontro en la posicion " + posicion + ".\n");
			
			System.out.print("Escriba un valor entero (-1 para terminar): ");
			enteroBusqueda = entrada.nextInt();
		}
	}

}
