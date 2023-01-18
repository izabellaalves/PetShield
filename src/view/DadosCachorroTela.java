package view;

import java.awt.Color;
import controllers.*;
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

public class DadosCachorroTela extends JFrame implements ActionListener{
	
	CadastroResponsavelController controller = new CadastroResponsavelController();
	
	private JTextField inputNomeCachorro;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JTextField inputPorte;
	JButton btnSalvar = new JButton("Salvar");
	
	public DadosCachorroTela(int i) {
		super("Cadastro de vacinas");
		
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
		
		
		JLabel titulo = new JLabel("Dados do cachorro");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(49, 11, 258, 14);
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
		
		
		inputNomeCachorro = new JTextField(controller.responsavel21.getAnimais().get(i).getNome());
		inputNomeCachorro.setBounds(65, 45, 258, 20);
		inputNomeCachorro.setColumns(10);
		panelMenor.add(inputNomeCachorro);
		
		
		inputDataDeNascimento = new JTextField(controller.responsavel21.getAnimais().get(i).getDataDeNascimento());
		inputDataDeNascimento.setBounds(188, 80, 135, 20);
		inputDataDeNascimento.setColumns(10);
		panelMenor.add(inputDataDeNascimento);
		
		inputSexo = new JTextField(controller.responsavel21.getAnimais().get(i).getSexo());
		inputSexo.setBounds(65, 111, 258, 20);
		panelMenor.add(inputSexo);
		inputSexo.setColumns(10);
		
		inputRaca = new JTextField(controller.responsavel21.getAnimais().get(i).getRaca());
		inputRaca.setBounds(65, 151, 258, 20);
		panelMenor.add(inputRaca);
		inputRaca.setColumns(10);
		
		inputPorte = new JTextField(controller.responsavel21.getAnimais().get(i).toString());
		inputPorte.setBounds(73, 190, 250, 20);
		panelMenor.add(inputPorte);
		inputPorte.setColumns(10);
		
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setForeground(new Color(0, 0, 0));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(130, 233, 94, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nC = inputNomeCachorro.getText();
				String dN = inputDataDeNascimento.getText();
				String sexo = inputSexo.getText();
				String raca = inputRaca.getText();
				String porte = inputPorte.getText();
				
				controller.editarDadosCachorro(i , nC, dN, sexo, raca, porte);
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				new ListaAnimaisTela();
				dispose();
			}
		}
	);
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
	
	

	public static void main(String[] args) {
		new DadosCachorroTela();

	}

}
