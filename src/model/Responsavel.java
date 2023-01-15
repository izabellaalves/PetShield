package model;

import java.util.ArrayList;

public class Responsavel {
	
	private String nomeResponsavel;
	private String emailResponsavel;
	private String endereco;
	private double telefone;
	private ArrayList<Animal> animais;
	
	public Responsavel(String nome, String email, String endereco, double tele) {
		nomeResponsavel = nome;
		emailResponsavel = email;
		this.endereco = endereco;
		telefone = tele;
		this.animais = new ArrayList<>();
	
	}
	
	//gets e sets

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public void setEmailResponsavel(String emailResponsavel) {
		this.emailResponsavel = emailResponsavel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getTelefone() {
		return telefone;
	}

	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	//outros metodos

	public void cadastrarAnimal(Animal animal) {
		animais.add(animal);
	}
	
	public void buscarAnimal(String nome) {
		
		for (int i = 0; i < animais.size(); i++) {
			if(animais.get(i).getNome().equals(nome)) {
					System.out.println(animais.get(i).getNome() + " | " + animais.get(i).getEspecie() + " | " 
					+ animais.get(i).getDataDeNascimento() + " | " + animais.get(i).getSexo() + " | " + animais.get(i).getVacinas());
			}
		
		}
	}
	
	public void excluirAnimal(Animal animal) {
		for (int i = 0; i < animais.size(); i++) {
			if(animais.get(i).equals(animal)) {
					animais.remove(animais.get(i));
			}
		}
	}
	
	
	
}
	
