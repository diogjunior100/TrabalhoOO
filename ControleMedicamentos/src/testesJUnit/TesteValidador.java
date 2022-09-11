package testesJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.jupiter.api.Test.*;

import controle.*;

class TesteValidador {
	
	@Test
	//teste se o nome do paciente não é null;
	void testeNomePaciente() {
		String nomeCorreto;
		nomeCorreto = "Henrique";
		assertTrue(ControleDados.testeNome(nomeCorreto));
		assertFalse(ControleDados.testeNome(null));
	}
	
	//teste se mls total nao e do tipo String
	@Test
	void testeMlsTotal() {
		String valorErrado = "10";
		int valorCerto = 10;
		
		//assertEquals();
	}
}
