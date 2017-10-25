package findLineal;

import java.util.Random;
import java.util.Arrays;

public class ArregloLineal {
	private int[] datos;
	private static final Random generador = new Random();
	
	public ArregloLineal(int tamanio) {
		datos = new int[tamanio];
		
		for(int i=0; i< tamanio; i++)
			datos[i] = 10 + generador.nextInt(90);
	}
	
	public int busquedaLineal(int claveBusqueda) {
		for(int indice = 0; indice < datos.length; indice++)
			if(datos [indice] == claveBusqueda )
				return indice;
		return -1;
	}
	
	public String toString() {
		return Arrays.toString(datos);
	}
}
