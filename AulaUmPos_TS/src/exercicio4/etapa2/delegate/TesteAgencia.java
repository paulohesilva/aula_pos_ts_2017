package exercicio4.etapa2.delegate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;

public class TesteAgencia {

	@Test
	public void caixaEconomicaTrindade() throws Exception {
		Banco caixaEconomica = Auxiliar.getBanco("Caixa Econômica",Moeda.BRL);
		Agencia caixaEconomicaTrindade = Auxiliar.getAgencia(caixaEconomica,"Trindade");
		assertEquals("001", caixaEconomicaTrindade.obterIdentificador());
		assertEquals("Trindade", caixaEconomicaTrindade.obterNome());
		assertEquals(caixaEconomica, caixaEconomicaTrindade.obterBanco());
	}

}
