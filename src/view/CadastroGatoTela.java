package view;
import controllers.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import controllers.CadastroResponsavelController;

public class CadastroGatoTela extends JFrame implements ActionListener{
	
	private JTextField inputNomeGato;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JTextField inputPelagem;
	
	public CadastroGatoTela() {
		super("Cadastro de vacinas");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		
		JLabel titulo = new JLabel("Informe os dados do gato");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(37, 11, 279, 25);
		panelMenor.add(titulo);
		
		JLabel lblNomeGato = new JLabel("Nome");
		lblNomeGato.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNomeGato.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNomeGato.setBounds(23, 47, 32, 14);
		panelMenor.add(lblNomeGato);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataDeNascimento.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(23, 82, 155, 14);
		panelMenor.add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblSexo.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblSexo.setBounds(23, 113, 32, 14);
		panelMenor.add(lblSexo);
		
		JLabel lblRaca = new JLabel("Raça");
		lblRaca.setHorizontalAlignment(SwingConstants.TRAILING);
		lblRaca.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblRaca.setBounds(23, 153, 32, 14);
		panelMenor.add(lblRaca);
		
		JLabel lblPorte = new JLabel("Pelagem");
		lblPorte.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPorte.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblPorte.setBounds(23, 192, 56, 14);
		panelMenor.add(lblPorte);
		
		inputNomeGato = new JTextField();
		inputNomeGato.setBounds(65, 45, 258, 20);
		panelMenor.add(inputNomeGato);
		inputNomeGato.setColumns(10);
		
		inputDataDeNascimento = new JTextField();
		inputDataDeNascimento.setBounds(188, 80, 135, 20);
		panelMenor.add(inputDataDeNascimento);
		inputDataDeNascimento.setColumns(10);
		
		inputSexo = new JTextField();
		inputSexo.setBounds(65, 111, 258, 20);
		panelMenor.add(inputSexo);
		inputSexo.setColumns(10);
		
		inputRaca = new JTextField();
		inputRaca.setBounds(65, 151, 258, 20);
		panelMenor.add(inputRaca);
		inputRaca.setColumns(10);
		
		inputPelagem = new JTextField();
		inputPelagem.setBounds(94, 190, 229, 20);
		panelMenor.add(inputPelagem);
		inputPelagem.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBackground(new Color(39, 222, 145));
		btnCadastrar.setBounds(124, 246, 115, 23);
		panelMenor.add(btnCadastrar);
		btnCadastrar.addActionListener(this);

		JButton btnBack = new JButton("<");
		btnBack.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBack.setBounds(10, 11, 46, 29);
		getContentPane().add(btnBack);
		btnBack.setBackground(new Color(39, 222, 145));
		btnBack.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						new MenuTela();
						dispose();
					}
				}
			);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nC = inputNomeGato.getText();
		String dN = inputDataDeNascimento.getText();
		String sexo = inputSexo.getText();
		String raca = inputRaca.getText();
		String porte = inputPelagem.getText();
		
		CadastroResponsavelController cadastroResponsavelController = new CadastroResponsavelController();
		cadastroResponsavelController.cadastrarGato(nC, dN, sexo, raca, porte);
		
		this.setVisible(false);
		JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
			
	}
	
	
}
