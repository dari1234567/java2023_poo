package principal;

import java.util.List;

class Datos{
	//Metodos que nos devuelva una lista con los 10 primeros numeros enteros
	
	public List<Integer> numeros(){
		return List.of(1,2,3,4,5,6,7,8,9,10); //((inmutables))
	}
}

public class Test2 {

	public static void main(String[] args) {
		Datos dt=new Datos();
		List<Integer> nums = dt.numeros();
		for(Integer n:nums) {
			System.out.println(n);
		}

	}

}
