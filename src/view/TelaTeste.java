package view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;

import controllers.*;
import model.*;

public class TelaTeste extends JFrame{
	
	private CadastroResponsavelController controller = new CadastroResponsavelController() ;
	
	private static final long serialVersionUID = 1L;  
	 
	  public TelaTeste(){
	    super("Controle de Vacinas");
		
		getContentPane().setBackground(new Color(244, 227, 157));
		setBounds(100, 100, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		getContentPane().setLayout(null);
		
		JPanel panelMenor = new JPanel();
		panelMenor.setBounds(86, 106, 314, 180);
		panelMenor.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(panelMenor);
		panelMenor.setLayout(new BorderLayout());
		
		JButton btnCadastrarVacina = new JButton("Cadastrar vacina");
		btnCadastrarVacina.setBounds(171, 315, 141, 23);
		getContentPane().add(btnCadastrarVacina);
		
	    JList list = new JList();
		//list.setModel(controller.listarAnimais());
		JScrollPane scrollPane1 = new JScrollPane(list);
		panelMenor.add(scrollPane1, BorderLayout.CENTER);
	 
		JButton btnSalvar = new JButton("Salvar");
		
	  }
	   
	  public static void main(String args[]){
	   TelaTeste app = new TelaTeste();
	    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	

}
