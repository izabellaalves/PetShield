package model;

public class Main {

	public static void main(String[] args) {
		
		Responsavel responsavel1 = new Responsavel("João", "joao@gmail.com", "Avenida Nove de Julho, casa 3", 2130042637);
		
		Cachorro cachorro = new Cachorro("Totó", "20/03/2022", "macho", "pinscher", "pequeno");
		Gato gato = new Gato("Fenix", "01/02/2021", "macho", "siamês", "sólida");
		Coelho coelho = new Coelho("Flora", "12/01/2022", "fêmea", "angorá");
		
		responsavel1.cadastrarAnimal(cachorro);
		responsavel1.cadastrarAnimal(gato);
		responsavel1.cadastrarAnimal(coelho);
		
		System.out.println("Animais de " + responsavel1.getNomeResponsavel() + " = " + responsavel1.getAnimais());
		
		Vacina vacinaCachorro = new Vacina("Gripe canina", "08/12/2022");
		Vacina vacinaGato = new Vacina("V3", "08/12/2022");
		Vacina vacinaCoelho = new Vacina("Pasteurelose", "08/12/2022");
		
		cachorro.cadastrarVacina(vacinaCachorro);
		gato.cadastrarVacina(vacinaGato);
		coelho.cadastrarVacina(vacinaCoelho);
		
		System.out.println("Vacinas de " + cachorro.getNome() + " = " + cachorro.getVacinas());
		System.out.println("Vacinas de " + gato.getNome() + " = " + gato.getVacinas());
		System.out.println("Vacinas de " + coelho.getNome() + " = " + coelho.getVacinas());
		
	}

}
