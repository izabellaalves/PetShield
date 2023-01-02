package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class DadosVacinaTela extends JFrame{
	
	//N APARECE JLABEL DA DATAAAAAAAAAAAAAAAAAAAAAAAAAA
	
	private JTextField inputBuscarAnimal;
	private JTextField textField;
	
	
	public DadosVacinaTela() {
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
		
		JLabel titulo = new JLabel("Dados");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(144, 24, 63, 14);
		panelMenor.add(titulo);
		
		JLabel lblTipoVacina = new JLabel("Tipo");
		lblTipoVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblTipoVacina.setBounds(38, 62, 63, 19);
		panelMenor.add(lblTipoVacina);
		
		inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(108, 61, 203, 20);
		panelMenor.add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnExcluir.setForeground(new Color(0, 0, 0));
		btnExcluir.setBackground(new Color(39, 222, 145));
		btnExcluir.setBounds(175, 249, 136, 23);
		panelMenor.add(btnExcluir);
		
		JLabel lblDataVacina = new JLabel("Data");
		lblDataVacina.setForeground(new Color(0, 0, 0));
		lblDataVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblDataVacina.setBounds(38, 103, 63, 19);
		panelMenor.add(lblDataVacina);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(108, 104, 203, 20);
		panelMenor.add(textField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(29, 249, 136, 23);
		panelMenor.add(btnSalvar);
		
	}

	public static void main(String[] args) {
		new DadosVacinaTela();

	}

}
