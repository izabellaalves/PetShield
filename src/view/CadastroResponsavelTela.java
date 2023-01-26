package view;
import controllers.CadastroResponsavelController;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import model.Responsavel;

/**
 * Classe que define a tela inicial do projeto, a qual serve para cadastrar o responsavel que controlara o funcionamento da aplicaçao.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class CadastroResponsavelTela extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField inputEmail = new JTextField();
	private JTextArea inputEndereco = new JTextArea();
	private JTextField inputTel = new JTextField();
	private JTextField inputNome = new JTextField();
	JButton btnCadastrar = new JButton("Cadastrar");
	JTextField telefonet = new JTextField();
	
	/**
	 * Metodo construtor que define os espacos para a entrada de dados do responsavel e o botao para envio do formulario.
	 * 
	 */
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
		titulo.setBounds(80, 11, 200, 25);
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
		
		
		getInputEmail().setBounds(127, 99, 187, 20);
		panel_1.add(getInputEmail());
		getInputEmail().setColumns(10);
		
		
		getInputEndereco().setBounds(127, 133, 187, 36);
		panel_1.add(getInputEndereco());
		
		
		getInputTel().setBounds(127, 183, 187, 20);
		panel_1.add(getInputTel());
		getInputTel().setColumns(10);
		
		
		btnCadastrar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrar.setForeground(new Color(0, 0, 0));
		btnCadastrar.setBackground(new Color(39, 222, 145));
		btnCadastrar.setBounds(124, 246, 115, 23);
		panel_1.add(btnCadastrar);
		
		getInputNome().setBounds(127, 65, 187, 20);
		panel_1.add(getInputNome());
		getInputNome().setColumns(10);
		
		btnCadastrar.addActionListener(this);
	}

	public static void main(String[] args) {
		new CadastroResponsavelTela();
	}

	public JTextField getInputNome() {
		return inputNome;
	}

	public void setInputNome(JTextField inputNome) {
		this.inputNome = inputNome;
	}

	public JTextField getInputEmail() {
		return inputEmail;
	}

	public void setInputEmail(JTextField inputEmail) {
		this.inputEmail = inputEmail;
	}

	public JTextArea getInputEndereco() {
		return inputEndereco;
	}

	public void setInputEndereco(JTextArea inputEndereco) {
		this.inputEndereco = inputEndereco;
	}

	public JTextField getInputTel() {
		return inputTel;
	}

	public void setInputTel(JTextField inputTel) {
		this.inputTel = inputTel;
	}

	/**
	 * Metodo herdado de ActionListner, o qual recebe os dados e cadastra um responsavel.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object src = e.getSource();
		
		String c = getInputNome().getText();
		String em = getInputEmail().getText();
		String end = getInputEndereco().getText();
		String tel = getInputTel().getText();
		Double tele = Double.valueOf(tel);
		
		if (src == btnCadastrar) {
			CadastroResponsavelController cadastroResponsavelController = new CadastroResponsavelController();
			cadastroResponsavelController.cadastrarResponsavel(c, em, end, tele);
		}
		
		this.setVisible(false);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		
	}

}
