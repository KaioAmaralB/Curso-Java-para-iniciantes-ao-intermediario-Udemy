import java.util.Scanner;

public class Condicao {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Qual é a idade: ");
			int idade = entrada.nextInt();

			System.out.println("Informe o sexo");
			System.out.println("1. Masculino");
			System.out.println("2. Feminino");
			System.out.print("Sexo: ");
			int sexo = entrada.nextInt();

			if (idade >= 18) {

				if (sexo == 1) {
					System.out.println("É Homem");
				} else if (sexo == 2) {
					System.out.println("É Mulher");
				} else {
					System.out.println("Opção Inválida");
				}

			} else {

				if (sexo == 1) {
					System.out.println("É Menino");
				} else if (sexo == 2) {
					System.out.println("É Menina");
				} else {
					System.out.println("Opção Inválida");
				}
			}
		}
	}
}