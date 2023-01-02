package model;

import java.util.ArrayList;
import java.util.Date;

public class Coelho extends Animal{

	private boolean vacinaMixomatose;
	private boolean vacinaHemorragica;
	
	public Coelho(String nome, String data, String sexo, String raca) {
		this.raca = raca;
		vacinaMixomatose = false;
		vacinaHemorragica = false;
		this.nome = nome;
		dataDeNascimento = data;
		this.sexo = sexo;
		especie = "Coelho";
		this.vacinas = new ArrayList<>();
	}
	
	//gets e sets

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

	//outros metodos
	
	public void registrarMixomatose(String data) {
		vacinaMixomatose = true;
		Vacina vacina = new Vacina("Mixomatose", data);
		vacinas.add(vacina);
	}
	
	public void registrarHemorragica(String data) {
		vacinaHemorragica = true;
		Vacina vacina = new Vacina("Febre hemorragica", data);
		vacinas.add(vacina);
	}
}
