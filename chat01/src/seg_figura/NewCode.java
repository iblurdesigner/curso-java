package seg_figura;

import java.io.IOException;
//Fig. 11.2: DivisionEntreCeroConManejoDeExcepciones.java
// Manejo de excepciones ArithmeticException e InputMismatchException.
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewCode {

	//demuestra cómo se lanza una excepción cuando ocurre una división entre cero
	public static int cociente( int numerador, int denominador )
	throws ArithmeticException
	{
	return numerador / denominador; // posible división entre cero
	} // fin del método cociente
	static boolean continuarCiclo = false;
	static Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada boolean continuarCiclo = true; // determina si se necesitan más datos de entrada
	
	
	public static void main( String[] args )
	{	
		
		
			try // lee dos números y calcula el cociente
			{
				divi();
			} // fin de bloque try
			catch ( InputMismatchException inputMismatchException )
			{
				System.err.printf("\nExcepcion: %s\n", inputMismatchException);
				explorador.nextLine(); // descarta entrada para que el usuario intente otra vez
				System.out.println("Debe introducir enteros. Intente de nuevo.\n");
			} // fin de bloque catch
			
			catch ( ArithmeticException arithmeticException )
			{
				System.err.printf("\nExcepcion: %s\n", arithmeticException);
				System.out.println("Cero es un denominador invalido. Intente de nuevo.\n");
			}
			catch(IOException e) {
				System.out.println("Hay un problema en la logica.\n");
			}
			catch(RuntimeException e) {
				System.out.println("Hay un problema, comunicate con soporte tecnico.\n");
			}
			// fin de catch
			
			try {
				varios();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Esa posicion no existe, vuelva a intentar.\n");
			}
			
	} // fin de main
	
	static void divi() throws IOException, RuntimeException {
		System.out.print("Introduzca un numerador entero: ");
		int numerador = explorador.nextInt();
		
		System.out.print("Introduzca un denomidanor entero: ");
		int denominador = explorador.nextInt();
		int resultado = cociente( numerador, denominador );
		
		System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
		continuarCiclo = false; // entrada exitosa; termina el ciclo
	}
	static void varios() {
		final int LONGITUD_ARREGLO = 1; // declara la constante
		int[] arreglo = new int[ LONGITUD_ARREGLO ]; // crea el arreglo
		// calcula el valor para cada elemento del arreglo
		for ( int contador = 0; contador < arreglo.length; contador++ ) {
			arreglo[ contador ] = 2 + 2 * contador;
			// la lista inicializadora especifica el valor para cada elemento
			int[] arreglo1 = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
			System.out.printf("%s%8s\n", "Indice", "Valor");  // encabezados de columnas
		      // imprime el valor de cada elemento del arreglo
		      for ( int contador1 = 0; contador1 < arreglo1.length; contador1++ ) {
		    	  	System.out.printf("%5d%8d\n", contador1, arreglo1 [ contador1 ]);
		      }
		      System.out.println(arreglo1[11]);
		}	   
	}
} // fin de la clase DivisionEntreCeroConManejoDeExcepciones