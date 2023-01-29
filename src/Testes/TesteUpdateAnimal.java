package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controllers.CadastroResponsavelController;
import model.Cachorro;

/**
 * Classe responsavel por testar o metodo usado para editar o valor dos atributos de um animal.
 * 
 * @author Izabella Alves Pereira
 * @author Lucas de Oliveira Dias Marques Ferreira
 */
class TesteUpdateAnimal {
	
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
	 * Metodo responsavel por testar o metodo editarDadosCachorro, o teste compara o atributo editado com o valor
	 * usado na edicao.
	 * 
	 */
	@Test
	void testeEditarDadosAnimal() {
		
		infos();
		
		controller.editarDadosCachorro(0, "Thor", "21/01/2023", "Macho", "Pinscher", "Pequeno");
		
		String valorEsperado = "Thor";
		String resultado = controller.responsavel21.getAnimais().get(0).getNome();
		
		assertEquals(valorEsperado, resultado);
		

	}
}
