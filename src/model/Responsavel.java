package model;

public class Responsavel {
	
	private String nomeResponsavel;
	private String emailResponsavel;
	private String endereco;
	private double telefone;
	private Animal[] animais;
	
	public Responsavel(String nome, String email, String endereco, double tele) {
		nomeResponsavel = nome;
		emailResponsavel = email;
		this.endereco = endereco;
		telefone = tele;
	
	}

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

	public Animal[] getAnimais() {
		return animais;
	}

	public void setAnimais(Animal[] animais) {
		this.animais = animais;
	}
	
	
	
	
}
