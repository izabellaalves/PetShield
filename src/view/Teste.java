package view;

import java.awt.BorderLayout;import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;

public class Teste {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste window = new Teste();
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
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.black);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.cyan);
		frame.getContentPane().add(panel);
		frame.getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(-60, 150, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame.getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(130, 233, 94, 23);
		panelMenor.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnExcluir.setForeground(Color.BLACK);
		btnExcluir.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnExcluir.setBackground(new Color(39, 222, 145));
		btnExcluir.setBounds(234, 233, 99, 23);
		panelMenor.add(btnExcluir);
		
		JLabel titulo = new JLabel("Vacinas do animal");
		titulo.setBounds(179, 27, 140, 14);
		frame.getContentPane().add(titulo);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		JButton btnVacinas = new JButton("Vacinas");
		btnVacinas.setForeground(Color.BLACK);
		btnVacinas.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnVacinas.setBackground(new Color(39, 222, 145));
		btnVacinas.setBounds(21, 233, 99, 23);
		panelMenor.add(btnVacinas);
		
		JTextField inputPorte;
		inputPorte = new JTextField(controller.responsavel21.getAnimais().get(i).toString());
		inputPorte.setBounds(73, 190, 250, 20);
		panelMenor.add(inputPorte);
		inputPorte.setColumns(10);
		
		JTextField inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(48, 64, 275, 20);
		frame.getContentPane().add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar vacina");
		btnNewButton.setBounds(73, 267, 193, 23);
		//btnCadastrar.setBackground(new Color(39, 222, 145));
		panelMenor.add(btnNewButton);
		
		JLabel titulo = new JLabel("Vacinas do animal");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(73, 11, 402, 23);
		panelMenor.add(titulo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(346, 63, 89, 21);
		btnBuscar.setBackground(new Color(39, 222, 145));
		frame.getContentPane().add(btnBuscar);
		
		
	}
}
