package exercicio4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class Exercicio {

	private Banco caixaEconomica;
	
	@Before
	public void configurar(){
		SistemaBancario sistemaBancario = new SistemaBancario();
		caixaEconomica = sistemaBancario.criarBanco("Caixa", Moeda.BRL);
	}
	
	@Test
	public void testarCaixaEconomica(){
		Assert.assertEquals("Caixa", caixaEconomica.obterNome());
		Assert.assertEquals(Moeda.BRL, caixaEconomica.obterMoeda());
	}
	
	@Test
	public void testarTrindade(){
		Agencia trindade = caixaEconomica.criarAgencia("Trindade");
		Assert.assertEquals("001", trindade.obterIdentificador());
		Assert.assertEquals("Trindade", trindade.obterNome());	
		Assert.assertEquals(caixaEconomica, trindade.obterBanco());
		
	}
}
