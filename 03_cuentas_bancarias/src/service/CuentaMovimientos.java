package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimiento;

public class CuentaMovimientos extends CuentaLimite {

	ArrayList<Movimiento> movimientos = new ArrayList<>();

	public CuentaMovimientos(double saldo, String codigoCuenta, double limite) {
		super(saldo, codigoCuenta, limite);
		
	}
	
	public ArrayList<Movimiento> obtenerMovimientos(){
	
		return movimientos;
		
	}

	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad, LocalDateTime.now(),"extraccion"));
		super.extraer(cantidad);
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad, LocalDateTime.now(),"ingreso"));
		super.ingresar(cantidad);
	}
	
	
		

}
			

