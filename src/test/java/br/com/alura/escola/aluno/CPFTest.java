package br.com.alura.escola.aluno;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.CPF;

class CPFTest {

	@Test
	void naoDeveriaCriarCPFComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(null));
		
		assertThrows(IllegalArgumentException.class,
				() -> new CPF(""));
		
		assertThrows(IllegalArgumentException.class,
				() -> new CPF("12345678900"));
	}

	@Test
	void deveriaPermitirCriarCPFComNumeroValido() {
		String numero = "123.456.789-00";
		CPF cpf = new CPF(numero);
		assertEquals(numero, cpf.getNumero());
	}

}
