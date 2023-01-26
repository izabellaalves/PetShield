package model;

import java.util.Date;

/**
 * Classe que armazena os dados da vacina dos animais.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
public class Vacina {
 
	private String tipo;
	private String dataVacinacao;
	

	/**
	 * Construtor padrão para criar uma nova instancia do objeto vacina.
	 * 
	 * @param tipo Tipo da vacina.
	 * @param data Data de aplicacao da vacina.
	 */
	public Vacina(String tipo, String data) {
		this.tipo = tipo;
		dataVacinacao = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	public String getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(String dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}

	
	// outros metodos
	
	
	public String toString() {
		return tipo + " - " + dataVacinacao;
	}
	
}
