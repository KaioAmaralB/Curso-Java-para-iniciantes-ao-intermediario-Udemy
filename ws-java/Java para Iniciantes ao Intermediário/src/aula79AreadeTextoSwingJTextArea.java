import javax.swing.*;

public class aula79AreadeTextoSwingJTextArea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea txt;

	public aula79AreadeTextoSwingJTextArea() {

		txt = new JTextArea();
		txt.setBounds(20, 50, 400, 300);
		add(txt);

	}

	public static void main(String args[]) {

		aula79AreadeTextoSwingJTextArea form = new aula79AreadeTextoSwingJTextArea();
		form.setLayout(null);
		form.setBounds(100, 200, 600, 400);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setResizable(false);
		form.setLocationRelativeTo(null);
		form.setTitle("Minha Aplicação Gráfica");

	}

}
