package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * Classe que define a tela em que tera o menu que levara o usuario para as demais funcionalidades.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class MenuTela extends JFrame{
	
	JButton btnCadastroCachorro = new JButton("Cadastrar cachorro");
	JButton btnCadastroGato = new JButton("Cadastrar gato");
	JButton btnCadastroCoelho = new JButton("Cadastrar coelho");
	JButton btnListaAnimais = new JButton("Ver seus animais");
	
	/**
	 * Metodo construtor que instancia botoes que levam o usuario para as demais telas.
	 * 
	 */
	public MenuTela() {
		super("Controle de vacinas");

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		
		JLabel titulo = new JLabel("Bem-vindo!");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(126, 32, 140, 14);
		panelMenor.add(titulo);
		
		btnCadastroCachorro.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnCadastroCachorro.setBackground(new Color(39, 222, 145));
		btnCadastroCachorro.setBounds(54, 81, 236, 23);
		panelMenor.add(btnCadastroCachorro);
		btnCadastroCachorro.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CadastroCachorroTela();
					setVisible(false);
				}
			}
		);
		
		
		btnCadastroGato.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnCadastroGato.setBackground(new Color(39, 222, 145));
		btnCadastroGato.setBounds(54, 130, 236, 23);
		panelMenor.add(btnCadastroGato);
		btnCadastroGato.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new CadastroGatoTela();
						setVisible(false);
					}
				}
			);
		
		
		btnCadastroCoelho.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnCadastroCoelho.setBackground(new Color(39, 222, 145));
		btnCadastroCoelho.setBounds(54, 181, 236, 23);
		panelMenor.add(btnCadastroCoelho);
		btnCadastroCoelho.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new CadastroCoelhoTela();
						setVisible(false);
					}
				}
			);
		
		
		btnListaAnimais.setFont(new Font("Monospaced", Font.ITALIC, 16));
		btnListaAnimais.setBackground(new Color(39, 222, 145));
		btnListaAnimais.setBounds(54, 238, 236, 23);
		panelMenor.add(btnListaAnimais);
		btnListaAnimais.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new ListaAnimaisTela();
						setVisible(false);
					}
				}
			);
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
