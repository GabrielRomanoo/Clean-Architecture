package br.com.alura.escola.infra.aluno;

import org.springframework.security.crypto.bcrypt.BCrypt;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

//@Service //Esta classe poderia ser um service, pois ela é uma classe tem uma logica mas que nao pertence a nenhuma classe em especifico, funcinando como um servico para outras classes usa
public class CifradorDeSenhaBcrypt  implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		
		// Gera um sal aleatório
	    String salGerado = BCrypt.gensalt();
	    //System.out.println("O sal gerado foi $" + salGerado + "$");

	    // Gera a senha hasheada utilizando o sal gerado
	    String senhaHasheada = BCrypt.hashpw(senha, salGerado);

	    return senhaHasheada;
	}
	
	//fonte: https://www.alura.com.br/artigos/autenticacao-de-forma-segura-com-criptografia

	@Override
	public boolean validarSenhaCrifrada(String senhaCifrada, String senha) {
		return BCrypt.checkpw(senhaCifrada, senha);
	}

}
