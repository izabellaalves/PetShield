package model;

import java.util.Date;

public class Vacina {
 
	private String tipo;
	private String dataVacinacao;
	
	//gets e sets
	
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
