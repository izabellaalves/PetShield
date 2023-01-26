package model;

import java.util.ArrayList;

/**
 * Classe que armazena as informacoes de cada animal.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
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
	
	
	/**
	 * Metodo responsavel por adicionar uma vacina na lista de vacinas do animal
	 * 
	 * @param vacina Vacina que sera adicionada na lista.
	 */
	public void cadastrarVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	
	/**
	 * Metodo responsavel por buscar uma vacina da lista de vacinas do animal
	 * 
	 * @param tipo Tipo da vacina que esta sendo buscada e sera usado para comparar com o tipo das vacinas da lista.
	 */
	public void buscarVacina(String tipo) {
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).getTipo().equals(tipo)) {
				System.out.println(vacinas.get(i).getTipo() + " | " + vacinas.get(i).getDataVacinacao());
			}
		
		}
	}
	
	/**
	 * Metodo responsavel por excluir uma vacina na lista de vacinas do animal
	 * 
	 * @param vacina Vacina que sera excluida da lista.
	 */
	public void excluirVacina(Vacina vacina) {
		for (int i = 0; i < vacinas.size(); i++) {
			if(vacinas.get(i).equals(vacina)) {
					vacinas.remove(vacinas.get(i));
			}
		}
	}
	
	public abstract String toString();
	
	/**
	 * Metodo abstrado que sera implementado nas classes filhas e servira para alterar um dos atributos do animal.
	 * 
	 * @param string Valor que sera usado para atualizar o atributo.
	 */
	public abstract String atualizaDado(String string);

	
}
