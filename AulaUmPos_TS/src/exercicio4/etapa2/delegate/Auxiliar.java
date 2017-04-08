package exercicio4.etapa2.delegate;

import br.ufsc.ine.leb.sistemaBancario.Agencia;
import br.ufsc.ine.leb.sistemaBancario.Banco;
import br.ufsc.ine.leb.sistemaBancario.Conta;
import br.ufsc.ine.leb.sistemaBancario.Moeda;
import br.ufsc.ine.leb.sistemaBancario.SistemaBancario;

public class Auxiliar {

	public static Banco getBanco(String string, Moeda moeda) {
		SistemaBancario sistemaBancario = new SistemaBancario();
		Banco banco = sistemaBancario.criarBanco(string, moeda);
		return banco;
	}

	public static Agencia getAgencia(Banco banco, String nomeAgencia) {
		return banco.criarAgencia(nomeAgencia);
	}

	public static Conta getConta(Agencia caixaEconomicaTrindade, String titular) {
		return caixaEconomicaTrindade.criarConta(titular);
	}

}
