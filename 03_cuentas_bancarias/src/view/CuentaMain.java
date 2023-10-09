package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaLimite;
import service.CuentaMovimientos;

public class CuentaMain {

	static CuentaMovimientos cuentaMov;
	
	
public static void main(String[] args) {
	String codigo;
	double saldo,limite;
	Scanner sc=new Scanner(System.in);
	System.out.println("introduce codigo");
	codigo=sc.nextLine();
	System.out.println("introduce saldo");
	saldo=Double.parseDouble(sc.nextLine());
	System.out.println("introduce limite");
	limite=Double.parseDouble(sc.nextLine());
	int opcion;
		
		do {
			
			
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					ingresar();
					break;
				case 2:
					extraer();
					break;
				case 3:
					mostrarMovimientos();
					break;				
				case 4:
					System.out.println("---Adios---");
			}
		}while(opcion!=4);

	}

	static void mostrarMenu() {
		System.out.println("1.- Ingresar");
		System.out.println("2.- Extraer");
		System.out.println("3.- Mostrar movimientos");
		System.out.println("4.- Salir");
	}
	
	static void ingresar() {
		Scanner sc=new Scanner (System.in);
		double cantidad;
		System.out.println("introduce una cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentaMov.ingresar(cantidad);
	}
	
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentaMov.extraer(cantidad);
	}
	static void mostrarMovimientos() {
		ArrayList<Movimiento> movs=cuentaMov.obtenerMovimientos();
		for(Movimiento m:movs) {
			System.out.println("Tipo:"+m.getTipo()+" Cantiad:"+m.getCantidad()+" Fecha:"+m.getFechaMovimiento());
		}
		System.out.println("Saldo final: "+cuentaMov.getSaldo());
	}
	
	
	
}
