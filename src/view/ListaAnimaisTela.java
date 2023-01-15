package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;

import controllers.CadastroResponsavelController;
import model.Animal;
import model.Responsavel;

public class ListaAnimaisTela extends JFrame{
	
	private JTextField inputBuscarAnimal;
	private CadastroResponsavelController controller = new CadastroResponsavelController() ;
	
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
		panelMenor.setBounds(86, 106, 314, 216);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(new BorderLayout());
		
		
		JList list = new JList();
		list.setModel(controller.listarAnimais());
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelMenor.add(scrollPane1, BorderLayout.CENTER);
		
		
		panelMenor.add(new JScrollPane(list));
		
		JLabel titulo = new JLabel("Seus animais");
		titulo.setBounds(179, 27, 140, 14);
		getContentPane().add(titulo);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		JLabel lblBuscarAnimal = new JLabel("Buscar");
		lblBuscarAnimal.setBounds(53, 64, 63, 14);
		getContentPane().add(lblBuscarAnimal);
		lblBuscarAnimal.setFont(new Font("Monospaced", Font.ITALIC, 15));
		
		inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(126, 63, 308, 20);
		getContentPane().add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
	}
	
	

	public static void main(String[] args) {
		new ListaAnimaisTela();

	}

}
