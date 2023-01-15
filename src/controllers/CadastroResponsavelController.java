package controllers;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Animal;
import model.Cachorro;
import model.Gato;
import model.Responsavel;
import view.*;

public class CadastroResponsavelController{

	private static final long serialVersionUID = 1L;
	
	public static Responsavel responsavel21;
	
	public void cadastrarResponsavel(String n, String em, String end, Double tel) {
		
		responsavel21 = new Responsavel(n, em, end, tel);
		System.out.println(responsavel21.getNomeResponsavel() + " - " +  responsavel21.getEmailResponsavel());
		new MenuTela();
	};
	
		
		public void cadastrarCachorro(String nome, String data, String sexo, String raca, String porte) {
			
			Cachorro cachorro = new Cachorro(nome, data, sexo, raca, porte);
			responsavel21.cadastrarAnimal(cachorro);
			System.out.println(responsavel21.getAnimais());
			new MenuTela();
		}
		
		public void cadastrarGato(String nome, String data, String sexo, String raca, String pelagem) {
			
			Gato gato = new Gato(nome, data, sexo, raca, pelagem);
			responsavel21.cadastrarAnimal(gato);
			System.out.println(responsavel21.getAnimais());
			System.out.println(listarAnimais());
			new MenuTela();
		}
		
		//public void cadastrarCoelho(String nome, String raca, String sexo)
		
		
		public DefaultListModel<String> listarAnimais() {
			DefaultListModel<String> names = new DefaultListModel<>();
			int size = responsavel21.getAnimais().size();
			
			for(int i = 0; i < size ; i++) {
				String name = responsavel21.getAnimais().get(i).getNome();
				names.addElement(name);
			}
			return names;
			
		}
}
