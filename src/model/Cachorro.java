package model;

import java.util.Date;

public class Cachorro extends Animal {
	
	private String porte;
	
	public Cachorro(String raca, String porte, String nome, String data, String sexo) {
		this.raca = raca;
		this.porte = porte;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Cachorro";
	}
	
	public String toString() {
		return "Especie: " + especie + ", Raça:" + raca;
	}

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
	
	// gets e sets da classe Animal
	
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
