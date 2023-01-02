package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;

public class ListaVacinasTela extends JFrame{
	
	private JTextField inputBuscarAnimal;
	
	public ListaVacinasTela() {
		super("Cadastro de vacinas");
		
		setBounds(100, 100, 500, 400);
		getContentPane().setBackground(new Color(244, 227, 157));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		JLabel titulo = new JLabel("Vacinas de NomeDoAnimal");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(38, 25, 273, 14);
		panelMenor.add(titulo);
		
		JLabel lblBuscarAnimal = new JLabel("Buscar");
		lblBuscarAnimal.setFont(new Font("Monospaced", Font.ITALIC, 15));
		lblBuscarAnimal.setBounds(38, 62, 63, 14);
		panelMenor.add(lblBuscarAnimal);
		
		inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(108, 61, 203, 20);
		panelMenor.add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		list.setToolTipText("Animal1");
		list.setBounds(38, 108, 1, 1);
		panelMenor.add(list);
		
		JButton btnCadastrarVacina = new JButton("Cadastrar vacina");
		btnCadastrarVacina.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrarVacina.setForeground(new Color(0, 0, 0));
		btnCadastrarVacina.setBackground(new Color(39, 222, 145));
		btnCadastrarVacina.setBounds(89, 247, 181, 23);
		panelMenor.add(btnCadastrarVacina);
		
		
	}

	public static void main(String[] args) {
		new ListaVacinasTela();
		
		

	}

}
