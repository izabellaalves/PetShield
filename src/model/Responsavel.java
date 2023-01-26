package model;
import java.util.ArrayList;

/**
 * Classe que define o responsavel pelos animais, o responsavel cadastrado controlara as outras classes.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class Responsavel {
	
	private String nomeResponsavel;
	private String emailResponsavel;
	private String endereco;
	private double telefone;
	private ArrayList<Animal> animais;
	
	/**
	 * Construtor padrao para registrar um responsavel.
	 * 
	 * @param nome Nome do responsavel.
	 * @param email Email do responsavel.
	 * @param endereco Endereco do responsavel.
	 * @param tele Telefone do responsavel.
	 */
	public Responsavel(String nome, String email, String endereco, double tele) {
		nomeResponsavel = nome;
		emailResponsavel = email;
		this.endereco = endereco;
		telefone = tele;
		this.animais = new ArrayList<>();
	
	}
	
	//gets e sets


	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	
	/**
	 * Metodo para adicionar um animal na lista de animais do responsavel.
	 * 
	 * @param animal Animal que sera cadastrado.
	 */
	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	/**
	 * Metodo para buscar um animal na lista de animais do responsavel.
	 * 
	 * @param nome Nome do animal que se procura.
	 */
	public void buscarAnimal(String nome) {
		
		for (int i = 0; i < animais.size(); i++) {
			if(animais.get(i).getNome().equals(nome)) {
					System.out.println(animais.get(i).getNome() + " | " + animais.get(i).getEspecie() + " | " 
					+ animais.get(i).getDataDeNascimento() + " | " + animais.get(i).getSexo() + " | " + animais.get(i).getVacinas());
			}
		
		}
	}
	
	/**
	 * Metodo para excluir um animal da lista de animais do responsavel.
	 * 
	 * @param animal Nome do animal que se deseja excluir.
	 */
	public void excluirAnimal(Animal animal) {
		for (int i = 0; i < animais.size(); i++) {
			if(animais.get(i).equals(animal)) {
					animais.remove(animais.get(i));
			}
		}
	}
	
	
	
	
	
}
	
