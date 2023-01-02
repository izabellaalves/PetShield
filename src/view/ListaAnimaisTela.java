package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;

public class ListaAnimaisTela extends JFrame{
	
	private JTextField inputBuscarAnimal;
	
	public ListaAnimaisTela() {
		super("Controle de vacinas");
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		JLabel titulo = new JLabel("Seus animais");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(108, 26, 140, 14);
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
	}

	public static void main(String[] args) {
		new ListaAnimaisTela();

	}

}
