package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe herdeira de {@link model.Animal}, armazena as informacoes de um animal da especie coelho.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class Coelho extends Animal{

	private boolean vacinaMixomatose;
	
	/**
	 * Construtor padrão para criar uma nova instancia do objeto coelho.
	 * 
	 * @param nome Nome do coelho.
	 * @param data Data de nascimento do coelho.
	 * @param sexo Sexo do coelho.
	 * @param raca Raca do coelho.
	 * @param mixo Define se o animal possui ou nao a vacina Mixomatose.
	 */
	public Coelho(String nome, String data, String sexo, String raca, boolean mixo) {
		this.raca = raca;
		vacinaMixomatose = mixo;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Coelho";
		this.vacinas = new ArrayList<>();
	}
	
	//gets e sets

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}

	public boolean isVacinaMixomatose() {
		return vacinaMixomatose;
	}

	public void setVacinaMixomatose(boolean vacinaMixomatose) {
		this.vacinaMixomatose = vacinaMixomatose;
	}
	
	@Override
	public String toString() {
		String mixo;
		if (vacinaMixomatose == true) {
			mixo = "Possui";
		} else {
			mixo = "Não possui";
		}
		return mixo;
	}

	@Override
	/**
	 * Metodo herdeiro de {@link model.Animal}, atualiza se o animal possui ou nao a vacina Mixomatose.
	 * @params string Tem o valor "Possui" se o animal possui a vacina e "Não possui" se o animal nao possui a vacina.
	 * 
	 */
	public String atualizaDado(String string) {
		if (string == "Possui") {
			vacinaMixomatose = true;
		} else {
			vacinaMixomatose = false;
		}
		return string;
	}
}
