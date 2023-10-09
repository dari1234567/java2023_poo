package service;

public class CuentaLimite extends Cuenta {
	
	private double limite;
	
	public CuentaLimite( double saldo, String codigoCuenta,double limite) {
		super(codigoCuenta, saldo);
		this.limite=limite;
		
	}
	
	public void ajustarLimite() {
		limite=getSaldo()/2;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void extraer(double cantidad) {
		
		if(cantidad<=limite) {
			
			super.extraer(cantidad);
		}
		else {
			super.extraer(limite);
		}
	}
	
	
	
	
	

}
