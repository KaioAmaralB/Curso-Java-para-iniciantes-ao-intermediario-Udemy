
public class aula44ArraysBidimensionaisMatrizes {

	public static void main(String args[]) {

		// int matriz[][] = new int[2][3];
		// matriz[0][0] = 1;
		// matriz[0][1] = 2;
		// matriz[0][2] = 3;
		// matriz[1][0] = 4;
		// matriz[1][1] = 5;
		// matriz[1][2] = 6;

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(matriz[i][j]);
			}
		}
	}

}
