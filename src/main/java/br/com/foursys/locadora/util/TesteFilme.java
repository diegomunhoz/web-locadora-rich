package br.com.foursys.locadora.util;

import br.com.foursys.locadora.bean.Filme;
import br.com.foursys.locadora.controller.FilmeController;

public class TesteFilme {

	public static void main(String[] args) {
		
		Filme filme = new Filme();
		filme.setNome("TESTE");
		filme.setDiretor("TESTE");
		filme.setDisponivel("TESTE");
		filme.setPromocao("TESTE");
		filme.setGenero("TESTE");
		filme.setValor(123);
		filme.setValorPromocao(123.0);
		filme.setFaixaEtaria(12);
		filme.setAnoLancamento("1984");
		
		new FilmeController().salvar(filme);
		
	}

}
