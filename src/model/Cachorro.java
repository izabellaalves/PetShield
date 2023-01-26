package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe herdeira de {@link model.Animal}, armazena as informacoes de um animal da especie cachorro.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class Cachorro extends Animal {
	
	private String porte;
	
	/**
	 * Construtor padrão para criar uma nova instancia do objeto cachorro.
	 * 
	 * @param nome Nome do cachorro.
	 * @param data Data de nascimento do cachorro.
	 * @param sexo Sexo do cachorro.
	 * @param raca Raca do cachorro.
	 * @param porte Porte do cachorro.
	 */
	public Cachorro(String nome, String data, String sexo, String raca, String porte) {
		this.raca = raca;
		this.porte = porte;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Cachorro";
		this.vacinas = new ArrayList<>();
	}
	
	//gets e sets
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	

	/**
	 * Metodo herdeiro de {@link model.Animal}, atualiza o porte do cachorro.
	 * @params s Valor que sera setado no porte do cachorro.
	 * 
	 */
	public String atualizaDado(String s) {
		setPorte(s);
		return getPorte();
	}
	
	
	public String toString() {
		return getPorte();
	}
	
	
}
