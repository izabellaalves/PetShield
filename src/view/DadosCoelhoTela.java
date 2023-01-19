package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
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

public class DadosCoelhoTela extends JFrame{
	
	CadastroResponsavelController controller = new CadastroResponsavelController();
	private JTextField inputNomeCoelho;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JLabel lblNomeCoelho;
	JComboBox<String> comboBoxMixomatose = new JComboBox<>();
	
	public DadosCoelhoTela(int i ) {
		super("Controle de vacinas");
		
		setBounds(100, 100, 500, 400);
		getContentPane().setBackground(new Color(244, 227, 157));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(66, 27, 351, 301);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(null);
		
		
		JLabel titulo = new JLabel("Dados do coelho");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(49, 11, 258, 14);
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
		
		
		inputNomeCoelho = new JTextField(controller.responsavel21.getAnimais().get(i).getNome());
		inputNomeCoelho.setBounds(65, 45, 258, 20);
		panelMenor.add(inputNomeCoelho);
		inputNomeCoelho.setColumns(10);
		
		inputDataDeNascimento = new JTextField(controller.responsavel21.getAnimais().get(i).getDataDeNascimento());
		inputDataDeNascimento.setBounds(188, 80, 135, 20);
		panelMenor.add(inputDataDeNascimento);
		inputDataDeNascimento.setColumns(10);
		
		inputSexo = new JTextField(controller.responsavel21.getAnimais().get(i).getSexo());
		inputSexo.setBounds(65, 111, 258, 20);
		panelMenor.add(inputSexo);
		inputSexo.setColumns(10);
		
		inputRaca = new JTextField(controller.responsavel21.getAnimais().get(i).getRaca());
		inputRaca.setBounds(65, 151, 258, 20);
		panelMenor.add(inputRaca);
		inputRaca.setColumns(10);
		
		
		comboBoxMixomatose.addItem("Possui");
		comboBoxMixomatose.addItem("Não possui");
		comboBoxMixomatose.setBounds(130, 191, 109, 23);
		panelMenor.add(comboBoxMixomatose);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(130, 233, 94, 23);
		panelMenor.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nC = inputNomeCoelho.getText();
				String dN = inputDataDeNascimento.getText();
				String sexo = inputSexo.getText();
				String raca = inputRaca.getText();
				String mixo = comboBoxMixomatose.getSelectedItem().toString();
				
				controller.editarDadosCachorro(i , nC, dN, sexo, raca, mixo);
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				new ListaAnimaisTela();
				dispose();
			}
		}
	);
		
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
		btnExcluir.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				controller.excluirAnimal(controller.responsavel21.getAnimais().get(i));
				JOptionPane.showMessageDialog(null, "Animal excluído com sucesso!");
				new ListaAnimaisTela();
				dispose();
			}
		}
		);
		
		JButton btnVacinas = new JButton("Vacinas");
		btnVacinas.setForeground(Color.BLACK);
		btnVacinas.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnVacinas.setBackground(new Color(39, 222, 145));
		btnVacinas.setBounds(21, 233, 99, 23);
		panelMenor.add(btnVacinas);
		btnVacinas.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				if (controller.responsavel21.getAnimais().get(i).getVacinas().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O animal não possui nenhuma vacina cadastrada.");
				} else {
				new ListaDeVacinasTela(i);
				dispose();}
			}
		}
		);
	
	JButton btnCadastrarVacina = new JButton("Cadastrar vacina");
	btnCadastrarVacina.setBounds(73, 267, 193, 23);
	panelMenor.add(btnCadastrarVacina);
	btnCadastrarVacina.setFont(new Font("Monospaced", Font.ITALIC, 13));
	btnCadastrarVacina.setForeground(new Color(0, 0, 0));
	btnCadastrarVacina.setBackground(new Color(39, 222, 145));
	btnCadastrarVacina.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CadastroVacinaTela(i);
					dispose();
				}
			}
		);
	
	JButton btnBack = new JButton("<");
	btnBack.setFont(new Font("Monospaced", Font.BOLD, 15));
	btnBack.setBounds(10, 11, 46, 29);
	getContentPane().add(btnBack);
	btnBack.setBackground(new Color(39, 222, 145));
	btnBack.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new ListaAnimaisTela();
					dispose();
				}
			}
		);
	
	}

}
