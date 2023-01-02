package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class DadosCoelhoTela extends JFrame{
	
	// JLABEL DA VACINA HEMORRAGICA DO COELHO N APARECE 
	
	
	private JTextField inputNomeCoelho;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JLabel lblNomeCoelho;
	
	public DadosCoelhoTela() {
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
		
		
		JLabel titulo = new JLabel("Dados de NomeDoCoelho");
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
		
		JRadioButton rdbtnMixomatose = new JRadioButton("Não possui");
		rdbtnMixomatose.setFont(new Font("Monospaced", Font.PLAIN, 11));
		rdbtnMixomatose.setBounds(130, 191, 109, 23);
		panelMenor.add(rdbtnMixomatose);
		
		JRadioButton rdbtnHemorragica = new JRadioButton("Possui");
		rdbtnHemorragica.setFont(new Font("Monospaced", Font.PLAIN, 11));
		rdbtnHemorragica.setBounds(236, 191, 109, 23);
		panelMenor.add(rdbtnHemorragica);
		
		JLabel vacinaHemorragica = new JLabel("Hemorragica");
		vacinaHemorragica.setHorizontalAlignment(SwingConstants.RIGHT);
		vacinaHemorragica.setFont(new Font("Monospaced", Font.PLAIN, 14));
		vacinaHemorragica.setBounds(10, 227, 101, 20);
		panelMenor.add(vacinaHemorragica);
		
		JRadioButton rdbtnMixomatose_1 = new JRadioButton("Não possui");
		rdbtnMixomatose_1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		rdbtnMixomatose_1.setBounds(130, 224, 109, 23);
		panelMenor.add(rdbtnMixomatose_1);
		
		JRadioButton rdbtnHemorragica_1 = new JRadioButton("Possui");
		rdbtnHemorragica_1.setFont(new Font("Monospaced", Font.PLAIN, 11));
		rdbtnHemorragica_1.setBounds(236, 224, 109, 23);
		panelMenor.add(rdbtnHemorragica_1);
		
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(23, 258, 94, 23);
		panelMenor.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setForeground(Color.BLACK);
		btnExcluir.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnExcluir.setBackground(new Color(39, 222, 145));
		btnExcluir.setBounds(130, 258, 99, 23);
		panelMenor.add(btnExcluir);
		
		JButton btnVacinas = new JButton("Vacinas");
		btnVacinas.setForeground(Color.BLACK);
		btnVacinas.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnVacinas.setBackground(new Color(39, 222, 145));
		btnVacinas.setBounds(236, 258, 99, 23);
		panelMenor.add(btnVacinas);
	}

	public static void main(String[] args) {
		new DadosCoelhoTela();

	}

}
