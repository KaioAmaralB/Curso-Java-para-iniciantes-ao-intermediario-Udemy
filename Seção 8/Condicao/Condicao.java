import java.util.Scanner;

public class Condicao {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Qual � a idade: ");
			int idade = entrada.nextInt();

			System.out.println("Informe o sexo");
			System.out.println("1. Masculino");
			System.out.println("2. Feminino");
			System.out.print("Sexo: ");
			int sexo = entrada.nextInt();

			if (idade >= 18) {

				if (sexo == 1) {
					System.out.println("� Homem");
				} else if (sexo == 2) {
					System.out.println("� Mulher");
				} else {
					System.out.println("Op��o Inv�lida");
				}

			} else {

				if (sexo == 1) {
					System.out.println("� Menino");
				} else if (sexo == 2) {
					System.out.println("� Menina");
				} else {
					System.out.println("Op��o Inv�lida");
				}
			}
		}
	}
}