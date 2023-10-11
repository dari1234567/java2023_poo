package interfaces;

import java.util.Scanner;

public interface External {
	void send(String texto);
	String read();
	//incorporar um metodo estatico, queproporcione una implementacion de esta interfa,
	//con envio de datos a la pantalla y lectura desde el teclado
	
	static External of() {
		return new External() {
			
			@Override
			public void send(String texto) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String read() {
				Scanner sc=new Scanner(System.in);
				return sc.nextLine();
			}
		};
	}
	
}
