package principal;

interface Printer{
	void print(String cad);
	
	static Printer of() {
		//cereamos un objeto que impelenta la intefaz mediante una clase anonima
		return new Printer() {
			@Override
			public void print (String cad) {
				System.out.println(cad);
			}
		};
	}
}

public class Test3 {

	public static void main(String[] args) {
		Printer pr=Printer.of();
		System.out.println();
	}

}
