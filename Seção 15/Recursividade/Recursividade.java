public class Recursividade {

	public static void main(String args[]) {
		Mostrar(0);
	}

	public static void Mostrar(int x) {
		if (x < 5) {
			System.out.println(x);
			Mostrar(x + 1);
		}
	}
}
