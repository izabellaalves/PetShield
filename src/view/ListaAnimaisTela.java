package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.CadastroResponsavelController;
import model.Animal;
import model.Responsavel;

/**
 * Classe que define a tela em que sera possivel ver toda a lista de animais do responsavel.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class ListaAnimaisTela extends JFrame implements ListSelectionListener{
	
	private JTextField inputBuscarAnimal;
	private CadastroResponsavelController controller = new CadastroResponsavelController() ;
	JList list = new JList();
	
	/**
	 * Metodo construtor que recebe a lista de animais do responsavel e exibe atraves da interface grafica.
	 * 
	 */
	public ListaAnimaisTela() {
		super("Controle de vacinas");
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(86, 106, 314, 216);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(new BorderLayout());
		
		
		
		list.setModel(controller.listarAnimais());
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelMenor.add(scrollPane1, BorderLayout.CENTER);
		list.addListSelectionListener(this);
		
		
		panelMenor.add(new JScrollPane(list));
		
		JLabel titulo = new JLabel("Seus animais");
		titulo.setBounds(179, 27, 140, 14);
		getContentPane().add(titulo);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		JLabel lblBuscarAnimal = new JLabel("Buscar");
		lblBuscarAnimal.setBounds(53, 64, 63, 14);
		getContentPane().add(lblBuscarAnimal);
		lblBuscarAnimal.setFont(new Font("Monospaced", Font.ITALIC, 15));
		
		inputBuscarAnimal = new JTextField();
		inputBuscarAnimal.setBounds(48, 64, 275, 20);
		getContentPane().add(inputBuscarAnimal);
		inputBuscarAnimal.setColumns(10);
		
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
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(346, 63, 89, 21);
		btnBuscar.setBackground(new Color(39, 222, 145));
		getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						controller.buscarAnimal(inputBuscarAnimal.getText());	
					}
					
				}
		);
		
	}
	
	/**
	 * Metodo que pega o valor do objeto que esta em foco na lista e retorna pro metodo mostrarDados disponivel em {@link controllers.CadastroResponsavelController}.
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == list) {
			controller.mostrarDados(list.getSelectedValue().toString());
			dispose();
		}

	}

}
