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

	@Test
	void testeCadastrarAnimal() {
		
		infos();
		
		controller.excluirAnimal(controller.responsavel21.getAnimais().get(0));
		
		assertTrue(controller.responsavel21.getAnimais().isEmpty());

	}
}
