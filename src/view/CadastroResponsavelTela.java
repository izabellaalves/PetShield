package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import model.Responsavel;

public class CadastroResponsavelTela extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	JTextField inputEmail = new JTextField();
	JTextArea inputEndereco = new JTextArea();
	JTextField inputTel = new JTextField();
	JTextField inputNome = new JTextField();
	JTextField telefonet = new JTextField();
	
	public CadastroResponsavelTela() {
		super("Controle de vacinas");
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 27, 351, 301);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel titulo = new JLabel("Informe seus dados");
		titulo.setBounds(80, 11, 198, 25);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		panel_1.add(titulo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblNome.setBounds(38, 66, 46, 14);
		panel_1.add(lblNome);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblEmail.setBounds(38, 100, 60, 14);
		panel_1.add(lblEmail);
		
		JLabel lblEndereco = new JLabel("Endereço");
		lblEndereco.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblEndereco.setBounds(38, 133, 79, 14);
		panel_1.add(lblEndereco);
		
		JLabel lblTel = new JLabel("Telefone");
		lblTel.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblTel.setBounds(38, 184, 79, 14);
		panel_1.add(lblTel);
		
		
		inputEmail.setBounds(127, 99, 187, 20);
		panel_1.add(inputEmail);
		inputEmail.setColumns(10);
		
		
		inputEndereco.setBounds(127, 133, 187, 36);
		panel_1.add(inputEndereco);
		
		
		inputTel.setBounds(127, 183, 187, 20);
		panel_1.add(inputTel);
		inputTel.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBackground(new Color(39, 222, 145));
		btnCadastrar.setBounds(124, 246, 115, 23);
		panel_1.add(btnCadastrar);
		
		inputNome.setBounds(127, 65, 187, 20);
		panel_1.add(inputNome);
		inputNome.setColumns(10);
		
		btnCadastrar.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						
						String c = inputNome.getText();
						String em = inputEmail.getText();
						String end = inputEndereco.getText();
						String tel = inputTel.getText();
						Double tele = Double.valueOf(tel);
						
						Responsavel responsavel2 = new Responsavel(c, em, end, tele);
						System.out.println(responsavel2.getNomeResponsavel() + " - " +  responsavel2.getEmailResponsavel());
						
						new MenuTela();
					}
					
					
				}
		);
	}

	public static void main(String[] args) {
		new CadastroResponsavelTela();
	}

}
