import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Senha extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField campoSenha;
	private JButton btnExecutar;

	public Senha() {

		Font letra = new Font("Arial", Font.BOLD, 18);

		campoSenha = new JTextField("");
		campoSenha.setBounds(50, 50, 400, 40);
		campoSenha.setFont(letra);
		add(campoSenha);

		btnExecutar = new JButton("Gerar Senha");
		btnExecutar.setBounds(250, 150, 200, 40);
		btnExecutar.setFont(letra);
		add(btnExecutar);
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campoSenha.setText("");
				campoSenha.setText(geraSenha(10));
			}
		});
	}

	public String geraSenha(int tamanho) {
		String senha = "";
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$?";

		Random rnd = new Random(new Random().nextLong());

		for (int i = 0; i < tamanho; i++) {
			int index = rnd.nextInt(caracteres.length() - 1);
			senha += caracteres.substring(index, index + 1);
		}

		return senha;
	}

	public static void main(String[] args) {

		Senha form = new Senha();
		form.setLayout(null);
		form.setBounds(0, 0, 500, 300);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setTitle("Senha aleatória");
	}

	public String geraSenha() {
		String senha = "1234";

		return senha;
	}
}