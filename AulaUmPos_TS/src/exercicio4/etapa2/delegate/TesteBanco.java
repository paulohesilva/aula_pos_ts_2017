package exercicio4.etapa2.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;

public class TesteBanco {

	@Test
	public void caixaEconomica() throws Exception {
		Banco caixaEconomica = Auxiliar.getBanco("Caixa Econômica", Moeda.BRL);
		assertEquals("Caixa Econômica", caixaEconomica.obterNome());
		assertEquals(Moeda.BRL, caixaEconomica.obterMoeda());
	}

}
