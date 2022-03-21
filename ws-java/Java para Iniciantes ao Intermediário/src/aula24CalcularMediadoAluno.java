import java.util.Scanner;

public class aula24CalcularMediadoAluno {

	public static void main(String args[]) {

		double num1, num2, num3, media;

		try (Scanner entrada = new Scanner(System.in)) {

			System.out.print("Digite o primeiro valor: ");
			num1 = entrada.nextDouble();

			System.out.print("Digite o segundo valor: ");
			num2 = entrada.nextDouble();

			System.out.print("Digite o terceiro valor: ");
			num3 = entrada.nextDouble();

			media = (num1 + num2 + num3) / 3;
		}

		System.out.printf("O valor da média é %.2f", media);

	}

}
