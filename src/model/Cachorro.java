package model;

import java.util.ArrayList;
import java.util.Date;

public class Cachorro extends Animal {
	
	private String porte;
	
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
	
	
}
