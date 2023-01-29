package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controllers.CadastroResponsavelController;
import model.Cachorro;

/**
 * Classe responsavel por testar o metodo usado para deletar um animal do ArrayList de animais do responsavel.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
class TestDeleteAnimal {

	CadastroResponsavelController controller = new CadastroResponsavelController();

	/**
	 * Metodo responsavel por instanciar um responsavel e cadastrar um cachorro em sua lista de animais.
	 * 
	 */
	void infos() {
	
		controller.cadastrarResponsavel("Junior", "jr@gmail.com", "Rua tal, casa tal", (double) 2130042699);
		
		Cachorro cachorro;
		
		String nC = "Totó";
		String dN = "21/01/2023";
		String sexo = "Macho";
		String raca = "Pinscher";
		String porte = "Pequeno";
		
		controller.cadastrarCachorro(nC, dN, sexo, raca, porte);
	
	}

	/**
	 * Metodo responsavel por testar a classe excluirAnimal, o teste funcionara se a lista estiver vazia, 
	 * o que significa que o animal foi excluido.
	 * 
	 */
	@Test
	void testeExcluirAnimal() {
		
		infos();
		
		controller.excluirAnimal(controller.responsavel21.getAnimais().get(0));
		
		assertTrue(controller.responsavel21.getAnimais().isEmpty());

	}
}
