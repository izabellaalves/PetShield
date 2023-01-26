package Testes;

import static org.junit.jupiter.api.Assertions.*;
import controllers.*;
import model.*;
import view.*;

import org.junit.jupiter.api.Test;

/**
 * Classe responsavel por testar o metodo usado para criar um animal e adicionar este animal no ArrayList de animais do responsavel.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
class TestCreatAnimal {
	
	CadastroResponsavelController controller = new CadastroResponsavelController();
	
	void infos() {
		
		controller.cadastrarResponsavel("Junior", "jr@gmail.com", "Rua tal, casa tal", (double) 2130042699);
		
	}

	@Test
	void testeCadastrarAnimal() {
		
		infos();
		
		Cachorro cachorro;
		
		String nC = "Totó";
		String dN = "21/01/2023";
		String sexo = "Macho";
		String raca = "Pinscher";
		String porte = "Pequeno";
		
		controller.cadastrarCachorro(nC, dN, sexo, raca, porte);
		
		//Retorna falso se a lista de animais do responsável estiver va
		
		assertFalse(controller.responsavel21.getAnimais().isEmpty());

	}

}
