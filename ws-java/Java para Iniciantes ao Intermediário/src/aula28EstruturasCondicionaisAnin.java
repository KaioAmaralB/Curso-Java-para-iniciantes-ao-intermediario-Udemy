import java.util.Scanner;

public class aula28EstruturasCondicionaisAnin {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Qual � a sua idade? ");
			int idade = entrada.nextInt();

			System.out.println("Qual seu sexo? (F/M) ");
			char sexo = entrada.next().charAt(0);

			if (idade >= 18) {

				if (sexo == 'M') {
					System.out.println("� Homem");
				} else if (sexo == 'F') {
					System.out.println("� Mulher");
				} else {
					System.out.println("Op��o Inv�lida");
				}
			} else {

				if (sexo == 'M') {
					System.out.println("� Menino");
				} else if (sexo == 'F') {
					System.out.println("� Menina");
				} else {
					System.out.println("Op��o Inv�lida");
				}

			}
		}
	}
}
