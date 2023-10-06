package pruebas;

public class Operaciones {
	/*constructor por defecto lo crea java si la clase no tiene constructores epsecificos
	 * 
	 * public Operaciones() {
		
	}*/
	
	public int sum( String a, int...numeros) { //cuando pones esto lo trata como un array. 2. Puedes añadirle otro argumento mientras el principal sea ultimo
		int suma=0;
		for(int num:numeros ) {
			suma+=num;
		}
		return suma;
	}
	
	//si se llama con un int, el orden de prefenrecia: 
	/*
	 * 1. coincidencia exacta
	 * 2. promocion tipos
	 * 3. autoboxing
	 * 4 nº de variable de argumentos*/
	
	public int multi(int s) {
		return 10;
	}
	public int multi (long k) {
		return 100;
	}
	public int multi (Integer n) {
		return 40;
	}
	public int multi(int...datos) {
		return 30;
	}
	public int div(int ... nums) {
		return 200;
	}
	/*public int div(int[]valores) { aqui da error porque esta poniendo dos arrays
		return 300;
	} */
}
