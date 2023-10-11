package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

//suma los pares de la lista

public class ManipulacionesService {
	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}
	
	///suma los positivos de la lista
	
	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer in:numeros) {
			if(in>0) {
				suma+=in;
			}
		}
		return suma;
	}*/
	
	//creamos un metodo que sirva para sumaer los numeros de la coleccion que cumplan el criterio
	
	public int sumarCriterio(List<Integer> numeros, Predicate<Integer> criterio) {
		int suma=0;
		for(Integer in:numeros) {
			if(criterio.test(in)) {
				suma+=in;
			}
		}
		return suma;
	}
	
	//metodo que recibe lista de enteros y lo imprime
	//metodo que recbibe lista de enteros y los guarda en fichero
	//metodo que recibe una lista de enteros y lo manda a la nube
	
	 public void procesaLista(List<Integer> numeros, Consumer<Integer> consumer) {
		for(Integer n:numeros) {
			consumer.accept(n);
		}
	}
	//metodo que recibe una lista de enteros e imprime los pares
	 //metodo que recibe un conjunto de enteros y guarda en un fichero los positivos
	 //metodo que recibe una lista de enteros
	 
	 public void procesaColeccionPorCriterio (Collection<Integer> numeros,
			 Predicate<Integer> criterio,
			 Consumer<Integer> proceso) {
		 for(Integer n:numeros) {
			 if(criterio.test(n)) {
				 proceso.accept(n);
			 }
		 }
	 }
	
	//metodo que recibe una coleccion y devuelve la suma de los cuadrados de esos numeros
	//metodo que recibe una coleccion y devuelve la suma de las raices cubicas de esos numeros
	 
	 public int sumaTransformacion(Collection <Integer> numeros, UnaryOperator<Integer> fun) {
		 
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);
		}
		return suma;
		 
	 }
}
