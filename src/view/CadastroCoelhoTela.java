package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import controllers.CadastroResponsavelController;

/**
 * Classe que define a tela em que e possivel cadastrar um objeto do tipo coelho.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class CadastroCoelhoTela extends JFrame implements ActionListener{

	
	private JTextField inputNomeCoelho;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JLabel lblNomeCoelho;
	JComboBox<String> comboBoxMixomatose = new JComboBox<>();
	
	/**
	 * Metodo construtor que define as entradas de dados necessarias para o cadastro e o botao para envio do formulario.
	 * 
	 */
	public CadastroCoelhoTela() {
		super ("Cadastro de vacinas");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		JLabel titulo = new JLabel("Informe os dados do coelho");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(37, 11, 308, 25);
		panelMenor.add(titulo);
		
		lblNomeCoelho = new JLabel("Nome");
		lblNomeCoelho.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNomeCoelho.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNomeCoelho.setBounds(23, 47, 32, 14);
		panelMenor.add(lblNomeCoelho);
		
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
		
		JLabel vacinaMixomatose = new JLabel("Mixomatose");
		vacinaMixomatose.setHorizontalAlignment(SwingConstants.RIGHT);
		vacinaMixomatose.setFont(new Font("Monospaced", Font.PLAIN, 14));
		vacinaMixomatose.setBounds(23, 194, 80, 14);
		panelMenor.add(vacinaMixomatose);
		
		inputNomeCoelho = new JTextField();
		inputNomeCoelho.setBounds(65, 45, 258, 20);
		panelMenor.add(inputNomeCoelho);
		inputNomeCoelho.setColumns(10);
		
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
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBackground(new Color(39, 222, 145));
		btnCadastrar.setBounds(124, 267, 115, 23);
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
		
		comboBoxMixomatose.addItem("Possui");
		comboBoxMixomatose.addItem("Não possui");
		comboBoxMixomatose.setBounds(130, 191, 109, 23);
		panelMenor.add(comboBoxMixomatose);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Metodo herdado de ActionListner, o qual recebe os dados e gera um objeto do tipo coelho.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String nC = inputNomeCoelho.getText();
		String dN = inputDataDeNascimento.getText();
		String sexo = inputSexo.getText();
		String raca = inputRaca.getText();
		
		String mixo = comboBoxMixomatose.getSelectedItem().toString(); 
		
		Boolean mixomatose;
		
		if (mixo == "Possui") {
			mixomatose = true;
		}else {
			mixomatose = false;
		}
		
		CadastroResponsavelController cadastroResponsavelController = new CadastroResponsavelController();
		cadastroResponsavelController.cadastrarCoelho(nC, dN, sexo, raca, mixomatose);
		
		this.setVisible(false);
		new MenuTela();
		JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
			
		
	}

}
