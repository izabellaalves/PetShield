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

/**
 * Classe que define a tela em que sera possivel ver os dados de determinada vacina, alem de editar e excluir esta vacina.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class DadosVacinaTela extends JFrame{
	
	private JTextField inputBuscarAnimal;
	private JTextField textField;
	CadastroResponsavelController controller = new CadastroResponsavelController();
	
	/**
	 * Metodo construtor que define espacos para edicao dos dados da vacina, alem de botoes para realizar a edicao e a exclusao da vacina.
	 * 
	 * @param i Index do animal no ArrayList de animais do responsavel.
	 * @param k Index da vacina no ArrayList de vacinas do animal.
	 */
	public DadosVacinaTela(int i, int k) {
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
		
		JLabel titulo = new JLabel("Dados da vacina");
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		titulo.setBounds(96, 21, 245, 14);
		panelMenor.add(titulo);
		
		JLabel lblTipoVacina = new JLabel("Tipo");
		lblTipoVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblTipoVacina.setBounds(38, 62, 63, 19);
		panelMenor.add(lblTipoVacina);
		
		inputBuscarAnimal = new JTextField(controller.responsavel21.getAnimais().get(i).getVacinas().get(k).getTipo());
		inputBuscarAnimal.setBounds(108, 61, 203, 20);
		panelMenor.add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnExcluir.setForeground(new Color(0, 0, 0));
		btnExcluir.setBackground(new Color(39, 222, 145));
		btnExcluir.setBounds(175, 249, 136, 23);
		panelMenor.add(btnExcluir);
		btnExcluir.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				controller.excluirVacina(controller.responsavel21.getAnimais().get(i).getVacinas().get(k), i);
				JOptionPane.showMessageDialog(null, "Vacina excluída com sucesso!");
				new ListaDeVacinasTela(i);
				dispose();
			}
		}
		);
		
		JLabel lblDataVacina = new JLabel("Data");
		lblDataVacina.setForeground(new Color(0, 0, 0));
		lblDataVacina.setFont(new Font("Monospaced", Font.PLAIN, 15));
		lblDataVacina.setBounds(38, 103, 63, 19);
		panelMenor.add(lblDataVacina);
		
		textField = new JTextField(controller.responsavel21.getAnimais().get(i).getVacinas().get(k).getDataVacinacao());
		textField.setColumns(10);
		textField.setBounds(108, 104, 203, 20);
		panelMenor.add(textField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setFont(new Font("Monospaced", Font.ITALIC, 13));
		btnSalvar.setBackground(new Color(39, 222, 145));
		btnSalvar.setBounds(29, 249, 136, 23);
		panelMenor.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				controller.editarVacina(i, k, inputBuscarAnimal.getText().toString(), textField.getText().toString());
				JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
				new ListaDeVacinasTela(i);
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
						new ListaDeVacinasTela(i);
						dispose();
					}
				}
			);
	}

}
