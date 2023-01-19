package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import controllers.CadastroCachorroController;
import controllers.CadastroResponsavelController;
import model.Cachorro;
import model.Responsavel;

public class CadastroCachorroTela extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField inputNomeCachorro;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JTextField inputPorte;
	protected Responsavel responsavel2;
	
	public CadastroCachorroTela() {
		super("Controle de vacinas");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		
		JLabel titulo = new JLabel("Informe os dados do cachorro");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(23, 11, 318, 14);
		panelMenor.add(titulo);
		
		JLabel lblNomeCachorro = new JLabel("Nome");
		lblNomeCachorro.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblNomeCachorro.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNomeCachorro.setBounds(23, 47, 32, 14);
		panelMenor.add(lblNomeCachorro);
		
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
		
		JLabel lblPorte = new JLabel("Porte");
		lblPorte.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPorte.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblPorte.setBounds(23, 192, 40, 14);
		panelMenor.add(lblPorte);
		
		inputNomeCachorro = new JTextField();
		inputNomeCachorro.setBounds(65, 45, 258, 20);
		panelMenor.add(inputNomeCachorro);
		inputNomeCachorro.setColumns(10);
		
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
		
		inputPorte = new JTextField();
		inputPorte.setBounds(73, 190, 250, 20);
		panelMenor.add(inputPorte);
		inputPorte.setColumns(10);
		
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
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nC = inputNomeCachorro.getText();
		String dN = inputDataDeNascimento.getText();
		String sexo = inputSexo.getText();
		String raca = inputRaca.getText();
		String porte = inputPorte.getText();
		
		CadastroResponsavelController cadastroResponsavelController = new CadastroResponsavelController();
		cadastroResponsavelController.cadastrarCachorro(nC, dN, sexo, raca, porte);
		
		this.setVisible(false);
		JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");
			
	}

}
