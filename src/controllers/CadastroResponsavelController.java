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

/**
 * Classe intermediaria que servira para ligar as telas disponiveis no package view com as classes disponiveis na package controller.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class CadastroResponsavelController{

	private static final long serialVersionUID = 1L;
	public static Responsavel responsavel21;
	public static int i;
	public Cachorro cachorro;
	
	/**
	 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Responsavel.
	 * @param nome Nome do responsavel.
	 * @param email Email do responsavel.
	 * @param endereco Endereco do responsavel.
	 * @param tele Telefone do responsavel.
	 * 
	 */
		public void cadastrarResponsavel(String n, String em, String end, Double tel) {
			responsavel21 = new Responsavel(n, em, end, tel);
			new MenuTela();
		};
		
		
		/**
		 * Metodo responsavel por pre cadastrar dados pro usuario.
		 */
		public void preCadastro() {
			cadastrarCachorro("Totó", "20/03/2022", "macho", "pinscher", "pequeno");
			cadastrarGato("Fenix", "01/02/2021", "macho", "siamês", "sólida");
			cadastrarCoelho("Flora", "12/01/2022", "fêmea", "angorá", true);
			
			cadastrarVacina("Gripe canina", "08/12/2022", 0);
			cadastrarVacina("V3", "08/12/2022",1);
			cadastrarVacina("Pasteurelose", "08/12/2022", 2);
		}
	
		/**
		 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Cachorro.
		 * @param nome Nome do cachorro.
		 * @param data Data de nascimento do cachorro.
		 * @param sexo Sexo do cachorro.
		 * @param raca Raca do cachorro.
		 * @param porte Porte do cachorro.
		 * 
		 */
		public void cadastrarCachorro(String nome, String data, String sexo, String raca, String porte) {
			
			cachorro = new Cachorro(nome, data, sexo, raca, porte);
			responsavel21.cadastrarAnimal(cachorro);
		}
		
		/**
		 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Gato.
		 * 
		 * @param nome Nome do coelho.
		 * @param data Data de nascimento do coelho.
		 * @param sexo Sexo do coelho.
		 * @param raca Raca do coelho.
		 * @param pelagem Pelagem do gato.
		 */
		public void cadastrarGato(String nome, String data, String sexo, String raca, String pelagem) {
			
			Gato gato = new Gato(nome, data, sexo, raca, pelagem);
			responsavel21.cadastrarAnimal(gato);
		}
		
		/**
		 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Coelho.
		 * @param nome Nome do coelho.
		 * @param data Data de nascimento do coelho.
		 * @param sexo Sexo do coelho.
		 * @param raca Raca do coelho.
		 * @param mixo Define se o animal possui ou nao a vacina Mixomatose.
		 */
		public void cadastrarCoelho(String nome, String data, String sexo, String raca, Boolean mixo) {
			
			Coelho coelho = new Coelho(nome, data, sexo, raca, mixo);
			responsavel21.cadastrarAnimal(coelho);
		}
		
		/**
		 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Vacina.
		 * 
		 * @param tipo Tipo da vacina.
		 * @param data Data de aplicacao da vacina.
		 */
		public void cadastrarVacina(String tipo, String data, int i) {
			
			Vacina vacina = new Vacina(tipo, data);
			responsavel21.getAnimais().get(i).cadastrarVacina(vacina);
		}
		

		/**
		 * Metodo responsavel por gerar um DefaultListModel com os elementos que estao no ArrayList de animais do responsavel.
		 * 
		 */
		public DefaultListModel<String> listarAnimais() {
			DefaultListModel<String> names = new DefaultListModel<>();
			int size = responsavel21.getAnimais().size();
			
			for(int i = 0; i < size ; i++) {
				String name = responsavel21.getAnimais().get(i).getNome();
				names.addElement(name);
			}
			return names;
		}
		
		/**
		 * Metodo responsavel por gerar um DefaultListModel com os elementos que estao no ArrayList de vacinas de um animal.
		 * @param i Index do animal no ArrayList de animais do responsavel.
		 * 
		 */
		public DefaultListModel<String> listarVacinas(int i) {
			DefaultListModel<String> names = new DefaultListModel<>();
			int size = responsavel21.getAnimais().get(i).getVacinas().size();
			for(int k = 0; k < size ; k++) {
				String name = responsavel21.getAnimais().get(i).getVacinas().get(k).getTipo();
				names.addElement(name);
				}
			return names;
		}
		

		/**
		 * Metodo responsavel por encontrar determinado animal no ArrayList de animais do responsavel e instanciar uma nova tela
		 * com os dados do animal.
		 * @param nome Nome do animal a qual devem pertencer os dados.
		 * 
		 */
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
		
		/**
		 * Metodo responsavel por encontrar determinada vacina no ArrayList de vacinas de determinado animal e instanciar uma nova tela
		 * com os dados da vacina.
		 * @param nome Tipo da vacina a qual os dados devem pertencer.
		 * @param posAnimal Posicao do animal no ArrayList de animais do responsavel.
		 * 
		 */
		public void mostrarDadosVacina(String nome, int posAnimal) {
			
			for (int k = 0; k < responsavel21.getAnimais().get(posAnimal).getVacinas().size(); k++) {
				if(responsavel21.getAnimais().get(posAnimal).getVacinas().get(k).getTipo().equals(nome)) {
					System.out.println(responsavel21.getAnimais().get(posAnimal).getVacinas().get(k).getTipo());
					new DadosVacinaTela(posAnimal, k);
				}
			}
			
		}
		
		/**
		 * Metodo responsavel por editar o valor dos atributos de um objeto Cachorro.
		 * @param i Index do animal no ArrayList de vacinas do animal.
		 * @param nome Nome do cachorro.
		 * @param data Data de nascimento do cachorro.
		 * @param sexo Sexo do cachorro.
		 * @param raca Raca do cachorro.
		 * @param porte Porte do cachorro.
		 * 
		 */
		public void editarDadosCachorro(int i, String nome, String data, String sexo, String raca, String porte) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(porte);
		}
		
		/**
		 * Metodo responsavel por editar o valor dos atributos de um objeto Gato.
		 * 
		 * @param i Index do animal no ArrayList de vacinas do animal.
		 * @param nome Nome do coelho.
		 * @param data Data de nascimento do coelho.
		 * @param sexo Sexo do coelho.
		 * @param raca Raca do coelho.
		 * @param pelagem Pelagem do gato.
		 */
		public void editarDadosGato(int i, String nome, String data, String sexo, String raca, String pelagem) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(pelagem);
		}
		
		/**
		 * Metodo responsavel por editar o valor dos atributos de um objeto Coelho.
		 * 
		 * @param i Index do animal no ArrayList de vacinas do animal.
		 * @param nome Nome do coelho.
		 * @param data Data de nascimento do coelho.
		 * @param sexo Sexo do coelho.
		 * @param raca Raca do coelho.
		 * @param mixo Define se o animal possui ou nao a vacina Mixomatose.
		 */
		public void editarDadosCoelho(int i, String nome, String data, String sexo, String raca, String mixo) {
			responsavel21.getAnimais().get(i).setNome(nome);
			responsavel21.getAnimais().get(i).setDataDeNascimento(data);
			responsavel21.getAnimais().get(i).setSexo(sexo);
			responsavel21.getAnimais().get(i).setRaca(raca);
			responsavel21.getAnimais().get(i).atualizaDado(mixo);
		}
		
		/**
		 * Metodo responsavel por editar o valor dos atributos de um objeto Vacina.
		 * 
		 * @param tipo Tipo da vacina.
		 * @param data Data de aplicacao da vacina.
		 */
		public void editarVacina(int posAnimal, int posVacina, String tipo, String data) {
				responsavel21.getAnimais().get(posAnimal).getVacinas().get(posVacina).setTipo(tipo);
				responsavel21.getAnimais().get(posAnimal).getVacinas().get(posVacina).setDataVacinacao(data);
		}
		
		/**
		 * Metodo responsavel por dar funcionalidade ao botao de excluir um animal.
		 * 
		 * @param animal Animal que sera excluido.
		 */
		public void excluirAnimal(Animal animal) {
			responsavel21.excluirAnimal(animal);
		}
		
		/**
		 * Metodo responsavel por dar funcionalidade ao botao de excluir uma vacina.
		 * 
		 * @param vacina Vacina que sera excluida.
		 */
		public void excluirVacina(Vacina vacina, int i) {
			responsavel21.getAnimais().get(i).excluirVacina(vacina);
		}
		
		/**
		 * Metodo responsavel por receber um nome de um animal e abrir uma tela com os dados do animal pesquisado.
		 * 
		 * @param string Nome do animal pesquisado.
		 */
		public void buscarAnimal(String string) {
			String nome = string;
				for (i = 0; i < responsavel21.getAnimais().size(); i++) {
					if(responsavel21.getAnimais().get(i).getNome().equals(nome)) {
						if (responsavel21.getAnimais().get(i).getEspecie() == "Cachorro") {
							new DadosCachorroTela(i);
							break;
						} else if (responsavel21.getAnimais().get(i).getEspecie() == "Gato") {
							new DadosGatoTela(i);
							break;
						} else if (responsavel21.getAnimais().get(i).getEspecie() == "Gato"){
							new DadosCoelhoTela(i);
							break;
						}
					}
				}
		}
}	
