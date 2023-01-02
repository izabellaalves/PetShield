package model;

import java.util.ArrayList;

public abstract class Animal {
	protected String nome;
	protected String dataDeNascimento;
	protected String especie;
	protected String sexo;
	protected ArrayList<Vacina> vacinas;
	protected String raca;
	
	// gets e sets
	
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
	public ArrayList<Vacina> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<Vacina> vacinas) {
		this.vacinas = vacinas;
	}

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//outros metodos
	
	public String toString() {
		return nome;
	}
	
	public void cadastrarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
	public void buscarVacina(String tipo) {
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).getTipo().equals(tipo)) {
				System.out.println(vacinas.get(i).getTipo() + " | " + vacinas.get(i).getDataVacinacao());
			}
		
		}
	}
	
	public void excluirVacina(Vacina vacina) {
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).equals(vacina)) {
					vacinas.remove(vacinas.get(i));
			}
		}
	}

	
}
