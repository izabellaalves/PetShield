package model;

import java.util.Date;

public class Coelho extends Animal{

	private boolean vacinaMixomatose;
	private boolean vacinaHemorragica;
	
	public Coelho(String raca, boolean vacinaM, boolean vacinaH, String nome, String data, String sexo) {
		this.raca = raca;
		vacinaMixomatose = vacinaM;
		vacinaHemorragica = vacinaH;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Coelho";
	}

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

	public boolean isVacinaHemorragica() {
		return vacinaHemorragica;
	}

	public void setVacinaHemorragica(boolean vacinaHemorragica) {
		this.vacinaHemorragica = vacinaHemorragica;
	}
	
	// gets e sets Animal 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Vacina[] getVacinas() {
		return vacinas;
	}
	public void setVacinas(Vacina[] vacinas) {
		this.vacinas = vacinas;
	}
}
