package Objetos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Classes.Shapes;

public class ShapesTest {

	public static void main(String[] args) {
		//obtém a escolha do usuário
		String input = JOptionPane.showInputDialog(
			"Enter ' to draw rectangles/n " +
			"Enter 2 to draw ovals");
		int choice = Integer.parseInt(input); //converte a entrada em int
		
		// cria o painel com a entrada do usuário
		Shapes panel = new Shapes(choice);
		
		JFrame application = new JFrame(); //cria um novo JFrame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);
	}
} //fim da classe ShapesTest