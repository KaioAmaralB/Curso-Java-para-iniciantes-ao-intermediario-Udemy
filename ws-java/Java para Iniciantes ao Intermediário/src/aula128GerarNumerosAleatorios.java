import java.util.Random;

public class aula128GerarNumerosAleatorios {

	public static void main(String args[]) {

		Random rnd = new Random();

		int num1 = rnd.nextInt(6) + 1;
		long num2 = rnd.nextLong();
		double num3 = rnd.nextDouble();
		float num4 = rnd.nextFloat() * 100;
		boolean num5 = rnd.nextBoolean();

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	}

}
