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
import javax.swing.border.BevelBorder;

import controllers.CadastroResponsavelController;

public class CadastroVacinaTela extends JFrame{
	
	CadastroResponsavelController controller = new CadastroResponsavelController();
	private JTextField inputTipo;
	private JTextField inputData;
	
	public CadastroVacinaTela(int i) {
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
		
		JLabel titulo = new JLabel("Cadastrar vacina");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(80, 25, 183, 14);
		panelMenor.add(titulo);
		
		JLabel lblTipoVacina = new JLabel("Tipo");
		lblTipoVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblTipoVacina.setBounds(38, 62, 63, 19);
		panelMenor.add(lblTipoVacina);
		
		inputTipo = new JTextField();
		inputTipo.setBounds(108, 61, 203, 20);
		panelMenor.add(inputTipo);
		inputTipo.setColumns(10);
		
		JButton btnCadastrarVacina = new JButton("Cadastrar");
		btnCadastrarVacina.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnCadastrarVacina.setForeground(new Color(0, 0, 0));
		btnCadastrarVacina.setBackground(new Color(39, 222, 145));
		btnCadastrarVacina.setBounds(108, 248, 136, 23);
		panelMenor.add(btnCadastrarVacina);
		btnCadastrarVacina.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String tipo = inputTipo.getText();
						String data = inputData.getText();
						
						CadastroResponsavelController cadastroResponsavelController = new CadastroResponsavelController();
						cadastroResponsavelController.cadastrarVacina(tipo, data, i);
						
						JOptionPane msg = new JOptionPane("Vacina cadastrada com sucesso!");
						if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Cachorro") {
							new DadosCachorroTela(i);
						} else if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Gato") {
							new DadosGatoTela(i);
						} else if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Coelho") {
							new DadosCoelhoTela(i);
						}
						setVisible(false);
					}
				}
			);
		
		JLabel lblDataVacina = new JLabel("Data");
		lblDataVacina.setForeground(new Color(0, 0, 0));
		lblDataVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblDataVacina.setBounds(38, 103, 63, 19);
		panelMenor.add(lblDataVacina);
		
		inputData = new JTextField();
		inputData.setColumns(10);
		inputData.setBounds(108, 104, 203, 20);
		panelMenor.add(inputData);
		
		JButton btnBack = new JButton("<");
		btnBack.setFont(new Font("Monospaced", Font.BOLD, 15));
		btnBack.setBounds(10, 11, 46, 29);
		getContentPane().add(btnBack);
		btnBack.setBackground(new Color(39, 222, 145));
		btnBack.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Cachorro") {
							new DadosCachorroTela(i);
						} else if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Gato") {
							new DadosGatoTela(i);
						} else if (controller.responsavel21.getAnimais().get(i).getEspecie() == "Coelho") {
							new DadosCoelhoTela(i);
						}
						dispose();
					}
				}
			);
	}

	public static void main(String[] args) {
		new CadastroVacinaTela();

	}

}
