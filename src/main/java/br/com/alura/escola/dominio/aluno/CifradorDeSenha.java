package br.com.alura.escola.dominio.aluno;

public interface CifradorDeSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCrifrada(String senhaCifrada, String senha);
	
}
