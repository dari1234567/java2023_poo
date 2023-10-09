package p2;

import p1.Uno;

public class Dos extends Uno {
	public void metodo() {
		a=3;
		b=5;
		c=10;
		d=20;
		Uno uno = new Uno();
		uno.d=40; // solo a la publica
		uno.c=6; //esto no, solo deja a traves de herencia
	}
}
