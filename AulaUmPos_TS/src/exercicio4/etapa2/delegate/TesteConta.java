package exercicio4.etapa2.delegate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;

public class TesteConta {

	@Test
	public void joaoCaixaEconomicaTrindade() throws Exception {
		Banco banco = Auxiliar.getBanco("Caixa Econômica", Moeda.BRL);
		Agencia caixaEconomicaTrindade = Auxiliar.getAgencia(banco, "Trindade");
		Conta joaoCaixaEconomicaTrindade = Auxiliar.getConta(caixaEconomicaTrindade,"João");
		assertEquals("0001-4", joaoCaixaEconomicaTrindade.obterIdentificador());
		assertEquals("João", joaoCaixaEconomicaTrindade.obterTitular());
		assertTrue(joaoCaixaEconomicaTrindade.calcularSaldo().zero());
		assertEquals(caixaEconomicaTrindade, joaoCaixaEconomicaTrindade.obterAgencia());
	}

}
