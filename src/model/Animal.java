package model;

import java.util.Date;

public abstract class Animal {
	protected String nome;
	protected String dataDeNascimento;
	protected String especie;
	protected String sexo;
	protected Vacina[] vacinas;
	protected String raca;
	
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
	
}
