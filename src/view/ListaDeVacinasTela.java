package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import controllers.CadastroResponsavelController;

/**
 * Classe que define a tela em que sera possivel ver toda a lista de vacinas de determinado animal.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class ListaDeVacinasTela extends JFrame{
	
	private JTextField inputBuscarAnimal;
	private CadastroResponsavelController controller = new CadastroResponsavelController() ;
	JList list = new JList();
	
	/**
	 * Metodo construtor que recebe a lista de vacinas do animal e exibe atraves da interface grafica.
	 * @param i Index do animal no ArrayList de animais do responsavel.
	 * 
	 */
	public ListaDeVacinasTela(int i) {
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
		
		
		
		list.setModel(controller.listarVacinas(i));
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelMenor.add(scrollPane1, BorderLayout.CENTER);
		list.addListSelectionListener(
			new ListSelectionListener() {

				@Override
				public void valueChanged(ListSelectionEvent e) {
					Object src = e.getSource();
					
					if(e.getValueIsAdjusting() && src == list) {
						controller.mostrarDadosVacina(list.getSelectedValue().toString(), i);
						dispose();
					
				}
				
				}
			}
		);
		
		
		panelMenor.add(new JScrollPane(list));
		
		JLabel titulo = new JLabel("Vacinas");
		titulo.setBounds(179, 27, 140, 14);
		getContentPane().add(titulo);
		titulo.setFont(new Font("Monospaced", Font.BOLD, 18));
		
		
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
}
