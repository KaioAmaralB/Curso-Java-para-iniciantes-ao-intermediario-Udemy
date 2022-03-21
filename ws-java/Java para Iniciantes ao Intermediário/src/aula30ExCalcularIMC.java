import java.util.Scanner;

public class aula30ExCalcularIMC {

	public static void main(String args[]) {

		double peso, altura, valorIMC;

		try (Scanner entrada = new Scanner(System.in)) {

			System.out.println();
			System.out.print("Digite o seu peso em kg: ");
			peso = entrada.nextDouble();

			System.out.print("Digite a sua altura em metros");
			altura = entrada.nextDouble();

			valorIMC = peso / (altura * altura);
		}

		if (valorIMC < 20) {
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Abaixo do peso.");
			System.out.println();
		} else if (valorIMC >= 20 && valorIMC <= 24) {
			System.out.println();
			System.out.println("IMC = " + valorIMC + "Normal.");
			System.out.println();
		} else if (valorIMC >= 25 && valorIMC <= 29) {
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Acima do peso.");
			System.out.println();
		} else if (valorIMC >= 30 && valorIMC <= 34) {
			System.out.println();
			System.out.println("IMC = " + valorIMC + "Obeso.");
			System.out.println();
		} else {
			System.out.println();
			System.out.println("IMC = " + valorIMC + "Muito obeso.");
			System.out.println();
		}
	}

}
