package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tessstando {

	private JFrame frame;
	private JTextField inputBuscarAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tessstando window = new Tessstando();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tessstando() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(244, 227, 157));
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		frame.getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(86, 106, 314, 216);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		/*
		JList list = new JList();
		list.setModel(controller.listarAnimais());
		JScrollPane scrollPane1 = new JScrollPane(list);
		list.setBounds(108, 61, 203, 20);
		*/
		
		
		//panelMenor.add(new JScrollPane(list));
		
		JLabel titulo = new JLabel("Seus animais");
		titulo.setBounds(179, 27, 140, 14);
		frame.getContentPane().add(titulo);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		JLabel lblBuscarAnimal = new JLabel("Buscar");
		lblBuscarAnimal.setBounds(53, 64, 63, 14);
		frame.getContentPane().add(lblBuscarAnimal);
		lblBuscarAnimal.setFont(new Font("Monospaced", Font.ITALIC, 15));
		
		inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(126, 63, 308, 20);
		frame.getContentPane().add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
	
	}
}
