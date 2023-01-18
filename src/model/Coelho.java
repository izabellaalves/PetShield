package model;

import java.util.ArrayList;
import java.util.Date;

public class Coelho extends Animal{

	private boolean vacinaMixomatose;
	
	public Coelho(String nome, String data, String sexo, String raca, boolean mixo) {
		this.raca = raca;
		vacinaMixomatose = mixo;
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

	//outros metodos
	
	public void registrarMixomatose(String data) {
		vacinaMixomatose = true;
		Vacina vacina = new Vacina("Mixomatose", data);
		vacinas.add(vacina);
	}
	
	@Override
	public String toString() {
		String mixo;
		if (vacinaMixomatose == true) {
			mixo = "Possui";
		} else {
			mixo = "Não possui";
		}
		return mixo;
	}

	@Override
	public String atualizaDado(String string) {
		if (string == "Possui") {
			vacinaMixomatose = true;
		} else {
			vacinaMixomatose = false;
		}
		return string;
	}
}
