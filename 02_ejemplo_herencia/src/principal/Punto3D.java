package principal;

public class Punto3D extends Punto {
	private int z;
	public Punto3D(int z) {
		
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public void dibujar() {
		System.out.print(","+getZ());
		super.dibujar(); //lama a dibujar() de Punto
	}
	
}
