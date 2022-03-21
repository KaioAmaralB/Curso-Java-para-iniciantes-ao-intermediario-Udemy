import java.util.Scanner;

public class aula15ClasseScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Capturar números inteiros
		System.out.print("Digite um ano: ");
		int ano = entrada.nextInt();
		System.out.println(ano);

		// Capturar números reais
		System.out.print("Digite um número decimal: ");
		float num = entrada.nextFloat();
		System.out.println(num);

		// Capturar String
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println(nome);

		entrada.close();
	}

}
