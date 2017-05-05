package exercicio5;

import org.junit.Assert;
import org.junit.Test;

import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import exercicio4.etapa2.delegate.Auxiliar;

public class Exercicio {
	
	@Test
	public void bancoDoBrasilNomeEMoeda(){
		Banco bancoDoBrasil = Auxiliar.getBanco("Banco Do Brasil", Moeda.BRL);
		Assert.assertEquals(Moeda.BRL, bancoDoBrasil.obterMoeda());
		Assert.assertEquals("Banco Do Brasil", bancoDoBrasil.obterNome());
	}
	
}
