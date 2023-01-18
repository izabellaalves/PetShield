package controllers;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Animal;
import model.Cachorro;
import model.Coelho;
import model.Gato;
import model.Responsavel;
import model.Vacina;
import view.*;

public class CadastroResponsavelController{

	private static final long serialVersionUID = 1L;
	
	
	public static Responsavel responsavel21;
	public static int i;
	public Cachorro cachorro;
	
	
	public void cadastrarResponsavel(String n, String em, String end, Double tel) {
		
		responsavel21 = new Responsavel(n, em, end, tel);
		System.out.println(responsavel21.getNomeResponsavel() + " - " +  responsavel21.getEmailResponsavel());
		new MenuTela();
	};
	
		
		public void cadastrarCachorro(String nome, String data, String sexo, String raca, String porte) {
			
			cachorro = new Cachorro(nome, data, sexo, raca, porte);
			responsavel21.cadastrarAnimal(cachorro);
			new MenuTela();
		}
		
		public void cadastrarGato(String nome, String data, String sexo, String raca, String pelagem) {
			
			Gato gato = new Gato(nome, data, sexo, raca, pelagem);
			responsavel21.cadastrarAnimal(gato);
			new MenuTela();
		}
		
		public void cadastrarCoelho(String nome, String data, String sexo, String raca, Boolean mixo) {
			
			Coelho coelho = new Coelho(nome, data, sexo, raca, mixo);
			responsavel21.cadastrarAnimal(coelho);
			new MenuTela();
		}
		
		public void cadastrarVacina(String tipo, String data, int i) {
			
			Vacina vacina = new Vacina(tipo, data);
			responsavel21.getAnimais().get(i).cadastrarVacina(vacina);
		}
		
		public DefaultListModel<String> listarAnimais() {
			DefaultListModel<String> names = new DefaultListModel<>();
			int size = responsavel21.getAnimais().size();
			
			for(int i = 0; i < size ; i++) {
				String name = responsavel21.getAnimais().get(i).getNome();
				names.addElement(name);
			}
			return names;
		}
		
		public DefaultListModel<String> listarVacinas(int i) {
			DefaultListModel<String> names = new DefaultListModel<>();
			int size = responsavel21.getAnimais().get(i).getVacinas().size();
			for(int k = 0; k < size ; k++) {
				String name = responsavel21.getAnimais().get(i).getVacinas().get(k).getTipo();
				names.addElement(name);
				}
			return names;
		}
		
		public void mostrarDados(String nome) {
			for (i = 0; i < responsavel21.getAnimais().size(); i++) {
				if(responsavel21.getAnimais().get(i).getNome().equals(nome)) {
					if (responsavel21.getAnimais().get(i).getEspecie() == "Cachorro") {
						new DadosCachorroTela(i);
					} else if (responsavel21.getAnimais().get(i).getEspecie() == "Gato") {
						new DadosGatoTela(i);
					} else if (responsavel21.getAnimais().get(i).getEspecie() == "Coelho") {
						new DadosCoelhoTela(i);
					}
				}
			
			}
		}
		
		public void mostrarDadosVacina(String nome, int posAnimal) {
			
			for (int k = 0; k < responsavel21.getAnimais().get(posAnimal).getVacinas().size(); k++) {
				if(responsavel21.getAnimais().get(posAnimal).getVacinas().get(k).getTipo().equals(nome)) {
					System.out.println(responsavel21.getAnimais().get(posAnimal).getVacinas().get(k).getTipo());
					new DadosVacinaTela(posAnimal, k);
				}
			}
			
		}
		
		public void editarDadosCachorro(int i, String nome, String data, String sexo, String raca, String porte) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(porte);
		}
		
		public void editarDadosGato(int i, String nome, String data, String sexo, String raca, String pelagem) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(pelagem);
		}
		
		public void editarDadosCoelho(int i, String nome, String data, String sexo, String raca, String mixo) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(mixo);
		}
		
		public void editarVacina(int posAnimal, int posVacina, String tipo, String data) {
				responsavel21.getAnimais().get(posAnimal).getVacinas().get(posVacina).setTipo(tipo);
				responsavel21.getAnimais().get(posAnimal).getVacinas().get(posVacina).setDataVacinacao(data);
		}
		
		public void excluirAnimal(Animal animal) {
			responsavel21.excluirAnimal(animal);
		}
		
		public void excluirVacina(Vacina vacina, int i) {
			responsavel21.getAnimais().get(i).excluirVacina(vacina);
		}


		public void buscarAnimal(String string) {
			for (i = 0; i < responsavel21.getAnimais().size(); i++) {
				if(responsavel21.getAnimais().get(i).getNome().equals(string)) {
					if (responsavel21.getAnimais().get(i).getEspecie() == "Cachorro") {
						new DadosCachorroTela(i);
					} else if (responsavel21.getAnimais().get(i).getEspecie() == "Gato") {
						new DadosGatoTela(i);
					} else if (responsavel21.getAnimais().get(i).getEspecie() == "Coelho") {
						new DadosCoelhoTela(i);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Nenhum animal cadastrado com esse nome.");
					new ListaAnimaisTela();
				}
			}
			
		}
		
		
}
