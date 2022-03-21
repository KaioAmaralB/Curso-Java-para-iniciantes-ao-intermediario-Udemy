import javax.swing.*;
import java.awt.*;

public class aula68LabelsEtiquetasSwingJLabel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label1;
	private JLabel labelImg;

	public aula68LabelsEtiquetasSwingJLabel() {

		Font letra = new Font("Verdana", Font.ITALIC, 36);

		label1 = new JLabel("Minha label");
		label1.setBounds(10, 20, 500, 100);
		label1.setFont(letra);
		label1.setForeground(Color.blue);
		label1.setBackground(Color.yellow);
		label1.setOpaque(true);
		add(label1);

		Icon imagem = new ImageIcon(
				"E:\\Documents\\Estudos\\Cursos - Porto Seguro\\Java - Udemy\\Java Para Iniciantes ao Intermedíario - Udemy\\ws-eclipse-JavaIniInter\\Java-Iniciantes-Intermediario\\bin/icone.png");

		labelImg = new JLabel(imagem);
		labelImg.setBounds(20, 150, 400, 200);
		add(labelImg);

	}

	public static void main(String args[]) {
		aula68LabelsEtiquetasSwingJLabel form = new aula68LabelsEtiquetasSwingJLabel();
		form.setLayout(null);
		form.setBounds(0, 0, 700, 500);
		form.setLocationRelativeTo(null);
		form.setVisible(true);
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
		form.setTitle("Aula sobre JLabel");

	}

}
