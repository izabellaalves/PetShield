package model;

import java.util.Date;

public class Gato extends Animal{

	private String pelagem;
	
	public Gato(String raca, String nome, String data, String sexo, String pelagem) {
		this.raca = raca;
		this.pelagem = pelagem;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Gato";
	}

	public String getRacaGato() {
		return raca;
	}

	public void setRacaGato(String racaGato) {
		this.raca = raca;
	}
	
	//gets e sets Animal 
	
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
