package model;

import java.util.ArrayList;

/**
 * Classe herdeira de {@link model.Animal}, armazena as informacoes de um animal da especie gato.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class Gato extends Animal{

	private String pelagem;
	
	/**
	 * Construtor padrão para criar uma nova instancia do objeto gato.
	 * 
	 * @param nome Nome do coelho.
	 * @param data Data de nascimento do coelho.
	 * @param sexo Sexo do coelho.
	 * @param raca Raca do coelho.
	 * @param pelagem Pelagem do gato.
	 */
	public Gato(String nome, String data, String sexo, String raca, String pelagem) {
		this.raca = raca;
		this.pelagem = pelagem;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Gato";
		this.vacinas = new ArrayList<>();
	}
	
	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	
	/**
	 * Metodo herdeiro de {@link model.Animal}, atualiza a pelagem do cachorro.
	 * @params s Valor que sera setado na pelagem do gato.
	 * 
	 */
	public String atualizaDado(String s) {
		setPelagem(s);
		return getPelagem();
	}
	
	@Override
	public String toString() {
		return getPelagem();
	}

	
}
