package model;

import java.util.Date;

public class Vacina {
 
	private String tipo;
	private Date dataVacinacao;
	
	public Vacina(String tipo, Date data) {
		this.tipo = tipo;
		dataVacinacao = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getDataVacinacao() {
		return dataVacinacao;
	}

	public void setDataVacinacao(Date dataVacinacao) {
		this.dataVacinacao = dataVacinacao;
	}
	
	
}
