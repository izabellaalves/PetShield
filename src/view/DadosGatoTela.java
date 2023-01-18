package view;

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

public class DadosGatoTela extends JFrame{
	
	private JTextField inputNomeGato;
	private JTextField inputDataDeNascimento;
	private JTextField inputSexo;
	private JTextField inputRaca;
	private JTextField inputPelagem;
	CadastroResponsavelController controller = new CadastroResponsavelController();
	
	public DadosGatoTela(int i) {
		super("Cadastro de vacina");
		
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
		
		
		JLabel titulo = new JLabel("Dados do gato");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(49, 11, 258, 14);
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
		
		inputNomeGato = new JTextField(controller.responsavel21.getAnimais().get(i).getNome());
		inputNomeGato.setBounds(65, 45, 258, 20);
		panelMenor.add(inputNomeGato);
		inputNomeGato.setColumns(10);
		
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
		
		inputPelagem = new JTextField(controller.responsavel21.getAnimais().get(i).toString());
		inputPelagem.setBounds(94, 190, 229, 20);
		panelMenor.add(inputPelagem);
		inputPelagem.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nC = inputNomeGato.getText();
				String dN = inputDataDeNascimento.getText();
				String sexo = inputSexo.getText();
				String raca = inputRaca.getText();
				String porte = inputPelagem.getText();
				
				controller.editarDadosGato(i , nC, dN, sexo, raca, porte);
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				
				new ListaAnimaisTela();
				dispose();
			}
		}
	);
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
		new DadosGatoTela();

	}

}
