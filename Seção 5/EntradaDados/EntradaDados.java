import java.util.Scanner;

public class EntradaDados {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Digite seu nome: ");
			String nome = entrada.nextLine();

			System.out.println("Seja bem vindo " + nome);
		}

		// System.out.print("Digite o ano: ");
		// int ano = entrada.nextInt();

		// System.out.println("O ano é: " + ano);

		/*
		 * System.out.print("Digite um valor: "); float valor = entrada.nextFloat();
		 * 
		 * System.out.println("O valor é: " + valor);
		 */
	}
}
