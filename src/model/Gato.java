package model;

import java.util.ArrayList;

public class Gato extends Animal{

	private String pelagem;
	
	public Gato(String nome, String data, String sexo, String raca, String pelagem) {
		this.raca = raca;
		this.pelagem = pelagem;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Gato";
		this.vacinas = new ArrayList<>();
	}
	
	//gets e sets

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}

	//outros metodos
	
	public String atualizaDado(String s) {
		setPelagem(s);
		return getPelagem();
	}
	
	@Override
	public String toString() {
		return getPelagem();
	}

	
}
