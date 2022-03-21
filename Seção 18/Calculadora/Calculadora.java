public class Calculadora {

	public static void main(String args[]) {

		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[2]);

		String operacao = args[1];

		double resultado = 0;

		switch (operacao) {
		default:
			System.out.println("Opera��o Inv�lida");
			break;
		case "+":
			resultado = num1 + num2;
			System.out.println("O Resultado da Soma �: " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println("O Resultado da Subtra��o �: " + resultado);
			break;
		case "x":
		case "X":
			resultado = num1 * num2;
			System.out.println("O Resultado da Multiplica��o �: " + resultado);
			break;
		case "/":
		case ":":
			if (num2 == 0) {
				System.out.println("N�o � poss�vel dividir por zero.");
			} else {
				resultado = num1 / num2;
				System.out.println("O Resultado da Divis�o �: " + resultado);
			}
			break;
		}
	}
}
